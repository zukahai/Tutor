package object;

import java.util.Scanner;

public class Teacher_ extends Person {
	private int experience;
	public Teacher_() {
		// TODO Auto-generated constructor stub
	}
	public Teacher_(int iD, String name, int age, String address, int experience) {
		super(iD, name, age, address);
		
		this.experience = experience;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();;
		System.out.print("Enter experience: ");
		this.experience = sc.nextInt();
		
	}
	@Override
	public String toString() {
		return "Teacher [ ID=" + ID + ", name=" + name + ", age=" + age + ", address="
				+ address + ", experience=" + experience +"]";
	}
	public void input1() {
		Scanner sc = new Scanner(System.in);
		super.input1();;
		System.out.print("Enter experience: ");
		this.experience = sc.nextInt();
		
	}

}




