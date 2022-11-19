import java.util.Scanner;
import java.lang.String;

public class Student extends Person {
	float math, physics, chemistry;
	Scanner sc = new Scanner(System.in);
	
	public Student() {
		super();
		math = 0.0f;
		physics = 0.0f;
		chemistry = 0.0f;
		
	}

	public float getMath() {
		return math;
	}

	public float getPhysics() {
		return physics;
	}

	public float getChemistry() {
		return chemistry;
	}
	
	public float getAverage() {
		return (this.chemistry + this.physics + this.math)/3 ;
	}

	public void setMath(float math) {
		this.math = math;
	}

	public void setPhysics(float physics) {
		this.physics = physics;
	}

	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}

	public void display() {
		super.display();
		System.out.println(" ;math:" + this.math + " ;physisc:" + this.physics + " ;chemistry:" + this.chemistry + " ;Average:" + getAverage() + "  >Student<");
		
	}
	
	public void input() {
		super.input();
		System.out.print("math:"); this.math = sc.nextFloat();
		System.out.print("physics:"); this.physics = sc.nextFloat();
		System.out.print("chemistry:"); this.chemistry = sc.nextFloat();
		
	}

}
