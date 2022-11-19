package main;

import java.util.Scanner;

import java.util.Arrays;
import object.Person;
import object.Student;
import object.Teacher;

public class Personmanager {
    Person[] persons = new Person[100];
    Person temp = new Person(0, "name", 2, "address");
    Student[] students = new Student[100];
    Student tempS = new Student(0, "name", 3, "address", 0, 0, 0);
    Teacher[] teachers = new Teacher[100];
    Teacher tempT = new Teacher(0, "name", 0, "address", 0);
    int dP = 0, dT = 0, dS = 0;
    int ID[] = new int[100000];

    // cau 2
    public void intputS() {
        int kt = 1;
        while (kt == 1) {
            this.students[this.dS] = new Student();
            this.persons[this.dP] = new Person();
            this.students[this.dS].intput();
            this.persons[this.dP] = this.students[dS];
            if (ID[this.students[this.dS].getID()] == 1) {
                System.out.println("Da Ton tai ID nay, vui long nhap lai");
            } else {
                kt = 0;
                ID[this.students[this.dS].getID()] = 1;
            }
        }

        this.dP++;
        this.dS++;
        System.out.println("===Da nhap 1 hoc sinh==");
    }

    // cau 3
    public void inputT() {
        int kt = 1;
        while (kt == 1) {
            this.teachers[this.dT] = new Teacher();
            this.persons[dP] = new Person();
            this.teachers[this.dT].intput();
            this.persons[dP] = this.teachers[this.dT];
            if (ID[this.teachers[this.dT].getID()] == 1) {
                System.out.println("Da Ton tai ID nay, vui long nhap lai");
            } else {
                kt = 0;
                ID[this.teachers[this.dT].getID()] = 1;
            }
        }
        this.dT++;
        this.dP++;
        System.out.println("===Da nhap 1 giao vien==");
    }

    // cau 4.1
    public void sortID() {
        for (int i = 0; i < this.dP - 1; i++) {
            for (int j = i + 1; j < this.dP; j++) {
                if (this.persons[i].getID() > this.persons[j].getID()) {
                    this.temp = this.persons[i];
                    this.persons[i] = this.persons[j];
                    this.persons[j] = this.temp;
                }
            }
        }
        System.out.println("Da sap xep thanh cong!!");
    }

    // cau 4.2
    public void sortIDgreater() {
        for (int i = 0; i < this.dP - 1; i++) {
            for (int j = i + 1; j < this.dP; j++) {
                if (this.persons[i].getID() < this.persons[j].getID()) {
                    this.temp = this.persons[i];
                    this.persons[i] = this.persons[j];
                    this.persons[j] = this.temp;
                }
            }
        }
        System.out.println("Da sap xep thanh cong!!");
    }

    // cau 4.3
    public void sortName() {
        for (int i = 0; i < this.dP - 1; i++) {
            for (int j = i + 1; j < this.dP; j++) {
                if (this.persons[i].getName().compareTo(this.persons[j].getName()) > 0) {
                    this.temp = this.persons[i];
                    this.persons[i] = this.persons[j];
                    this.persons[j] = this.temp;
                }
            }
        }
        System.out.println("Da sap xep thanh cong!!");
    }

    // cau 4.4
    public void sortNameGreater() {
        for (int i = 0; i < this.dP - 1; i++) {
            for (int j = i + 1; j < this.dP; j++) {
                if (this.persons[i].getName().compareTo(this.persons[j].getName()) < 0) {
                    this.temp = this.persons[i];
                    this.persons[i] = this.persons[j];
                    this.persons[j] = this.temp;
                }
            }
        }
        System.out.println("Da sap xep thanh cong!!");
    }

    // cau 4.5
    public void sortAGE() {
        for (int i = 0; i < this.dP - 1; i++) {
            for (int j = i + 1; j < this.dP; j++) {
                if (this.persons[i].getAge() > this.persons[j].getAge()) {
                    this.temp = this.persons[i];
                    this.persons[i] = this.persons[j];
                    this.persons[j] = this.temp;
                }
            }
        }
        System.out.println("Da sap xep thanh cong!!");
    }

    // cau 4.6
    public void sortAGEgreater() {
        for (int i = 0; i < this.dP - 1; i++) {
            for (int j = i + 1; j > this.dP; j++) {
                if (this.persons[i].getAge() < this.persons[j].getAge()) {
                    this.temp = this.persons[i];
                    this.persons[i] = this.persons[j];
                    this.persons[j] = this.temp;
                }
            }
        }
        System.out.println("Da sap xep thanh cong!!");
    }

    // cau 4.7
    public void sortAddress() {
        for (int i = 0; i < this.dP - 1; i++) {
            for (int j = i + 1; j < this.dP; j++) {
                if (this.persons[i].getAddress().compareTo(this.persons[j].getAddress()) > 0) {
                    this.temp = this.persons[i];
                    this.persons[i] = this.persons[j];
                    this.persons[j] = this.temp;
                }
            }
        }
        System.out.println("Da sap xep thanh cong!!");
    }

    // cau 4.8
    public void sortAddressGreater() {
        for (int i = 0; i < this.dP - 1; i++) {
            for (int j = i + 1; j < this.dP; j++) {
                if (this.persons[i].getAddress().compareTo(this.persons[j].getAddress()) < 0) {
                    this.temp = this.persons[i];
                    this.persons[i] = this.persons[j];
                    this.persons[j] = this.temp;
                }
            }
        }
        System.out.println("Da sap xep thanh cong!!");
    }

