package object.pro;

import object.PersonManager;
import object.Process;
import object.Student;

public class NhapStudent extends Process{

	public NhapStudent() {
		super("Nhap vao 1 Student");
	}

	@Override
	public void run() {
		Student s = new Student();
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
