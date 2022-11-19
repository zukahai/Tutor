package object.pro;

import object.PersonManager;
import object.Process;

public class XoaTatCa extends Process{

	public XoaTatCa() {
		super("Xoa tat ca");
	}

	@Override
	public void run() {
		PersonManager.getPersons().clear();		
		System.out.println("Done!");
	}

}
