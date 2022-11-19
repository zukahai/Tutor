package object;

import java.util.Scanner;

public class Student extends Person {
    float math, physics, chemistry;

    public Student() {
        this.math = 0;
        this.physics = 0;
        this.chemistry = 0;
    }

    public Student(int ID, String name, int age, String address, float math, float physics, float chemistry) {
        super(ID, name, age, address);
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public void intput() {
        super.intput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem Toan : ");
        this.math = sc.nextFloat();
        System.out.println("Nhap diem ly : ");
        this.physics = sc.nextFloat();
        System.out.println("Nhap diem Hoa: ");
        this.chemistry = sc.nextFloat();
    }

    public String display() {
        return super.display()
                + String.format(", Diem thi toan ly hoa : %s, %s, %s", getMath(), getPhysics(), getChemistry());
    }

    public float getAverage() {
        return (this.math + this.chemistry + this.physics) / 3;
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
}
