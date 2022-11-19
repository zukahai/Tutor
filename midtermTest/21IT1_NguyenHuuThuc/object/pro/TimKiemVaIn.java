package object.pro;

import java.util.ArrayList;

import main.Menu;
import object.Person;
import object.PersonManager;
import object.Process;

public class TimKiemVaIn extends Process{
	ArrayList<Process> process = new ArrayList<>();
	public TimKiemVaIn() {
		super("Tim kiem va in");
	}

	@Override
	public void run() {
		display();
		int chose = Menu.getInt("lua chon");
		switch (chose) {
		case 1:
			int id = Menu.getInt("ID can tim");
			Person p = PersonManager.findID(id);
			if(p!=null) {
				p.display();
				break;
			}
			System.out.println("Khong tim thay");
			break;
		case 2:
			String name = Menu.getString("Ten can tim");
			ArrayList<Person> ps = PersonManager.findName(name);
			if(ps.size() > 0) {
				for(Person pe : ps) {
					pe.display();
				}
			}else {
				System.out.println("Khong tim thay");
			}
			break;
		case 3:
			int age = Menu.getInt("Age can tim");
			ArrayList<Person> ps1 = PersonManager.findAge(age);
			if(ps1.size() > 0) {
				for(Person pe : ps1) {
					pe.display();
				}
			}else {
				System.out.println("Khong tim thay");
			}
			break;
		case 4:
			String address = Menu.getString("Address can tim");
			ArrayList<Person> ps2 = PersonManager.findName(address);
			if(ps2.size() > 0) {
				for(Person pe : ps2) {
					pe.display();
				}
			}else {
				System.out.println("Khong tim thay");
			}
			break;	
		default:
			break;
		}
		
	}
	public void display() {
		System.out.println("=====================================");
		System.out.println("1 . ID");		
		System.out.println("2 . Name");	
		System.out.println("3 . Age");	
		System.out.println("4 . Address");	
		System.out.println("=====================================");
	}
}
