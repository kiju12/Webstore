package kni.webstore.model;

public class Example {

	private final String name;
	private final int age;
	private final boolean ziomek;
	
	public Example(String name, int age, boolean ziomek) {
		super();
		this.name = name;
		this.age = age;
		this.ziomek = ziomek;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public boolean isZiomek() {
		return ziomek;
	}
	
	
	
}
