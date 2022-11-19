package object.pro;

import object.PersonManager;
import object.Process;
import object.Teacher;

public class NhapTeacher extends Process{

	public NhapTeacher() {
		super("Nhap vao 1 Teacher");
	}

	@Override
	public void run() {
		Teacher s = new Teacher();
		s.input();
		if(PersonManager.findID(s.getID()) == null) {
			PersonManager.add(s);
			System.out.print("Da them ");
			s.display();
		}else {
			System.out.println("ID da ton tai");
		}		
	}

}
