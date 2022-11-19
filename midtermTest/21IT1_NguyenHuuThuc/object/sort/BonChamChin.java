package object.sort;

import java.util.Comparator;

import object.Person;
import object.PersonManager;
import object.Process;
import object.Student;
import object.Teacher;

public class BonChamChin extends Process{

	public BonChamChin() {
		super("Dai Qua Nhac Ghi");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		PersonManager.getPersons().sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if(o1 instanceof Student && o2 instanceof Teacher) {
					return 1;
				}else if(o1 instanceof Student && o2 instanceof Student){
					return ((Student)o1).getAvg() > ((Student)o2).getAvg() ? 1 : -1;
				}else if(o1 instanceof Teacher && o2 instanceof Teacher){
					return ((Teacher)o1).getExperience() > ((Teacher)o2).getExperience() ? 1 : -1;
				}
				return -1;
			}
		});		
	}

}
