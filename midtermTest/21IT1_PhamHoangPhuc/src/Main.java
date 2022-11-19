import java.util.Scanner;
import java.lang.String;


public class Main {
	static boolean ok = true;
	static int n, d = 0, id;
	static Person a[] = new Person[1000000];

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		while (ok) {
			System.out.println("==================MENU==============");
			System.out.println("1/ Xem tat ca thong tin");
			System.out.println("2/ nhap mot Student");
			System.out.println("3/ Nhap mot Teacher");
			System.out.println("4/ Sap xep danh sach");
			System.out.println("5/ Tim kiem ");
			System.out.println("6/ In theo");
			System.out.println("7/ Xoa thong tin");
			System.out.println("8/ Sua thong tin");
			System.out.println("9/ Xoa toa bo danh sach");
			System.out.println("10/ Exit!!!");
			System.out.println("===========Moi chon=================");
			n = sc.nextInt();
			sc.nextLine();
		switch (n) {
		
		case 1: {
			in();
			if (d == 0) System.out.println("khong co du lieu!!");
			sc.nextLine();
			break;
		}
		
		case 2: {
			System.out.println("====Nhap mot Student================");
			System.out.print("ID:");
			id = sc.nextInt();
			sc.nextLine();
			if (find(id) == -1) {
				a[d] = new Student();
				a[d].setID(id);
				a[d].setXd(1);
				a[d].input();
				d++;
				System.out.println("cap nhat thanh cong!!!!");
			} else {
				System.out.println("ID da ton tai!!!!");
				
			}
			
			sc.nextLine();
			
			break;
		}
		
		case 3: {
			System.out.println("======Nhap mot Teacher==============");
			System.out.print("ID:");
			id = sc.nextInt();
			sc.nextLine();
			if (find(id) == -1) {
				a[d] = new Teacher();
				a[d].setID(id);
				a[d].setXd(2);
				a[d].input();
				d++;
				System.out.println("cap nhat thanh cong!!!!");
			} else {
				System.out.println("ID da ton tai!!!!");
						}
			
			sc.nextLine();
		
			break;
		}
		
		case 4: {
			boolean ok1 = true;
			while (ok1) {
			System.out.println("=======Sap xep======================");
			System.out.println("1/ tang theo ID");
			System.out.println("2/ giam theo ID");
			System.out.println("3/ tang theo name");
			System.out.println("4/ giam theo name");
			System.out.println("5/ tang theo age");
			System.out.println("6/ giam theo age");
			System.out.println("7/ tang theo address");
			System.out.println("8/ giam theo address");
			System.out.println("9/ teacher -> student");
			System.out.println("0/ Back to Hell");
			System.out.println("=======Moi chon=====================");
			int sx = sc.nextInt();
			switch (sx) {
			
			case 1: {
				for(int i = 0; i < d - 1 ; i++) {
					for (int j = i + 1; j < d; j++) {
						if (a[i].getID() > a[j].getID()) swap(i , j);
					}
				}
				in();
				sc.nextLine();
				
				break;
			}
			
			case 2: {
				for(int i = 0; i < d - 1 ; i++) {
					for (int j = i + 1; j < d; j++) {
						if (a[i].getID() < a[j].getID()) swap(i , j);
					}
				}
				in();
				sc.nextLine();
				
				break;
			}
			
			case 3: {
				for(int i = 0; i < d - 1 ; i++) {
					for (int j = i + 1; j < d; j++) {
						if (a[i].getName().compareTo(a[j].getName()) > 0) swap(i , j);
					}
					
				}
				in();
				sc.nextLine();
				
				break;
			}
			
			case 4: {
				for(int i = 0; i < d - 1 ; i++) {
					for (int j = i + 1; j < d; j++) {
						if (a[i].getName().compareTo(a[j].getName()) < 0) swap(i , j);
					}
					
				}
				in();
				sc.nextLine();
				
				break;
			}
			
			case 5: {
				for(int i = 0; i < d - 1 ; i++) {
					for (int j = i + 1; j < d; j++) {
						if (a[i].getAge() > a[j].getAge()) swap(i , j);
					}
				}
				in();
				sc.nextLine();
				
				break;
			}
			
			case 6: {
				for(int i = 0; i < d - 1 ; i++) {
					for (int j = i + 1; j < d; j++) {
						if (a[i].getAge() < a[j].getAge()) swap(i , j);
					}
				}
				in();
				sc.nextLine();
				
				break;
			}
			
			case 7: {
				for(int i = 0; i < d - 1 ; i++) {
					for (int j = i + 1; j < d; j++) {
						if (a[i].getAddress().compareTo(a[j].getAddress()) > 0) swap(i , j);
					}
					
				}
				in();
				sc.nextLine();
				
				break;
			}
			 
			case 8: {
				for(int i = 0; i < d - 1 ; i++) {
					for (int j = i + 1; j < d; j++) {
						if (a[i].getAddress().compareTo(a[j].getAddress()) < 0) swap(i , j);
					}
					
				}
				in();
				sc.nextLine();
				
				break;
			}
			
			case 9: {
				//System.out.println("sap toi!!!!!");
				for (int i = 0; i < d-1; i++) {
					for (int j = i+1; j < d; j++) {
						if( a[i].getXd() < a[j].getXd()) swap(i, j);
						else if (a[i].getXd() == 2 && a[j].getXd() == 2) {
							Teacher tg1 = new Teacher(), tg2 = new Teacher();
							tg1 = (Teacher) a[i];
							tg2 = (Teacher) a[j];
							if (tg1.getExperience() > tg2.getExperience()) swap (i,j);
						} else if (a[i].getXd() == 1 && a[j].getXd() == 1) {
							Student tg1 = new Student(), tg2 = new Student();
							tg1 = (Student) a[i];
							tg2 = (Student) a[j];
							if (tg1.getAverage() > tg2.getAverage()) swap(i, j);
							
						}
					}
				}
				in();
				sc.nextLine();
				sc.nextLine();
				break;
			}
			
			case 0: {
				ok1 = false;
				break;
			}
			} // switch
			} // while
			
			break;
		} // case 4
		
		case 5: {
			int tk;
			boolean ok2 = true;
			while (ok2) {
			System.out.println("========Tim kiem====================");
			System.out.println("1/ ID");
			System.out.println("2/ name");
			System.out.println("3/ age");
			System.out.println("4/ address");
			System.out.println("0/ Back to HELL!!!!!!!!!!");
			System.out.println("=========moi chon===================");
			tk = sc.nextInt();
			sc.nextLine();
			switch (tk) {
			
			case 1: {
				System.out.print("nhap ID can tim:");
				int id1 = sc.nextInt(); sc.nextLine();
				if (find(id1) >= 0) 
					a[find(id1)].display();
					else System.out.println("404 Not Found");
				sc.nextLine();
				
				break;
			}
			
			case 2: {
				System.out.print("nhap ten can tim:");
				String namef = sc.nextLine();
				boolean okt = true;
				for (int i = 0; i < d; i++) {
					if ( a[i].getName().indexOf(namef) > -1) {
						a[i].display();
						okt = false;
					}
				}
				if (okt) System.out.println("404 Not Found");
				sc.nextLine();
				
				break;
			}
			
			case 3: {
				System.out.print("nhap tuoi can tim:");
				int tuoi = sc.nextInt(); sc.nextLine();
				boolean okt = true;
				for (int i = 0; i < d; i++) {
					if (a[i].getAge() == tuoi) {
						a[i].display();
						okt = false;
					}
				}
				if (okt) System.out.println("404 Not Found");
				sc.nextLine();
				
				break;
			}
			
			case 4: {
				System.out.print("nhap dia chi can tim:");
				String dc = sc.nextLine();
				boolean okt = true;
				for (int i = 0; i < d; i++) {
					if ( a[i].getAddress().indexOf(dc) > -1) {
						a[i].display();
						okt = false;
					}
				}
				if (okt) System.out.println("404 Not Found");
				sc.nextLine();
				
				break;
			}
			
			case 0: {
				ok2 = false;
				break;
			}
			
			
			}// switch
			
			}// while ok2
			
			break;
		}// case 5 
		
		case 6: {
			boolean ok3 = true;
			while (ok3) {
			System.out.println("======in thong tin=================");
			System.out.println("1/ teacher");
			System.out.println("2/ student");
			System.out.println("0/ Back to HELL!!!!!!!!");
			System.out.println("==========moi chon=================");
			int tt = sc.nextInt(); sc.nextLine();
			switch (tt) {
			
			case 1: {
				System.out.println("==========Teacher==============");
				boolean okt = true;
				for (int i = 0; i < d; i++) {
					if (a[i].getXd() == 2) {
						a[i].display();
						okt = false;
					}
				}
				if (okt) System.out.println("404 Not Found");
				sc.nextLine();
				
				break;
			}
			
			case 2: {
				System.out.println("============Student===========");
				boolean okt = true;
				for (int i = 0; i < d; i++) {
					if (a[i].getXd() == 1) {
						a[i].display();
						okt = false;
					}
				}
				if (okt) System.out.println("404 Not Found");
				sc.nextLine();
				
				break;
			}
			
			case 0: {
				ok3 = false;
				break;
			}
			
			}
			
			}// while ok3
			
			break;
		}// case 6
		
		case 7 : {
			boolean ok7 = true;
			while (ok7) {
			System.out.println("============thong tin==============");
			in();
			System.out.println("========xoa thong tin==============");
			System.out.print("nhap ID can xoa:");
			int idcx = sc.nextInt(); sc.nextLine();
			if (find(idcx) < 0) {
				ok7 = false;
				System.out.println("khong co ID:" + idcx + " trong thong tin");
			} else {
				xoa(find(idcx));
				System.out.println("da xoa ID:" + idcx );
				System.out.println("ban muon lam gi?");
				System.out.println("1/ xem thong tin va tro lai menu");
				System.out.println("2/ xoa thong tin");
				System.out.println("3/ Back to HELL!!!!!!!");
				int lj = sc.nextInt(); sc.nextLine();
				switch (lj) {
				case 1: {
					System.out.println("============thong tin==============");
					in();
					sc.nextLine();
					ok7 = false;
					
					break;
				}
				
				case 2: {
					break;
				}
				
				case 3: {
					ok7 = false;
					break;
				}
				}
				
			}
			
			
			} // while ok7
			break;
		}// case 7
		
		case 8: {
			boolean ok8 = true;
			while (ok8) {
			System.out.println("============thong tin==============");
			in();
			System.out.println("=========sua thong tin=============");
			System.out.print("nhap ID can sua:");
			int idcs = sc.nextInt(); sc.nextLine();
			if (find(idcs) < 0) {
				System.out.println("khong co ID:" + idcs);
			} else {
				boolean ok801 = true;
				while (ok801) {
				System.out.println("===================================");
				a[find(idcs)].display();
				System.out.println("thong tin ban muon sua la:");
				
				if (a[find(idcs)].getXd() == 1) {
				System.out.println("1/ ID");
				System.out.println("2/ name");
				System.out.println("3/ age");
				System.out.println("4/ address");
				System.out.println("5/ math");
				System.out.println("6/ physics" );
				System.out.println("7/ chemistry");
				System.out.println("8/ studen --> teacher: sap toi se lam");
				System.out.println("0/ Back to HELL!!!!!");
				System.out.println("==============Moi Chon==============");
				int tcf = sc.nextInt(); sc.nextLine();
				Student tg = new Student();
				tg = (Student) a[find(idcs)];
				switch (tcf) {
				
				case 1: {
						
					System.out.print("nhap ID moi:");
					int idm = sc.nextInt(); sc.nextLine();
					if (find(idm) < 0 || idm == idcs) {
						System.out.println("cap nhat thanh cong!!!!");
						a[find(idcs)].setID(idm);
					} else System.out.println("ID da ton tai!!!!");
					ok801 = false;
					sc.nextLine();
					break;
				}
				
				case 2: {
					System.out.print("nhap name moi:");
					tg.setName(sc.nextLine());
					a[find(idcs)] =  tg;
					System.out.println("cap nhat thanh cong!!!!");
					sc.nextLine();
					ok801 = false;
					break;
				}
				case 3: {
					System.out.print("nhap age moi:");
					tg.setAge(sc.nextInt());
					a[find(idcs)] =  tg;
					System.out.println("cap nhat thanh cong!!!!");
					ok801 = false;
					sc.nextLine();
					break;
				}
				
				case 4: {
					System.out.print("nhap address moi:");
					tg.setAddress(sc.nextLine());
					a[find(idcs)] =  tg;
					System.out.println("cap nhat thanh cong!!!!");
					sc.nextLine();
					ok801 = false;
					break;
				}
				
				case 5: {
					System.out.print("nhap math moi:");
					tg.setMath(sc.nextFloat());
					a[find(idcs)] =  tg;
					System.out.println("cap nhat thanh cong!!!!");
					sc.nextLine();
					ok801 = false;
					break;
					
				}
				case 6: {
					System.out.print("nhap physisc moi:");
					tg.setPhysics(sc.nextFloat());
					a[find(idcs)] =  tg;
					System.out.println("cap nhat thanh cong!!!!");
					sc.nextLine();
					ok801 = false;
					break;
				}
				case 7: {
					System.out.print("nhap chemistry moi:");
					tg.setChemistry(sc.nextFloat());
					a[find(idcs)] =  tg;
					System.out.println("cap nhat thanh cong!!!!");
					sc.nextLine();
					ok801 = false;
					break;
				}
				case 0: {
					ok801 = false;
					break;
				}
				}// switch tcf
				} else {
					System.out.println("1/ ID");
					System.out.println("2/ name");
					System.out.println("3/ age");
					System.out.println("4/ address");
					System.out.println("5/ experience");
					System.out.println("6/ teacher --> studen: sap toi se lam");
					System.out.println("0/ Back to HELL!!!!!!");
					System.out.println("==============Moi Chon==============");
					int tcf = sc.nextInt(); sc.nextLine();
					Teacher tg = new Teacher();
					tg = (Teacher) a[find(idcs)];
					switch (tcf) {
					
					case 1: {
						System.out.print("nhap ID moi:");
						int idm = sc.nextInt(); sc.nextLine();
						if (find(idm) < 0 || idm == idcs) {
			
							a[find(idcs)].setID(idm);
							System.out.println("cap nhat thanh cong!!!!");
			
						} else System.out.println("ID da ton tai!!!!");
						sc.nextLine();
						ok801 = false;
						break;
					}
					
					case 2: {
						System.out.print("nhap name moi:");
						tg.setName(sc.nextLine());
						a[find(idcs)] =  tg;
						System.out.println("cap nhat thanh cong!!!!");
						sc.nextLine();
						ok801 = false;
						break;
					}
					case 3: {
						System.out.print("nhap age moi:");
						tg.setAge(sc.nextInt());
						a[find(idcs)] =  tg;
						System.out.println("cap nhat thanh cong!!!!");
						sc.nextLine();
						ok801 = false;
						break;
					}
					
					case 4: {
						System.out.print("nhap address moi:");
						tg.setAddress(sc.nextLine());
						a[find(idcs)] =  tg;
						System.out.println("cap nhat thanh cong!!!!");
						sc.nextLine();
						ok801 = false;
						break;
					}
					
					case 5: {
						System.out.println("nhap experience moi:");
						tg.setExperience(sc.nextInt());
						a[find(idcs)] = tg;
						System.out.println("cap nhat thanh cong!!!!");
						sc.nextLine();
						ok801 = false;
						break;
					}
					case 0: {
						ok801 = false;
						break;
					}
				}
					
				}
			}// while ok801
			
			}
			System.out.println("co muon sua ID khac khong?");
			System.out.println("1/ YES");
			System.out.println("2/ NO");
			int ttc = sc.nextInt(); sc.nextLine();
			if (ttc != 1) ok8 = false;
			}// while ok8
			break;
		}// case 8
		
		case 9: {
			System.out.println("===================================");
			System.out.println("sau khi xoa se mat toan bo du lieu va khong the khoi phuc lai ban co chac van muon thuc hien chu?");
			System.out.println("1/ YES");
			System.out.println("2/ Back to HELL!!!!!!!!!!");
			int xdl = sc.nextInt(); sc.nextLine();
			if (xdl == 1) {
				kill();
				System.out.println("=======DA XOA==================");
			}
			
			break;
		}// case 9
		
		case 10: {
			ok = false;
			break;
		}
		}// switch main
		
		}// while main
		
	}

	public static void in() {
		for(int i = 0; i < d; i++) {
			a[i].display();
		}
		
	}
	public static int find(int id) {
		for (int i = 0; i < d; i++) {
			if (a[i].getID() == id) return i;
		}
		return -1;
	}
	
	public static void swap(int i, int j) {
		Person tg = new Person();
		tg = a[i];
		a[i] = a[j];
		a[j] = tg;
	}
	
	public static void xoa( int vt) {
		for (int i = vt; i < d-1; i++) {
			a[i] = a[i+1];
		}
			a[d-1] = new Person();
			d--;
		
		
	}
	
	public static void kill() {
		a[d] = new Person();
		for (int i = 0; i < d; i++) a[i] = a[d];
		d = 0;
	}
}
