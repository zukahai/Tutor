package object;

import main.Menu;

public class Student extends Person{
	float math, physics, chemistry;
	public Student() {
		super();
		this.math = 0;
		this.physics = 0;
		this.chemistry = 0;
	}
	public Student(int ID, String name, int age, String address, float math, float physics, float chemistry) {
		super(ID,name,age,address);
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
	}
	public String getInfo() {
		return String.format("%s, math=%s, physics=%s, chemistry=%s", super.getInfo() ,getMath(),getPhysics(),getChemistry());
	}
	public void display() {
		System.out.println("Student["+getInfo()+"]");
	}
	public float getAvg() {
		return (float) ((getChemistry()+getMath()+getPhysics())/3.0);
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
	public void input() {
		super.input();
		setMath(Menu.getFloat("diem toan"));
		setPhysics(Menu.getFloat("diem ly"));
		setChemistry(Menu.getFloat("diem hoa"));
	}
	public void change() {
		super.change();
		setMath(Menu.getFloat("diem toan"));
		setPhysics(Menu.getFloat("diem ly"));
		setChemistry(Menu.getFloat("diem hoa"));
	}
	
}
