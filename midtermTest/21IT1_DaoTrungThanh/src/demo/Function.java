package demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import demo.Person;
import demo.Student;
import demo.Teacher;

public class Function {
	static 	Scanner sc = new Scanner(System.in);
	static ArrayList<Person> persons = new ArrayList<>();

	public static void displayMenu6() {
		System.out.println("______________________________________________");
		System.out.println("6.1. Print Teacher.");
		System.out.println("6.2. Print Student.");
		System.out.println("______________________________________________");
	
	}
	
	public static void displayMenu5() {
		System.out.println("______________________________________________");
		System.out.println("5.1. Find by ID.");
		System.out.println("5.2. Find by name.");
		System.out.println("5.3. Find by age .");
		System.out.println("5.4. Find by address.");
		System.out.println("______________________________________________");
		
	}
	
	public static void displayMenu4() {
		System.out.println("______________________________________________");
		System.out.println("4.1. Ascending by id.");
		System.out.println("4.2. Descending by id.");
		System.out.println("4.3. Ascending by name .");
		System.out.println("4.4. Descending by name.");
		System.out.println("4.5. Ascending by age.");
		System.out.println("4.6. Descending by age.");
		System.out.println("4.7. Ascending by address.");
		System.out.println("4.8. Descending by address.");
		System.out.println("4.9. Sort teacher and student.");
		System.out.println("4.10. Back.");
		System.out.println("_______________________________________________");
					
		}	
	
public static void displayMenu() {
	System.out.println("______________________________________________");
	System.out.println("1. Display all.");
	System.out.println("2. Add 1 Student.");
	System.out.println("3. Add 1 Teacher .");
	System.out.println("4. Sort Person.");
	System.out.println("5. Find.");
	System.out.println("6. Print information.");
	System.out.println("7. Delete information.");
	System.out.println("8. Update information.");
	System.out.println("9. Delete all information.");
	System.out.println("10. Exit.");
	System.out.println("_______________________________________________");
				
	}
	
public static void addStudent() {
		
	boolean kt;
	boolean k=true;
	while(k) {
			kt=true;
		System.out.print("ID: ");
		int id = sc.nextInt();
		for (Person person : persons)
		{
			if (person.getID()==id)
			{
				System.out.println("ID nay da ton tai vai long nhap lai");
				kt =false;
				break;
			}	
	}
	if (kt)
	{
		Student st = new Student();
		st.Input();
		persons.add(st);
		System.out.println("Added");
		break;
		
			}
		}
	}

public static void addTeacher() {
	boolean kt;
	boolean k=true;
	while(k) {
			kt=true;
		System.out.print("ID: ");
		int id = sc.nextInt();
		for (Person person : persons)
		{
			if (person.getID()==id)
			{
				System.out.println("ID nay da ton tai vai long nhap lai");
				kt =false;
				break;
			}	
	}
	if (kt)
	{
		Teacher tc = new Teacher();
		tc.Input();
		persons.add(tc);
		System.out.println("Added");
		break;
		
			}
		}
}

public  void displayAll() {
	for(Person person : persons) {
		
		person.display();
	}
}
	
public static void sortIDt() {
	persons.sort(new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			 if (o1.getID() > o2.getID()) return 1;
				else
					return -1;
		}				
		
	});
}

public static void sortIDg() {
	persons.sort(new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			 if (o1.getID() < o2.getID()) return 1;
				else
					return -1;
		}				
		
	});
}

public static void sortNameT() {
	
	persons.sort(new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			int k = o1.getName().compareTo(o2.getName()) ;
				if(k>0) return 1;
				else return -1;
		}
		
	});
	
}

public static void sortNameG() {
	
	persons.sort(new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			int k = o1.getName().compareTo(o2.getName()) ;
				if(k<0) return 1;
				else return -1;
		}
		
	});
	
}

public static void sortAddressT() {
	persons.sort(new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			int h = o1.getAddress().compareTo(o2.getAddress()) ;
			if(h>0) return 1;
			else return -1;
		}
	});
}

public static void sortAddressG() {
	persons.sort(new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			int h = o1.getAddress().compareTo(o2.getAddress()) ;
			if(h<0) return 1;
			else return -1;
		}
	});
}



public static void sortAgeT() {
	persons.sort(new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			 if (o1.getAge() > o2.getAge()) return 1;
				else
					return -1;
		}
	});
}

public static void sortAgeG() {
	persons.sort(new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			 if (o1.getAge() < o2.getAge()) return 1;
				else
					return -1;
		}
	});
}

public static void sortTeacherStudent() {
	persons.sort(new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			if(o1 instanceof Student && o2 instanceof Teacher) {
				return 1;
			}else if(o1 instanceof Student && o2 instanceof Student){
				return ((Student)o1).getAverage() > ((Student)o2).getAverage() ? 1 : -1;
			}else if(o1 instanceof Teacher && o2 instanceof Teacher){
				return ((Teacher)o1).getExperience() > ((Teacher)o2).getExperience() ? 1 : -1;
			}
			return -1;
		}
	});
	
}

public static void findName() {
	
	System.out.println("What is it name: ");
	sc.nextLine();
	String name = sc.nextLine();
	boolean found = false;
	for ( Person person : persons) {
		if(person.getName().toUpperCase().equals(name.toUpperCase())) {
			person.toString();
			found = true;
		}
	}
	if(!found) {
		System.out.println("Not Found");
	}
}

public static void findID() {
	System.out.println("What is it ID: ");
	int id = sc.nextInt();
	boolean found = false;
	for( Person person : persons) {
		if(person.getID()==id) {
			person.display();
			found = true;
		}
	}
	if(!found) {
		System.out.println("Not found");
	}
}

public static void findAge() {
	System.out.println("How old is it: ");
	sc.nextInt();
	int age = sc.nextInt();
	boolean found = false;
	for( Person person : persons) {
		if(person.getAge()==age) {
			person.display();
			found = true;
		}
	}
	if(!found) {
		System.out.println("Not found");
	}
}

public static void findAddress() {
	
	System.out.println("Where is it address: ");
	sc.nextLine();
	String address = sc.nextLine();
	boolean found = false;
	for ( Person person : persons) {
		if(person.getAddress().toUpperCase().equals(address.toUpperCase())) {
			person.display();
			found = true;
		}
	}
	if(!found) {
		System.out.println("Not Found");
	}
}

	public void findTeacher() {
		
			for(Person p : persons) {
				if(p instanceof Teacher) {
					p.display();
				}
			}
		
		}
		
	public void findStudent() {
		for(Person l : persons) {
			if(l instanceof Student) {
				l.display();
			}
		}
	}
	
	public void deleteID() {
		System.out.println("Enter ID: ");
		int id=sc.nextInt();
		Person pp = null;
		for(Person p : persons) {
			if(id == p.getID()) {
				pp = p;
				break;
			}
		}
		if(pp == null) {
			System.out.println("ID khong ton tai");
		}else {
			System.out.print("Da xoa ");pp.display();
			persons.remove(pp);
		}
		
	}
	public void update() {
		System.out.println("1.Edit Student");
		System.out.println("2.Edit Teacher");
		int h = sc.nextInt();
		while (true) {
			switch(h) {
			case 1: 
				
					findStudent();
					deleteID();
					System.out.println("Enter info");
					addStudent();
					break;
			case 2: 
					findTeacher();
					deleteID();
					System.out.println("Enter info");
					addTeacher();
					break;
			case 3: 
					System.out.println("back");
					return;
			default: 
					System.out.println("Eror");
					break;
			}
		}
	}			
	
	public void deleteAll() {
		persons.clear();
		System.out.println("Done");
	}
}


