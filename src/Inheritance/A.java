package Inheritance;

public class A  {

	private String name;
	
	public A() {
		name = "";
	}
	
	public A(String name) {
		this.name = name;
		
	}
	
	
	// -- - - -- - - - - - - 
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void message() {
		System.out.println("This is message A");
	}
	
	
}
