package object;

import main.Menu;

public class Teacher extends Person{
	int experience;
	public Teacher(){
		super();
		this.experience = 0;
	}
	public Teacher(int ID, String name, int age, String address, int experience) {
		super(ID,name,age,address);
		this.experience = experience;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getInfo() {
		return String.format("%s, experience=%s",super.getInfo(), getExperience());
	}
	public void display() {
		System.out.println("Teacher["+getInfo()+"]");
	}
	public void input() {
		super.input();
		setExperience(Menu.getInt("kinh nghiem"));
	}
	public void change() {
		super.change();
		setExperience(Menu.getInt("kinh nghiem"));
	}
	
}
