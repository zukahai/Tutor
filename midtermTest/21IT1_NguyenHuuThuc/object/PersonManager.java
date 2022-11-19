package object;

import java.util.ArrayList;

public class PersonManager {
	static ArrayList<Person> persons = new ArrayList<>();
	public static void clear() {
		persons.clear();
	}
	public static void add(Person p) {
		persons.add(p);
	}
	public static ArrayList<Person> getPersons() {
		return persons;
	}
	public static void setPersons(ArrayList<Person> persons) {
		PersonManager.persons = persons;
	}
	public static Person findID(int ID) {
		for(Person p : persons) {
			if(p.getID() == ID) {
				return p;
			}
		}
		return null;
	}
	public static ArrayList<Person> findName(String name) {
		ArrayList<Person> pers = new ArrayList<>();
		for(Person p : persons) {
			if(p.getName().toUpperCase().indexOf(name.toUpperCase()) > -1) {
				pers.add(p);
			}
		}
		return pers;		
	}
	public static ArrayList<Person> findAge(int age) {
		ArrayList<Person> pers = new ArrayList<>();
		for(Person p : persons) {
			if(p.getAge() == age) {
				pers.add(p);
			}
		}
		return pers;
	}
	public static ArrayList<Person> findAddress(String address) {
		ArrayList<Person> pers = new ArrayList<>();
		for(Person p : persons) {
			if(p.getAddress().toUpperCase().indexOf(address.toUpperCase()) > -1) {
				pers.add(p);
			}
		}
		return pers;
	}
}
