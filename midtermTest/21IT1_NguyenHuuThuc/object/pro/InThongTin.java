package object.pro;

import main.Menu;
import object.Person;
import object.PersonManager;
import object.Process;
import object.Student;
import object.Teacher;

public class InThongTin extends Process{

	public InThongTin() {
		super("In thong tin");
	}

	@Override
	public void run() {
		display();
		int chose = Menu.getInt("lua chon");
		if(chose == 1) {
			for(Person p : PersonManager.getPersons()) {
				if(p instanceof Teacher) {
					p.display();
				}
			}
		}else if(chose == 2) {
			for(Person p : PersonManager.getPersons()) {
				if(p instanceof Student) {
					p.display();
				}
			}
		}else {
			System.out.println("Khong co lua chon nay");
		}
	}
	public void display() {
		System.out.println("=====================================");
		System.out.println("1 . Teacher");		
		System.out.println("2 . Student");	
		System.out.println("=====================================");
	}
}
