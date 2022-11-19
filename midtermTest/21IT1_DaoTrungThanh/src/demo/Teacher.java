package demo;

import java.util.Scanner;

public class Teacher extends Person {

	int experience;
	
	public Teacher() {
		super();
		this.experience = 0;
	}

	public Teacher(int experience) {
		super();
		this.experience = experience;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getInfo() {
		return String.format("%s,experience=%s",super.getInfo(), getExperience());
	}
	public void display() {
		System.out.println("Teacher["+getInfo()+"]");
	}
	
	public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        sc.nextLine();
        System.out.print("Enter experience: ");
        this.experience = sc.nextInt();
    }
	
}