    // cau 4.9
    public void sortLast() {
        int d = 0;
        for (int i = 0; i < this.dT - 1; i++) {
            for (int j = i + 1; j < this.dT; j++) {
                if (this.teachers[i].getExperience() > this.teachers[j].getExperience()) {
                    this.tempT = this.teachers[i];
                    this.teachers[i] = this.teachers[j];
                    this.teachers[j] = this.tempT;
                }
            }
            this.persons[d++] = this.teachers[i];
        }
        this.persons[d++] = teachers[this.dT - 1];
        for (int i = 0; i < dS - 1; i++) {
            for (int j = i + 1; j < dS; j++) {
                if (this.students[i].getAverage() > this.students[j].getAverage()) {
                    this.tempS = this.students[i];
                    this.students[i] = this.students[j];
                    this.students[j] = this.tempS;
                }
            }
            this.persons[d++] = this.students[i];
        }
        this.persons[d] = this.students[this.dS - 1];
        System.out.println("Da sap xep thanh cong!!");
    }

    // cau 5.1
    public void findID(int ID) {
        int kt = 0;
        for (int i = 0; i < this.dP; i++) {
            if (this.persons[i].getID() == ID) {
                kt = 1;
                System.out.println(this.persons[i].display());
            }
        }
        if (kt == 0)
            System.out.println("Khong tim thay Person");
    }

    // cau 5.2
    public void findName(String Name) {
        int kt = 0;
        for (int i = 0; i < this.dP; i++) {
            if (this.persons[i].getName().equals(Name)) {
                kt = 1;
                System.out.println(this.persons[i].display());
            }
        }
        if (kt == 0)
            System.out.println("Khong tim thay Person");
    }

    // cau 5.3
    public void findAge(int Age) {
        int kt = 0;
        for (int i = 0; i < this.dP; i++) {
            if (this.persons[i].getAge() == Age) {
                kt = 1;
                System.out.println(this.persons[i].display());
            }
        }
        if (kt == 0)
            System.out.println("Khong tim thay Person");
    }

    // cau 5.4
    public void findAddress(String Address) {
        int kt = 0;
        for (int i = 0; i < this.dP; i++) {
            if (this.persons[i].getAddress().equals(Address)) {
                kt = 1;
                System.out.println(this.persons[i].display());
            }
        }
        if (kt == 0)
            System.out.println("Khong tim thay Person");
    }

    // cau 6.1;
    public void displayT() {
        for (int i = 0; i < this.dT; i++) {
            System.out.println(1 + " " + this.teachers[i].display());
        }
    }

    // cau 6,2;
    public void displayS() {
        for (int i = 0; i < dS; i++) {
            System.out.println(1 + " " + this.students[i].display());
        }
    }

    // cau 7
    public void deleteID(int ID) {
        for (int i = 0; i < this.dP; i++) {
            if (this.persons[i].getID() == ID) {
                this.dP--;
                for (int j = i; j <= this.dP; j++) {
                    this.persons[j] = this.persons[j + 1];
                }
                if (this.persons[i] instanceof Student) {
                    for (int j = 0; j <= dS; j++) {
                        if (this.students[j] == this.persons[i]) {
                            for (int k = j; k <= dS; k++) {
                                this.students[k] = this.students[k + 1];
                            }
                            break;
                        }
                    }
                    this.dS--;
                } else {
                    for (int j = 0; j <= this.dS; j++) {
                        if (this.teachers[j] == this.persons[i]) {
                            for (int k = j; k <= this.dS; k++) {
                                this.teachers[k] = this.teachers[k + 1];
                            }
                            break;
                        }
                    }
                    this.dT--;
                }

            }
        }
        System.out.println("Da xoa this.persons : " + ID);
    }

    // cau 8
    public void update(int ID) {
        int kt = 1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.dP; i++) {
            if (this.persons[i].getID() == ID) {
                System.out.println("Person can sua : " + this.persons[i].display());
                System.out.println("Hay sua cac thuoc tinh : ");

                System.out.println("Doi ten thanh : ");

                String name = sc.nextLine();
                System.out.println("Doi tuoi thanh : ");
                int age = sc.nextInt();
                System.out.println("Doi dia chi thanh : ");
                sc.nextLine();
                String address = sc.next();
                if (this.persons[i] instanceof Student) {
                    System.out.println("Doi diem Toan thanh: ");
                    float math = sc.nextFloat();
                    System.out.println("Doi diem Ly thanh: ");
                    float physics = sc.nextFloat();
                    System.out.println("Doi diem Hoa thanh: ");
                    float chemistry = sc.nextFloat();

                    for (int j = 0; j < this.dS; j++) {
                        if (this.students[j].getID() == ID) {
                            this.students[j] = new Student(ID, name, age, address, math, physics, chemistry);
                            this.persons[i] = this.students[j];
                            break;
                        }
                    }
                } else {
                    System.out.println("Doi so nam thanh : ");
                    int experience = sc.nextInt();
                    this.tempT = new Teacher(ID, name, age, address, experience);
                    this.persons[i] = this.tempT;
                    for (int j = 0; j < this.dT; j++) {
                        if (this.teachers[j].getID() == ID) {
                            this.teachers[j] = this.tempT;
                            break;
                        }
                    }
                }
                kt = 0;
                break;
            }
        }
        if (kt == 1)
            System.out.println("Khong tim thay!");
    }

    // cau 10
    public void reset() {
        this.persons = new Person[100];
        this.students = new Student[100];
        this.teachers = new Teacher[100];
        this.dP = 0;
        this.dS = 0;
        this.dT = 0;
    }

    // cau 1
    public void displayAll() {
        System.out.println(this.dP + " " + this.dS + " " + this.dT);
        for (int i = 0; i < this.dP; i++) {
            System.out.println(i + " " + this.persons[i].display());
        }
    }
}
