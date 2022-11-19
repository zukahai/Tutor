package main;
import java.util.Scanner;

import object.ProcessManager;

public class Menu {
	ProcessManager processManager;
	static Scanner sc;
	public Menu() {
		sc = Main.sc;
		processManager = new ProcessManager();
	}
	public void showMenu() {
		System.out.println("=====================================");
		int i=0;
		for(i=0;i<processManager.getProcess().size();i++) {
			System.out.println((i+1)+" . "+processManager.getProcess().get(i).getName());
		}
		System.out.println((i+1)+" . "+"Thoat");
		System.out.println("=====================================");
	}
	public static int getInt(String ob) {
		System.out.print("Nhap "+ob+" : ");
		String s = sc.nextLine();
		while (!isNumeric(s)) {
			System.out.print("Sai dinh dang\nNhap "+ob+" : ");
			s = sc.nextLine();
		}
		int chose = Integer.parseInt(s);
		return chose;
	}
	public static String getString(String ob) {
		System.out.print("Nhap "+ob+" : ");
		String s = sc.nextLine();
		return s;
		
	}
	public static float getFloat(String ob) {	
		System.out.print("Nhap "+ob+" : ");
		String s = sc.nextLine();
		while (!isFl(s)) {
			System.out.print("Sai dinh dang\nNhap "+ob+" : ");
			s = sc.nextLine();
		}
		float chose = Float.parseFloat(s);
		return chose;
	}
	public static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
	public static boolean isFl(String str){
        return str != null && str.matches("[+-]?([0-9]*[.])?[0-9]+");
    }
}
