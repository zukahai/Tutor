package object.pro;

import main.Menu;
import object.Person;
import object.PersonManager;
import object.Process;

public class SuaThongTinID extends Process{

	public SuaThongTinID() {
		super("Sua thong tin theo ID");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		int ID = Menu.getInt("ID can sua");
		Person p = PersonManager.findID(ID);
		if(p != null) {
			System.out.print("Thong tin cu ");p.display();
			p.change();
			System.out.println("Done!");
		}else {
			System.out.println("Khong ton tai ID");
		}
		
	}

}
