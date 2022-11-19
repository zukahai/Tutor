package QuanLy;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.io.IOException;
import java.util.List;
public class Main
{
	static ArrayList <Person> person = new ArrayList<>();
	static ArrayList <Student> student = new ArrayList<>();
	static ArrayList <Teacher> teacher = new ArrayList<>();
	public static void QuanLy()
	{
		System.out.println("==========MENU==========");
		System.out.println("1. See information ");
		System.out.println("2. Add student ");
		System.out.println("3. Add teacher ");
		System.out.println("4. Sort ");
		System.out.println("5. Find information ");
		System.out.println("6. Delete information");
		System.out.println("7. Eidt information ");
		System.out.println("8. Exit ");
		System.out.println("========================");
		
	}
	public static void thongtin()
	{
		System.out.println("==========MENU==========");
		System.out.println("1. See all information ");
		System.out.println("2. See student information ");
		System.out.println("3. See teacher information ");
		System.out.println("4. Back to lobby ");
		System.out.println("========================");
		
	}
	public static void sapxep()
	{
		System.out.println("===================================MENU===================================");
		System.out.println("1. Sort id ascending ");
		System.out.println("2. Sort id descending ");
		System.out.println("3. Sort name ascending  ");
		System.out.println("4. Sort name descending  ");
		System.out.println("5. Sort age ascending  ");
		System.out.println("6. Sort age descending  ");
		System.out.println("7. Sort address ascending ");
		System.out.println("8. Sort address descending  ");
		System.out.println("9. Sort teacher(experience ascending) --> student(average ascending) ");
		System.out.println("10. Back to lobby ");
		System.out.println("==========================================================================");
	}
	public static void timkiem()
	{
		System.out.println("==========MENU==========");
		System.out.println("1. Find id ");
		System.out.println("2. Find name ");
		System.out.println("3. Find age ");
		System.out.println("4. Find address ");
		System.out.println("5. Back to lobby ");
		System.out.println("========================");
		
	}
	public static void xoa()
	{
		System.out.println("==========MENU==========");
		System.out.println("1. Delete by ID ");
		System.out.println("2. Delete all ");
		System.out.println("3. Back to lobby ");
		System.out.println("========================");
	}
	public static void sua()
	{
		System.out.println("==========MENU==========");
		System.out.println("1. Edit student ");
		System.out.println("2. Edit teacher");
		System.out.println("3. Back to lobby ");
		System.out.println("========================");
	}
	public static void infall()
	{
		for ( Person person : person)
			person.display();
		
	}
	public static void infstudent()
	{
		for ( Student student : student  )
			student.display();
		
	}
	public static void infteacher()
	{
		for ( Teacher person : teacher )
			person.display();
		
	}
	public static void addstudent()
	{
		boolean st = true;
		Person p = new Student();
		p.input2();
		for ( Person person : person )
			while (st = true )
			{
				if (person.getId() == p.getId())
				{
					System.out.println("ID has been used\n");
					p.input2();
					
				}
				else 
					break;
				
			}
		p.input();	
		student.add((Student) p);
	    person.add(p);
		
	}
	public static void addteacher()
	{
		Person p = new Teacher();
		boolean st = true;
		p.input2();
		for ( Person person : person )
			while (st = true )
			{
				if (person.getId() == p.getId())
				{
					System.out.println("ID has been used\n");
					p.input2();
					
				}
				else 
					break;
				
			}
		p.input();	
		teacher.add((Teacher) p);
		person.add(p);
	}
	public static void idsort() 
	{
		person.sort( new Comparator<Person>() 
		{
			@Override
			public int compare(Person o1, Person o2)
			{
				if (o1.getId() > o2.getId())
					return 1;
			return -1;	
			}
			
		});		
	}
	public static void idsort2() 
	{
		person.sort( new Comparator<Person>() 
		{
			@Override
			public int compare(Person o1, Person o2)
			{
				if (o1.getId() > o2.getId())
					return -1;
			return 1;	
			}
			
		});	
		
	}
	public static void namesort() 
	{
		person.sort( new Comparator<Person>() 
		{
			@Override
			public int compare(Person o1, Person o2)
			{
				if (o1.getName().compareTo(o2.getName()) > 0)
					return 1;
			return -1;	
			}
			
		});	
		
	}
	public static void namesort2() 
	{
		person.sort( new Comparator<Person>() 
		{
			@Override
			public int compare(Person o1, Person o2)
			{
				if (o1.getName().compareTo(o2.getName()) > 0)
					return -1;
			return 1;	
			}
			
		});	
		
	}
	public static void agesort() 
	{
		person.sort( new Comparator<Person>() 
		{
			@Override
			public int compare(Person o1, Person o2)
			{
				if (o1.getAge() > o2.getAge())
					return 1;
			return -1;	
			}
			
		});		
	}
	public static void agesort2() 
	{
		person.sort( new Comparator<Person>() 
		{
			@Override
			public int compare(Person o1, Person o2)
			{
				if (o1.getAge() > o2.getAge())
					return -1;
			return 1;	
			}
			
		});		
	}
	public static void addresssort() 
	{
		person.sort( new Comparator<Person>() 
		{
			@Override
			public int compare(Person o1, Person o2)
			{
				if (o1.getAddress().compareTo(o2.getAddress()) > 0)
					return 1;
			return -1;	
			}
			
		});	
		
	}
	public static void addresssort2() 
	{
		person.sort( new Comparator<Person>() 
		{
			@Override
			public int compare(Person o1, Person o2)
			{
				if (o1.getAddress().compareTo(o2.getAddress()) > 0)
					return -1;
			return 1;	
			}
			
		});	
		
	}
	public static void experiencesort() 
	{
		teacher.sort( new Comparator<Teacher>() 
		{
			@Override
			public int compare(Teacher o1, Teacher o2)
			{
				if (o1.getExperience() > o2.getExperience())
					return 1;
			return -1;	
			}
			
		});		
	}
	public static void averagesort() 
	{
		student.sort( new Comparator<Student>() 
		{
			@Override
			public int compare(Student o1, Student o2)
			{
				if (o1.getAverage() > o2.getAverage())
					return 1;
			return -1;	
			}
			
		});		
	}
	public static void idfind()
	{
		Scanner sc = new Scanner(System.in);
		int id;
		int t = 1;
		System.out.print("Enter id: ");
		id = sc.nextInt();
		for ( Person person : person)
		{
			if (person.getId() == id)
			{ 
				person.display();
				t += 1;
			}
			
		}
		if ( t == 1)
		{
			System.out.println("Not found!");
		}
	}
	public static void namefind()
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int t = 1;
		System.out.print("Enter name: ");
		name = sc.nextLine();
		for (Person person : person)
		{
			if (person.getName().equals(name))
			{ 
				person.display();
				t += 1;
			}
			
		}
		if ( t == 1)
		{
			System.out.println("Not found!");
		}
	}
	public static void agefind()
	{
		Scanner sc = new Scanner(System.in);
		int age;
		int t = 1;
		System.out.print("Enter age: ");
		age = sc.nextInt();
		for ( Person person : person)
		{
			if (person.getAge() == age)
			{ 
				person.display();
				t += 1;
			}
			
		}
		if ( t == 1)
		{
			System.out.println("Not found!");
		}
	}
	public static void addressfind()
	{
		Scanner sc = new Scanner(System.in);
		String address;
		int t = 1;
		System.out.print("Enter address: ");
		address = sc.nextLine();
		for (Person person : person)
		{
			if (person.getAddress().equals(address))
			{ 
				person.display();
				t += 1;
			}
			
		}
		if ( t == 1)
		{
			System.out.println("Not found!");
		}
	}
	public static  void infdelete()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id you want to delete: ");
		int id = sc.nextInt();
		    int size = person.size();
		    Person p = new Person();
			for (int i = 0; i <= size; i++)
			{
				if (person.get(i).getId() == id )
				{
					p = person.get(i);
					break;
				}
				
			}
			person.remove(p);
			student.remove(p);
			teacher.remove(p);
			
			
		   
				
			
	}
	public static  void infedit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id you want to edit: ");
		int id = sc.nextInt();
		sc.nextLine();
		int size = student.size();
	    Person p = new Person();
		for (int i = 0; i <= size; i++)
		{
			if (student.get(i).getId() == id )
			{
			    System.out.print("Enter name: ");
			    String name = sc.nextLine();
			    System.out.print("Enter age: ");
			    int age = sc.nextInt();
			    sc.nextLine();
			    System.out.print("Enter address: ");
			    String address = sc.nextLine();
				System.out.print("Enter math: ");
				float math = sc.nextFloat();
				System.out.print("Enter physics: ");
				float physics = sc.nextFloat();
				System.out.print("Enter chemistry: ");
				float chemistry = sc.nextFloat();
				student.get(i).setName(name);
				student.get(i).setAge(age);
				student.get(i).setAddress(address);
				student.get(i).setMath(math);
				student.get(i).setPhysics(physics);
				student.get(i).setChemistry(chemistry);
				break;
				
			}
			
			
		}
		
				
			
	}
	public static void infedit2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id you want to edit: ");
		int id = sc.nextInt();
		sc.nextLine();
		int size2 = teacher.size();
		for (int i = 0; i <= size2; i++)
		{
			if (teacher.get(i).getId() == id )
			{
			    System.out.print("Enter name: ");
			    String name = sc.nextLine();
			    System.out.print("Enter age: ");
			    int age = sc.nextInt();
			    sc.nextLine();
			    System.out.print("Enter address: ");
			    String address = sc.nextLine();	
			    System.out.print("Enter experience: ");
				int experience = sc.nextInt();
				teacher.get(i).setName(name);
			    teacher.get(i).setAge(age);
				teacher.get(i).setAddress(address);
				teacher.get(i).setExperience(experience);	
				break;
				
			}
			
			
		}
	}
		
		
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
	    boolean quanly = true;
	    while ( quanly == true )
	    {
	    	QuanLy();
	    	System.out.print("Enter choice: ");
	    	choice = sc.nextInt();
	    	switch( choice )
	    	{
	    	case 1:
	    		boolean c1 = true;
	    		while (c1 == true )
	    		{
	    			thongtin();
	    			System.out.print("Enter choice: ");
	    			int k1 = sc.nextInt();
	    			switch (k1)
	    			{
	    			case 1:
	    				infall();
	    				break;
	    			case 2:
	    				infstudent();
	    				break;
	    			case 3:
	    				infteacher();
	    				break;
	    			case 4:
	    				c1 = false;
	    				break;
	    			default:
	    				System.out.println("Nothing ");
	    			
	    			}
	    			
	    		}
	    		
	    		break;
	    	case 2:
	    		addstudent();
	    		break;
	    	case 3:
	    		addteacher();
	    		break;
	    	case 4:
	    		boolean c4 = true;
	    		while ( c4 == true )
	    		{
	    			sapxep();
	    			System.out.print("Enter choice: ");
	    			int k4 = sc.nextInt();
	    			switch(k4)
	    			{
	    			case 1:
	    				idsort();
	    				infall();
	    				break;
	    			case 2:
	    				idsort2();
	    				infall();
	    				break;
	    			case 3:
	    				namesort();
	    				infall();
	    				break;
	    			case 4:
	    				namesort2();
	    				infall();
	    				break;
	    			case 5:
	    				agesort();
	    				infall();
	    				break;
	    			case 6:
	    				agesort2();
	    				infall();
	    				break;
	    			case 7:
	    				addresssort();
	    				infall();
	    				break;
	    			case 8:
	    				addresssort2();
	    				infall();
	    				break;
	    			case 9:
	    				experiencesort();
	    				averagesort();
	    				infteacher();
	    				infstudent();
	    				break;
	    			case 10:
	    				c4 = false;
	    				break;
	    			default:
	    				System.out.println("Nothing ");
	    			}
	    			
	    		}
	    		break;
	    	case 5:
	    		boolean c5 = true;
	    		while(c5 == true)
	    		{
	    			timkiem();
	    			System.out.print("Enter choice: ");
	    			int k5 = sc.nextInt();
	    			switch(k5)
	    			{
	    			case 1:
	    				idfind();
	    				break;
	    			case 2:
	    				namefind();
	    				break;
	    			case 3:
	    				agefind();
	    				break;
	    			case 4:
	    				addressfind();
	    				break;
	    			case 5:
	    				c5 = false;
	    				break;
	    			default:
	    				System.out.println("Nothing ");
	    			}
	    		}
	    		break;
	    	case 6:
	    		boolean c6 = true;
	    		while ( c6 == true )
	    		{
	    			xoa();
	    			System.out.print("Enter choice: ");
	    			int k6 = sc.nextInt();
	    			switch(k6)
	    			{
	    			case 1: 
	    				infall();
	    				infdelete();
	    				break;
	    			case 2:
	    				person.clear();
	    				student.clear();
	    				teacher.clear();
	    				break;
	    			case 3:
	    				c6 = false;
	    				break;
	    			default:
	    				System.out.println("Nothing ");
	    			}
	    			
	    			
	    		}
	    		break;
	    	case 7:
	    		boolean c7 = true;
	    		while ( c7 == true )
	    		{
	    			sua();
	    			System.out.print("Enter choice: ");
	    			int k7 = sc.nextInt();
	    			switch (k7)
	    			{
	    			case 1:
	    				infstudent();
	    				infedit();
	    				break;
	    			case 2:
	    				infteacher();
	    				infedit2();
	    				break;
	    			case 3:
	    				c7 = false;
	    				break;
	    				
	    				
	    			}
	    		}
	    		
	    			
	    		break;
	    		
	    	case 8:
	    		quanly = false;
	    		break;
	    	default:
				System.out.println("Nothing ");
	    	
	    		
	    		
	    		
	    	}
	    }
	    System.out.println("Exit");
	 
		
	}

}
