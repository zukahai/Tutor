package QuanLy;
import java.util.Scanner;
public class Student extends Person
{
	
	float math, physics, chemistry;
	public Student()
	{
		super();
		this.math = 0;
		this.physics = 0;
		this.chemistry = 0;
	}
	public void Student(int id, int age, String name, String address,float math, float physics, float chmeistry)
	{
		super.Person(id, age, name, address);
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
		
		
	}
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("Enter math: ");
		this.math = sc.nextFloat();
		System.out.print("Enter physics: ");
		this.physics = sc.nextFloat();
		System.out.print("Enter chemistry: ");
		this.chemistry = sc.nextFloat();
		
	}
	public void input2()
	{
		super.input2();
	}
	public void display()
	{
		System.out.format("Student [ ID: %s, Name: %s, Age: %s, Address: %s, Math: %s, Physics: %s, Chemistry: %s, Average: %s ] \n", getId(), getName(), getAge(),getAddress(), getMath(), getPhysics(), getChemistry(), getAverage());
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getPhysics() {
		return physics;
	}
	public void setPhysics(float physics) {
		this.physics = physics;
	}
	public float getChemistry() {
		return chemistry;
	}
	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}
	public float getAverage()
	{
		float Average = (math + physics + chemistry) /3 ;
		return Average;
	}
	

}
