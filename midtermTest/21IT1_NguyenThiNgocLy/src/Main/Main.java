package Main;

import java.util.Scanner;



import object.Menu;




import object.Person;
import object.Student;
import object.Teacher_;

public class Main {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		
		int choice;
		do {
			System.out.println("==============================================");
			System.out.println("1. Xem tất cả thông tin\r\n"
					
					+ "2. Nhập vào một Student\r\n"
					
					+ "3. Nhập vào một Teacher\r\n"
					
					+ "4. Sắp xếp các Persons:\r\n"
					
					+ "5. Tìm kiếm và in ra các Person dựa vào:\r\n"
					
					+ "6. In thông tin của tất cả:\r\n"
					
					
					+ "7. Xóa thông tin theo ID\r\n"
					
					+ "8. Sửa thông tin theo ID\r\n"
					
					
					+ "9. Xóa tất cả dữ liệu.\r\n"
					
					+ "10. Thoát chương trình.");
			System.out.println("==============================================");
			System.out.print("Lựa chọn : ");
			choice = sc.nextInt();

			switch ( choice ) {
			case 1:
				menu.output();
				break;
			case 2:
				int id;
				boolean check ;
				do {
					System.out.println(
							"\n====================================================" + "===========================");
					System.out.println("\nEnter the information of the Student.");
		            Person p = new Student();
//		            sc.nextLine();
		            p.input();
		            
		             id = p.getID();
		             check= menu.unique(id);
		             if( check ==false)
		           	  menu.them(p);
		      		}while(check==true);
	            
	            
	       
	        System.out.println("Information just entered");
	        
	        break;
	        
		case 3:
			int i;
			boolean check1;
		    	do {
		    		System.out.println(
							"\n====================================================" + "===========================");
					System.out.println("\nEnter the information of the Teacher.");
		            Person pt = new Teacher_();
//		            sc.nextLine();
		            pt.input();
		            i = pt.getID();
		            check1=menu.unique(i);
		            if(check1==false)
		            menu.them(pt);
		                   
		    	}while(check1==true);
            	
          
       
        System.out.println("Information just entered");
        
        break;
	        case 4:
				System.out.print("Lựa chọn nhỏ: ");
				int c = sc.nextInt();
			switch (c){
			
			case 1:
				menu.tangID();
				menu.output();
				break;
			case 2:
				menu.giamID();
				menu.output();
				break;
			case 3:
				menu.tangName();
				menu.output();
				break;
			case 4:
				menu.giamName();
				menu.output();
				break;
			case 5:
				menu.tangAge();
				menu.output();
				break;
			case 6:
				menu.giamAge();
				menu.output();
				break;
			case 7:
				menu.tangAddress();
				menu.output();
				break;
			case 8:
				menu.giamAddress();
				menu.output();
				break;
			case 9:
				menu.tang();
				menu.output();
				break;
				
			}
			break;
	        case 5:
	        	System.out.print("Lựa chọn nhỏ: ");
				int t = sc.nextInt();
			switch (t){
			
			case 1:
				sc.nextLine();
				System.out.print("Enter ID: ");
				int n = sc.nextInt();
				menu.timID(n);
				break;
			case 2:
				sc.nextLine();
				System.out.print("Enter Name: ");
				String r = sc.nextLine();
				menu.timName(r);
				break;
			case 3:
				sc.nextLine();
				System.out.print("Enter Age: ");
				int q = sc.nextInt();
				menu.timAge(q);
				break;
			case 4:
				sc.nextLine();
				System.out.print("Enter Address: ");
				String m = sc.nextLine();
				menu.timAddress(m);
				break;
				
				
			}
			break;
	        case 6:
	        	System.out.print("Lựa chọn nhỏ: ");
				int a = sc.nextInt();
			switch (a){
			
			case 1:
				menu.hienThiT();
				
		
				break;
			case 2:
				menu.hienThiS();
				break;
			
			}
			break;
	        case 7:
	        	sc.nextLine();
				System.out.print("Enter ID: ");
				int n = sc.nextInt();
				menu.xoa(n);
				break;
	        case 8:
	        	
	        	sc.nextLine();
				System.out.print("Enter ID: ");
				int o = sc.nextInt();
				menu.sua(o);
				
				break;
	        case 9:
	        	menu.deleteAll();
	        	
	        	break;
	        	
	        	
				
	        	
	        	
			}
			}while(choice !=10);

		}
		

	}