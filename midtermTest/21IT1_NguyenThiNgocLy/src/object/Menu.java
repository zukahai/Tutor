package object;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {
	public ArrayList<Person> danhSach;
	
	public Menu() {
		this.danhSach = new ArrayList<Person>();
		}
	public Menu(ArrayList<Person> danhSach) {
		this.danhSach = danhSach;
	}
	
	
	
	public void output() {
		for(Person p : danhSach) {
			System.out.println(p);
		}
	}
	public void them(Person p) {
		this.danhSach.add(p);
	}
	public void tangID() {
		danhSach.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getID() > o2.getID())
					return 1;
				else
					return -1;

			}
		});
	
	}
	public void giamID() {
		danhSach.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getID() < o2.getID())
					return 1;
				else
					return -1;

			}
		});
	
		
	}
	public void tangName() {
		danhSach.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
	}
	public void giamName() {
	danhSach.sort(new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			return o2.getName().compareTo(o1.getName());
		}
	});
	
	}
	public void tangAge() {
		danhSach.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getAge() > o2.getAge())
					return 1;
				else
					return -1;

			}
		});
		
		
	}
	public void giamAge() {
		danhSach.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getAge() < o2.getAge())
					return 1;
				else
					return -1;

			}
		});
	
		
	}
	public void tangAddress() {
		danhSach.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
	}
	public void giamAddress() {
	danhSach.sort(new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			return o2.getName().compareTo(o1.getName());
		}
	});
	
	}
	public void tang() {
		danhSach.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if(o1 instanceof Student && o2 instanceof Teacher_) {
				return 1;
				}else if(o1 instanceof Student && o2 instanceof Student ) {
					return ((Student)o1).getAverage() > ((Student)o2).getAverage() ? 1:-1;
				}else if(o1 instanceof Teacher_ && o2 instanceof Teacher_ ) {
					return ((Teacher_)o1).getExperience() > ((Teacher_)o2).getExperience() ? 1 : -1;
				}
				return -1;
			}
		});
	
	
	}
	public void hienThiS() {
		for(Person p : danhSach) {
			if(p instanceof Student) {
				System.out.println(p);
				
				
			}
			
		}

			
	}
	public void hienThiT() {
		for(Person p : danhSach) {
			if(p instanceof Teacher_) {
				System.out.println(p);
				
				
			}
			
		}

			
	}
	
	public void timID(int id) {
		for(Person p : danhSach) {
			if( p.getID() == id) {
				System.out.println(p);
				
				
			}
		}
	}
	public void timName(String name) {
		for(Person p : danhSach) {
			if( p.getName().indexOf(name)>=0) {
				System.out.println(p);
				
				
			}
		}
	}
	public void timAddress(String address) {
		for(Person p : danhSach) {
			if( p.getName().indexOf(address)>=0) {
				System.out.println(p);
				
				
			}
		}
	}
	public void timAge(int age) {
		for(Person p : danhSach) {
			if( p.getID() == age) {
				System.out.println(p);
				
				
			}
		}
	}
	public void xoa(int id) {
		for(Person p : danhSach) {
			if( p.getID() == id) {
				this.danhSach.remove(p);
				
				
			}
		}
	}
	public void sua(int id) {
		Scanner sc =  new Scanner(System.in);
		Person t = null;
		for(Person p : danhSach) {
			
			if( p.getID() == id) {
				System.out.println(p);
				danhSach.remove(p);
				if( p instanceof Student) {
//					
//					danhSach.remove(p);
					t= new Student();
					System.out.println("\nEdit the information.");
					t.setID(id);
					t.input1();
//					danhSach.add(t);
					System.out.println("Information just edited");
					break;
			}
				if(p instanceof Teacher_) {
//					danhSach.remove(p);
					t= new Teacher_();
					System.out.println("\nEdit the information.");
					t.setID(id);
					t.input1();
//					danhSach.add(t);
					System.out.println("Information just edited");
					break;
				}
		} 
			}danhSach.add(t);
	}
	public void deleteAll() {
		this.danhSach.removeAll(danhSach);
	}
	public boolean unique(int id) {
		
		for(Person p : danhSach) {
			if( p.getID() == id) {
				System.out.println("Nhập lại");
			return true;
			}
		}
		
		return false;
		
	}
	
}
