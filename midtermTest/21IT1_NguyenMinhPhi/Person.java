package QuanLy;
import java.util.Scanner;
public class Person 
{
	int id,age;
	String name, address;
	public Person()
	{
		this.id = 0;
		this.name = "";
		this.age = 0;
		this.address = "";
		
	}
	public void Person(int id, int age, String name, String address)
	{
		this.id  = id;
		this.name = name;
		this.age = age;
		this.address = address;
		
	}
	public void input()
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter name: ");
	    this.name = sc.nextLine();
	    System.out.print("Enter age: ");
	    this.age = sc.nextInt();
	    sc.nextLine();
	    System.out.print("Enter address: ");
	    this.address = sc.nextLine();
	    
	}
	public void input2()
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter ID: ");
	    this.id = sc.nextInt();
		
	}

	public void display()
	{
		System.out.format("ID: %s, Name: %s, Age: %s, Address: %s \n",getId(),getName(), getAge(), getAddress());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
		
		
	
	
	

}
