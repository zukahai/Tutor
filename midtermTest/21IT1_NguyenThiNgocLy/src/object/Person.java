package object;

import java.util.Scanner;

public class Person {
	protected int ID;
	protected String name;
	protected int age;
	protected String address;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int iD, String name, int age, String address) {
		this.ID = iD;
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
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID: ");
		this.ID =sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		this.name = sc.nextLine();
		System.out.print("Enter age: ");
		this.age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter address: ");
		this.address = sc.nextLine();
		
	}
	
	@Override
	public String toString() {
		return "Person [ID=" + ID + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	public void input1() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter name: ");
		this.name = sc.nextLine();
		System.out.print("Enter age: ");
		this.age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter address: ");
		this.address = sc.nextLine();
		
	}
	

	

}
