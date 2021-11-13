package AnimalManager;

import java.util.Scanner;


public class Test {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		return sum;
	}

	public static void sayHi() {
		System.out.println("Hi");
	}

	public static void sayHi(String s) {
		System.out.println("Hi " + s);
	}

	public static void sayHi(String s, String p) {
		System.out.println("Hi " + s + " and " + p);
	}
	public static void main(String[] args) {
		sayHi();
		// sayHi("Hai");
		sayHi("Suong", "Phu");
	}
}
