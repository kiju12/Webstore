package kni.webstore.repository;

import org.springframework.stereotype.Repository;

import kni.webstore.model.Example;

@Repository
public class ExampleRepo {

	private Example ex1;
	
	public ExampleRepo() {
		ex1 = new Example("Maciej", 21);
	}

	public Example getEx1() {
		return ex1;
	}

	public void setEx1(Example ex1) {
		this.ex1 = ex1;
	}
	
	
}
