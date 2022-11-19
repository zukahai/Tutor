package object.sort;

import java.util.Comparator;

import object.Person;
import object.PersonManager;
import object.Process;

public class GiamTheoName extends Process{

	public GiamTheoName() {
		super("Giam Theo Name");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		PersonManager.getPersons().sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getName().compareTo(o2.getName()) < 0) {
					return 1;
				}else {
					return -1;
				}
			}
		});
	}

}
