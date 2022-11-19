package object;

import java.util.Scanner;

public class Teacher extends Person {
    int experience;

    public Teacher() {
        this.experience = 0;
    }

    public Teacher(int ID, String name, int age, String address, int experience) {
        super(ID, name, age, address);
        this.experience = experience;
    }

    public void intput() {
        super.intput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nam : ");
        this.experience = sc.nextInt();
    }

    public String display() {
        return super.display() + String.format(", Da day trong : %s nam", getExperience());
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

}
