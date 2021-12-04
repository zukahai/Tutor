import java.util.Scanner;
class PINException extends Exception{
	public PINException(String s) {
		super(s);
	}
}
public class trycatch {
	public static void checkMa(int suong) throws PINException{
		int mapin = 0;
		while(suong != 0) {
			suong = suong/10; 
			mapin++;
		}
		if (mapin!=6) 
			throw new PINException("Ma pin sai");
	}


	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		System.out.println("Nhap ma pin: ");
		int i = hi.nextInt();
		
		try {
			checkMa(i);
			checkMa(123);
			System.out.println("ma pin dung");
		} catch(PINException e) {
			System.out.println(e.getMessage());
		}
	}
}