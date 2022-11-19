package object.pro;

import java.util.ArrayList;

import main.Menu;
import object.Process;
import object.sort.*;

public class SapXepPerson extends Process{
	ArrayList<Process> process = new ArrayList<>();
	public SapXepPerson() {
		super("Sap Xep Person");
		process.add(new TangTheoID());
		process.add(new GiamTheoID());
		process.add(new TangTheoName());
		process.add(new GiamTheoName());
		process.add(new TangTheoAge());
		process.add(new GiamTheoAge());
		process.add(new TangTheoAddress());
		process.add(new GiamTheoAddress());
		process.add(new BonChamChin());
	}

	@Override
	public void run() {
		displayMenu();
		int chose = Menu.getInt("lua chon");
		if(chose >=1 && chose <= process.size()) {
			process.get(chose-1).run();
			new XemThongTin().run();
		}else {
			System.out.println("Khong co lua chon nay");
		}
	}
	public void displayMenu() {
		System.out.println("=====================================");
		int i=0;
		for(i=0;i<process.size();i++) {
			System.out.println((i+1)+" . "+process.get(i).getName());
		}
		System.out.println("=====================================");
	}

}
