package myjava;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Define and variable and assign a value

		int a = 11;
		System.out.println(a);

		// Arithmatic operations
		int s = 25;
		int t = 5;

		int q = s + t;
		System.out.println(q);
		System.out.println(s + t);
		System.out.println(q + q);
		System.out.println(q - q);
		System.out.println(q * q);

		System.out.println(s + t);
		System.out.println(s - t);
		System.out.println(s * t);
		System.out.println(s / t);
		System.out.println(s % t);

		int s1 = 55;
		int s2 = 11;

		System.out.println(s1 + s2);
		System.out.println(s1 - s2);
		System.out.println(s1 * s2);
		System.out.println(s1 / s2);
		System.out.println(s1 % s2);

		int x = 12;
		int y = 13;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

		// calling function

		cal(13, 11);
		cal(15, 5);

		// Calling second function
		calA();
		calA();
		calA();
		calA();

		calb(12, 2);
		calb(14, 8);
		calb(11, 10);

		int x1 = cald(12, 2);
		System.out.println(x1);
		System.out.println(x1 + 20);
		System.out.println(x1 * 0.10);
		System.out.println(x1 / 4);
		System.out.println(x1 % 4);

		int x2 = multiplication(5, 4);
		System.out.println(x2 * 11);
		
		
		
		
	}

//function with parameter
	static void cal(int a, int b) {
		System.out.println(a + b);
	}

	// function without parameter and without return
	static void calA() {
		System.out.println(4 + 5);

	}

	static void calb() {
		System.out.println(11 + 22);

		// function with parameter and without return type
	}

	static void calb(int x, int y) {

		System.out.println(x + y);

	}
	// function with parameter and with return type

	static int cald(int x, int y) {
		return (x + y);

	}

	static int multiplication(int x, int y) {
		return (x * y);
		
	}
}
