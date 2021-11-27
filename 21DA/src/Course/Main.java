package Course;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Course> courses = new ArrayList<Course>();
        
        courses.add(new Course(123, "OPP1", 2));
        courses.add(new Course(124, "OPP2", 5));
        courses.add(new Course(125, "OPP3", 1));
        courses.add(new Course(126, "OPP4", 10));
        courses.add(new Course(127, "OPP5", 9));
        courses.add(new Course(128, "OPP6", 2));
        courses.add(new Course(129, "OPP7", 4));
        

        // In ra danh sach
        System.out.println("Danh Sach khoa hoc");
        for (Course a : courses)
            System.out.println(a.toString());
        System.out.println();


        // Tim kiem theo id
        // System.out.println("Tim kiem khoa hoc theo ID");
        // System.out.print("Nhap ID: ");
        // int id = sc.nextInt();

        // boolean check = true;

        // for (int i = 0; i < courses.size(); i++)
        //     if (courses.get(i).getId() == id) {
        //         System.out.println(courses.get(i));
        //         check = false;
        //         break;
        //     }
        
        // if (check == true)
        //     System.out.println("Khong tim thay ID");


        // Cap nhap theo id
        System.out.println("Cap nhat khoa hoc theo ID");
        System.out.print("Nhap ID: ");
        int id2 = sc.nextInt();

        boolean check2 = true;

        for (int i = 0; i < courses.size(); i++)
            if (courses.get(i).getId() == id2) {
                sc.nextLine();
                System.out.print("New Name = ");
                String name = sc.nextLine();
                System.out.print("New Credits = ");
                int credits = sc.nextInt();
                Course newCourse = new Course(id2, name, credits);
                courses.set(i, newCourse);
                check2 = false;
                break;
            }
        
        if (check2 == true)
            System.out.println("Khong tim thay ID");
        else {
            System.out.println("Danh Sach sau khi thay doi");
            for (Course a : courses)
            System.out.println(a.toString());
            System.out.println();
        }
    }
}