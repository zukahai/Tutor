package object.pro;

import object.Person;
import object.PersonManager;
import object.Process;

public class XemThongTin extends Process{

	public XemThongTin() {
		super("Xem tat ca thong tin");
	}

	@Override
	public void run() {
		System.out.println("=============== Person ================\n");
		for(Person p : PersonManager.getPersons()) {
			p.display();
		}
		System.out.println("\n============= End Person ==============");
	}

}
