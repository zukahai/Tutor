package QuanLy;
import java.util.Scanner;
public class Teacher extends Person
{
	
	int experience;
	public Teacher()
	{
		super();
		this.experience = 0;
	}
	public void Teacher(int id, int age, String name, String address, int experience )
	{
		super.Person(id, age, name, address);
		this.experience = experience;
		
		
	}
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("Enter experience: ");
		this.experience = sc.nextInt();
		
	}
	public void input2()
	{
		super.input2();
	}
	public void display()
	{
		System.out.format("Teacher [ ID: %s, Name: %s, Age: %s, Address: %s, Experience: %s ] \n", getId(), getName(), getAge(),getAddress(), getExperience());
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}