package demo;

import java.util.Scanner;

public class Student extends Person {
	
	float math;
	float physics;
	float chemistry;
	
	public Student() {
		super();
		this.math = 0;
		this.physics = 0;
		this.chemistry = 0;
	}

	public Student(float math, float physics, float chemistry) {
		super();
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
		return (float) ((getChemistry()+getMath()+getPhysics())/3.0);
	}

	public String getInfo() {
		return String.format("%s, math=%s, physics=%s, chemistry=%s, Average=%s", super.getInfo(), getMath(), getPhysics(), getChemistry(), getAverage());
	}
	public void display() {
		System.out.println("Student["+getInfo()+"]");
	}
public void Input() {
		
		Scanner sc = new Scanner(System.in);
		super.Input();
		sc.nextLine();
		System.out.print("Enter math: ");
	    this.math = sc.nextInt();
	    System.out.print("Enter physics: ");
	    this.physics = sc.nextFloat();
	    System.out.print("Enter chemistry: ");
	    this.chemistry = sc.nextFloat();
	    
	}
	
}
