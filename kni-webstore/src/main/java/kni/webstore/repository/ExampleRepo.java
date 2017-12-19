package kni.webstore.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kni.webstore.model.Example;

@Repository
public class ExampleRepo {

	private Example ex1;
	private Example ex2;
	private String content;
	private List<Example> list;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ExampleRepo() {
		ex1 = new Example("Maciej", 21, true);
		ex2 = new Example("Kredki", 120, false);
		list = new ArrayList<Example>();
		content = "HWDP POLICJI";

		list.add(ex1);
		list.add(ex2);
	}

	public Example getEx2() {
		return ex2;
	}

	public void setEx2(Example ex2) {
		this.ex2 = ex2;
	}

	public List<Example> getList() {
		return list;
	}

	public void setList(List<Example> list) {
		this.list = list;
	}

	public Example getEx1() {
		return ex1;
	}

	public void setEx1(Example ex1) {
		this.ex1 = ex1;
	}

}
