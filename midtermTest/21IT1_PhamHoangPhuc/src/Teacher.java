import java.util.Scanner;
import java.lang.String;

public class Teacher extends Person {
	int experience;
	Scanner sc = new Scanner(System.in);
	
	public Teacher() {
		super();
		experience = 0;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void display() {
		super.display();
		System.out.println(" ;experience:" + this.experience + " >Teacher<");
	}
	
	public void input() {
		super.input();
		
		System.out.print("experience:"); this.experience = sc.nextInt();
		
		
	}

}
