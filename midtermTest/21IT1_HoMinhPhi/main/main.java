package main;

import java.util.Scanner;
import main.Personmanager;
import object.Person;
import object.Student;
import object.Teacher;

public class main {
    static Person persons;
    static Student students;
    static Teacher teachers;
    static Personmanager personmanager;

    public static void main(String[] args) {
        personmanager = new Personmanager();
        Scanner sc = new Scanner(System.in);
        int c = 0;

        while (c != 10) {
            System.out.println("======Nhap chuc nang=====");
            System.out.println("=1.Xem thong tin=========");
            System.out.println("=2. Nhap vao mot Student=");
            System.out.println("=3. Nhap vao mot Teacher=");
            System.out.println("=4. Sap xep cac person===");
            System.out.println("=5. Tim kiem Person======");
            System.out.println("=6. In thong tin=========");
            System.out.println("=7. Xoa thong tin theo ID");
            System.out.println("=8. Sua thong tin theo ID");
            System.out.println("=9. Xoa Tat Ca Du Lieu===");
            System.out.println("=10. Thoat chuong trinh==");
            System.out.println("=========================");
            c = sc.nextInt();
            switch (c) {
            case 1:
                personmanager.displayAll();
                break;
            case 2:
                personmanager.intputS();

                break;
            case 3:
                personmanager.inputT();
                break;
            case 4:
                System.out.println("======Sap xep=====");
                System.out.println("=1. Tang theo ID=========");
                System.out.println("=2. Giam theo ID=========");
                System.out.println("=3. Tang theo name=======");
                System.out.println("=4. Giam theo name=======");
                System.out.println("=5. Tang theo Age========");
                System.out.println("=6. Giam theo Age========");
                System.out.println("=7. Tang theo Address====");
                System.out.println("=8. Giam theo Address====");
                System.out.println("=9. Sap xep theo tung loai");
                System.out.println("=========================");
                int k = sc.nextInt();
                switch (k) {
                case 1:
                    personmanager.sortID();
                    break;
                case 2:
                    personmanager.sortIDgreater();
                    break;
                case 3:
                    personmanager.sortName();
                    break;
                case 4:
                    personmanager.sortNameGreater();
                    break;
                case 5:
                    personmanager.sortAGE();
                    break;
                case 6:
                    personmanager.sortAGEgreater();
                    break;
                case 7:
                    personmanager.sortAddress();
                    break;
                case 8:
                    personmanager.sortAGEgreater();
                    break;

                default:
                    personmanager.sortLast();
                    break;
                }
                break;
            case 5:
                System.out.println("======Tim kiem============");
                System.out.println("=1. Tim theo ID===========");
                System.out.println("=2. Tim theo Name=========");
                System.out.println("=3. Tim theo age==========");
                System.out.println("=4. tim theo address======");
                System.out.println("==========================");
                int l = sc.nextInt();
                switch (l) {
                case 1:
                    System.out.println("Nhap ID can tim : ");
                    int ID = sc.nextInt();
                    personmanager.findID(ID);
                    break;
                case 2:
                    System.out.println("Nhap Name can tim : ");
                    sc.nextLine();
                    String name = sc.next();
                    personmanager.findName(name);
                    break;
                case 3:
                    System.out.println("Nhap Age can tim : ");
                    int age = sc.nextInt();
                    personmanager.findAge(age);
                    break;
                default:
                    System.out.println("Nhap Address can tim : ");
                    sc.nextLine();
                    String Address = sc.next();
                    personmanager.findAddress(Address);
                    break;
                }
                break;
            case 6:
                System.out.println("====In thong tin cua=====");
                System.out.println("=1. Giao Vien ===========");
                System.out.println("=2. Hoc Sinh ============");
                int q = sc.nextInt();
                switch (q) {
                case 1:
                    personmanager.displayT();
                    break;

                default:
                    personmanager.displayS();
                    break;
                }
                break;
            case 7:
                System.out.println("Nhap ID can xoa : ");
                int w = sc.nextInt();
                personmanager.deleteID(w);
                break;
            case 8:
                System.out.println("Nhap Id doi tuong can sua : ");
                int r = sc.nextInt();
                personmanager.update(r);
                break;
            case 9:
                personmanager.reset();
                break;
            default:
                c = 10;
                System.out.println("Ok bai!");
                break;
            }
        }
    }
}
