package demo;

import java.util.Scanner;

public class Person {

	int ID;
	String name;
	int age;
	String address;
	
	public Person() {
		this.ID = 0;
		this.name = "";
		this.age = 0;
		this.address = "";
	}

	public Person(int iD, String name, int age, String address) {
		super();
		ID = iD;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	@Override
	public String toString() {
		return "Person [ID=" + ID + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public String getInfo() {
		return String.format("ID=%s, age=%s, name=%s, address=%s", getID(), getAge(), getName(), getAddress());
	}
	
	public void display() {
		System.out.println("Person["+getInfo()+"]");
	}
public void Input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID: ");
	    this.ID = sc.nextInt();
	    sc.nextLine();
	    System.out.print("Enter name: ");
	    this.name = sc.nextLine();
	    System.out.print("Enter age: ");
	    this.age = sc.nextInt();
	    System.out.print("Enter address: ");
	    this.address = sc.nextLine();
	}	
}
