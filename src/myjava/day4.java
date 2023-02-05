package myjava;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		addition();
		addition();
		addition();
		System.out.println("bye");

		sub(100, 50);
		sub(900, 450);

		int q1 = multilplication(12, 12);
		System.out.println(q1);
		System.out.println(q1 * 0.10);
		System.out.println(q1 + 10);

		multilplication2(q1, 10);

		int a2 = division(20, 4);
		System.out.println(a2);
		System.out.println(a2 * 0.2);
		System.out.println(a2 - 6);
		
		int b2 = minus(14, 9);
		System.out.println(b2);
		System.out.println(b2 + 4);
		System.out.println(b2 - 4);
		System.out.println(b2 * 4);
		System.out.println(b2 / 4);
		
		
		cal(30 , 10);
		cal(10 ,2);
		

	}
	// function without parameter and without return

	static void addition() {
		System.out.println(9 + 9);
	}
	// function with parameter and without return type

	static void cal(int a3 ,int b3) {
		System.out.println(a3 + b3);


	}
	
	
	
	
	static void sub(int x, int y) {
		System.out.println(x - y);
	}

	// function with parameter and with return type

	static int multilplication(int x, int y) {
		System.out.println(x * y); // 144
		return x * y;
	}

	static void multilplication2(int x, int y) {
		System.out.println(x * y); // 1440
	}// function with parameter and with return type

	static int division(int x, int y) {
		System.out.println(x / y);
		return x / y;
		}
		
		static int minus(int s1 , int d1) {
			
			System.out.println(s1 - d1);
			return s1 - d1;
			
		}

	
}
