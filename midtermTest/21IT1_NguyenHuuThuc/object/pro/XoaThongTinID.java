package object.pro;

import main.Menu;
import object.Person;
import object.PersonManager;
import object.Process;

public class XoaThongTinID extends Process{

	public XoaThongTinID() {
		super("Xoa thong tin theo ID");
	}

	@Override
	public void run() {
		int ID = Menu.getInt("ID can xoa");
		Person pp = null;
		for(Person p : PersonManager.getPersons()) {
			if(ID == p.getID()) {
				pp = p;
				break;
			}
		}
		if(pp == null) {
			System.out.println("ID khong ton tai");
		}else {
			System.out.print("Da xoa ");pp.display();
			PersonManager.getPersons().remove(pp);
		}
		
	}

}
