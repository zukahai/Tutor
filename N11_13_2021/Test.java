package AnimalManager;

import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);

		while (true) {
			System.out.println("---------Menu------------");
			System.out.println("1. Nhap...");
			System.out.println("2. In thong tin");
			System.out.println("3. Thoat");
			System.out.print("Choice: ");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Nhap....");
					break;
				case 2:
					System.out.println("In thong tin..");
					break;
				case 3:
					System.out.println("Thoat...");
					return;
				default:
					System.out.println("Nhap lai");
			}
		}
	}
}
