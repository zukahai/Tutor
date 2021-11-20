package Main;

import java.util.Scanner;

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
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("N: ");
		int n = input.nextInt();
		Person a[] = new Person[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin Person " + (i + 1) + ": ");
			System.out.print("Name: ");
			String name = input.next();
			
			System.out.print("Gender: ");
			String gender = input.next();
			
			System.out.print("Age: ");
			int age = input.nextInt();
			
			a[i] = new Person(name, gender, age);
		}
		for (int i = 0; i < n; i++)
			System.out.println(a[i].toString());
		
	}
}
