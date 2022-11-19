package object.sort;

import java.util.Comparator;

import object.Person;
import object.PersonManager;
import object.Process;

public class GiamTheoID extends Process{

	public GiamTheoID() {
		super("Giam Theo ID");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		PersonManager.getPersons().sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getID() < o2.getID()) {
					return 1;
				}else {
					return -1;
				}
			}
		});
	}

}
