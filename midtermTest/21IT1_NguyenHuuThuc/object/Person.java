package object;

import main.Menu;

public class Person {
	int ID, age;
	String name, address;
	
	public Person() {
		this.ID = 0;
		this.age = 0;
		this.name = "";
		this.address = "";
	}
	
	public Person(int ID, String name, int age, String address) {
		this.ID = ID;
		this.age = age;
		this.name = name;
		this.address = address;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInfo() {
		return String.format("ID=%s, age=%s, name=%s, address=%s", getID(), getAge(), getName(), getAddress());
	}
	public void display() {
		System.out.println("Person["+getInfo()+"]");
	}
	public void input() {	
		setID(Menu.getInt("ID"));
		setAge(Menu.getInt("age"));
		setName(Menu.getString("name"));
		setAddress(Menu.getString("address"));		
	}
	public void change() {
		setAge(Menu.getInt("age"));
		setName(Menu.getString("name"));
		setAddress(Menu.getString("address"));		
	}
	
}
