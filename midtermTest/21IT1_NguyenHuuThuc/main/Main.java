package main;
import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void cls()
	{
		try
		{	
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}catch(Exception E)
			{
				System.out.println(E);
			}
	}
	public static void main(String[] args) {		
		sc = new Scanner(System.in);
		Menu menu = new Menu();
		while (true) {
			System.out.println("Press enter to continue...");
			sc.nextLine();
			cls();
			menu.showMenu();
			int chose = Menu.getInt("lua chon");
			if(chose == menu.processManager.getProcess().size()+1) {
				System.out.println("Bye");
				return;
			}
			if(chose >=1 && chose <= menu.processManager.getProcess().size()) {
				menu.processManager.getProcess().get(chose-1).run();
			}else {
				System.out.println("Khong co lua chon nay");
			}
		}
		
	}

}
