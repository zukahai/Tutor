package Main;

public class Person {
	String name, gender;
	int age;
	
	public Person() {
		this.name = "";
		this.gender = "";
		this.age = 0;
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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Person minh = new Person();
		minh.setName("Minh");
		minh.setAge(18);
		minh.setGender("Female");
		System.out.println(minh.toString());
	}
}
