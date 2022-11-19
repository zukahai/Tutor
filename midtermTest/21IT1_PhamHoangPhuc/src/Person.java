import java.util.Scanner;
import java.lang.String;

public class Person {
	int ID, age, xd;
	String name, address;
	Scanner sc = new Scanner(System.in);
	
	public Person() {
		ID = 0;
		age = 0;
		name = "";
		address = "";
		xd = 0;
		
	}
	
	

	public Person(int id, int age, String name, String address, int xd) {
		this.ID = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.xd = xd;
		
	}
	
	public int getXd() {
		return xd;
	}

	public void setXd(int xd) {
		this.xd = xd;
	}

	public int getID() {
		return ID;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.print("ID:" + this.ID + " ;name:" + this.name + " ;age:" + this.age + " ;address:" + this.address);
	}
	
	public void input() {
		System.out.print("name:"); this.name = sc.nextLine();
		
		System.out.print("age:"); this.age = sc.nextInt();
		sc.nextLine();
		System.out.print("address:"); this.address = sc.nextLine();
		
	}
}
