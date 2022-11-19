package demo;

import java.util.Scanner;

import demo.Function;



public class Main {
	static 	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Function a = new Function();
		
		while(true) {
			
			a.displayMenu();
			System.out.print("Enter function: ");
			int n = sc.nextInt();
			switch (n) {
			case 1: 
				a.displayAll();
				break;
			case 2:
				a.addStudent();
				break;
			case 3:
				a.addTeacher();
				break;
			case 4:
				Boolean inMenu = true;
				while (inMenu) {
					a.displayMenu4();
					System.out.print("Enter function: ");
					int m = sc.nextInt();
					switch ( m ) {
					case 1:
						a.sortIDt();
						a.displayAll();
						break;
					case 2:
						a.sortIDg();
						a.displayAll();
						break;
					case 3: 
						a.sortNameT();
						a.displayAll();
						break;
					case 4: 
						a.sortNameG();
						a.displayAll();
						break;
					case 5:
						a.sortAgeT();
						a.displayAll();
						break;
					case 6:
						a.sortAgeG();
						a.displayAll();
						break;
					case 7:
						a.sortAddressT();
						a.displayAll();
						break;
					case 8:
						a.sortAddressG();
						a.displayAll();
						break;
					case 9:
						a.sortTeacherStudent();
						a.displayAll();
						break;
					case 10: 
						System.out.println("Back");
						break;
					default:
						System.out.println("Not a true choice");
					} 
					if(m==10) inMenu = false;
				}
				break;
			case 5: 
				a.displayMenu5();
				System.out.print("Enter function: ");
				int x = sc.nextInt();
				Boolean inMenu2 = true;
				while (inMenu2) {
				switch(x) {
					case 1: 
						a.findID();
						break;
					case 2:
						a.findName();
						break;
					case 3:
						a.findAge();
						break;
					case 4:
						a.findAddress();
						break;
					case 5:
						System.out.println("Back");
						return;
					default :
						System.out.println("Not a true choice");
					}
				if(x==5) inMenu2 = false;
				}
				break;
			case 6:
				Boolean inMenu3 = true;
				a.displayMenu6();
				System.out.print("Enter function: ");
				while(inMenu3) {
					int y = sc.nextInt();
					switch(y) {
					case 1: 
						a.findTeacher();
						break;
					case 2:
						a.findStudent();
						break;
					case 3:
						System.out.println("Back");
						break;
					default:
						System.out.println("not a true choice");
						break;
					}
					if(y==3) inMenu3 = false;
				}
				break;
			case 7:
				a.deleteID();
				break;
			case 8:
				a.update();
				break;
			case 9:
				a.deleteAll();
				break;
			case 10:
				System.out.println("Exit");
				return;
			default: 
				System.out.println("not a true choice");
				
			}
			
		}

	}	
	
}
