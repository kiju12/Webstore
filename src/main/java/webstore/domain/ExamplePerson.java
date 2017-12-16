package webstore.domain;

public class ExamplePerson {

	private final String name;
	private final String secoundName;
	private final int age;
	
	public ExamplePerson(String name, String sname, int age) {
		this.name = name;
		this.secoundName = sname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getSecoundName() {
		return secoundName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "ExamplePerson [name=" + name + ", secoundName=" + secoundName + ", age=" + age + "]";
	}
	
	
	
}
