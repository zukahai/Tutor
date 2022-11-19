package object;

import java.util.Scanner;

public class Person {
    int ID;
    String name;
    int age;
    String address;

    public Person() {
        this.ID = 0;
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    public Person(int ID, String name, int age, String address) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void intput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID : ");
        this.ID = sc.nextInt();
        System.out.println("Nhap ten : ");
        sc.nextLine();
        this.name = sc.next();
        System.out.println("Nhap tuoi : ");
        this.age = sc.nextInt();
        System.out.println("Nhap dia chi : ");
        sc.nextLine();
        this.address = sc.next();

    }

    public String display() {
        return String.format("%s : %s , %s , %s ", getID(), getName(), getAge(), getAddress());
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}