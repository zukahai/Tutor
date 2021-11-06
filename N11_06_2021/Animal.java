package N11_06_2021;

public class Animal {
	String name, gender;
	int age;
	
	public Animal() {
		this.name = "default";
		this.gender = "";
		this.age = 0;
	}
	
	public Animal(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Gender: " + this.gender);
		System.out.println("Age: " + this.age);
	}
	
	public void nextAge() {
		this.age++;
	}
	
	public void sleep() {
		System.out.println("Sleeping..........");
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
}
