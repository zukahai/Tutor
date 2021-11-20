package Main;

public class Person {
	String name, gender;
	int age;
	
	public Person() {
		this.name = "";
		this.gender = "";
		this.age = 5;
	}
	
	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void sleep() {
		System.out.println("Sleeping.............");
	}
	
	public String toString() {
		return "[name=" + this.name + ", gender=" + this.gender + ", age=" + this.age + "]";
	}
	
	public static void main(String[] args) {
		Person pp = new Person("Hai", "female", 21);
		System.out.println(pp.toString());
		
		Person phu = new Person("Phu", "Female", 18);
		System.out.println(phu.toString());
	}
}
