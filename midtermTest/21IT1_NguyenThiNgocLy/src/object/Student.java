package object;

import java.util.Scanner;

public class Student extends Person {
	private float math;
	private float physics;
	private float chemistry;
	float Average;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int iD, String name, int age, String address, float math, float physics, float chemistry) {
		super(iD, name, age, address);
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
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
	public float getAverage() {
		return (this.math+this.physics+this.chemistry)/3; 
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("Enter math: ");
		this.math = sc.nextFloat();
		System.out.print("Enter physics: ");
		this.physics = sc.nextFloat();
		System.out.print("Enter chemistry: ");
		this.chemistry = sc.nextFloat();
	}
	

	@Override
	public String toString() {
		return "Student [ ID= " + ID +  ", name= " + name +  ", age= " + age +  ", address= "  
				+ address +", math=" + math + ", physics=" + physics + ", chemistry=" + 
				chemistry +", Average="+ (this.math+this.physics+this.chemistry)/3 + "]";
		
	}
	public void input1() {
		Scanner sc = new Scanner(System.in);
		super.input1();
		System.out.print("Enter math: ");
		this.math = sc.nextFloat();
		System.out.print("Enter physics: ");
		this.physics = sc.nextFloat();
		System.out.print("Enter chemistry: ");
		this.chemistry = sc.nextFloat();
	}

	

	
	

}
