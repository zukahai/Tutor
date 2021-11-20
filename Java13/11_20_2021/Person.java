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
	
	public int getYearOfbirthday() {
		return 2021 - this.age;
	}
	
	public void swapGender() {
		if (this.gender == "Male")
			this.gender = "Female";
		else
			this.gender = "Male";
	}
	
	public void nextAge() {
		this.age = this.age + 1;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Person p = new Person("Hai", "Female", 21);
		p.swapGender();
		System.out.println(p.toString());
		
	}
}
