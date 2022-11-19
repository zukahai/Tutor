package N11_06_2021;

import java.util.Scanner;

public class Main { //"\n"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hai h = new Hai();
        System.out.print("Name = ");
        String Name = sc.nextLine();
        System.out.print("Gender = ");
        String Gender = sc.nextLine();
        System.out.print("Age = ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Address = ");
        String address = sc.nextLine();
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        System.out.print("C = ");
        int c = sc.nextInt();
        Hai h2 = new Hai(Name, Gender, age, address, a, b, c);
        h2.display();
    }
}