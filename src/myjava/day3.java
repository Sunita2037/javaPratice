package myjava;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
		int a = 30;
		System.out.println(a);
		
		// Arithmetic operator
				int s = 10;
				int t = 5;
						
				int q = s+t;
				System.out.println(q);  // 15
				System.out.println(s+t); // 15
				System.out.println(q+q);// 30

				// Calling the function
				
				Cal(12,13);
				Cal(120,12);
				
				Cal(20,2);
				Cal(40,10);
				
				//Calling second function - CalA()
				CalA();
				CalA();
				CalA();
				CalA();
				CalA();
				
				
				CalB(20,5);
				CalB(25,10);
				CalB(12,6);
				CalB(30,2);
				
				int x2 = CalC(12,3);
				System.out.println(x2);
				System.out.println(x2 + 15);
				System.out.println(x2 * 0.10);
				System.out.println(x2 /2);
				
				
				
				
				
				
				
				
				
				
	}
	static void Cal(int x , int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		}	
	//function without parameter and without return
	static void CalA() {
		System.out.println(5+5);
	}
		
		static void CalB(int x , int y) {
			System.out.println(x+y);
		}
		
		// function with parameter and with return type
		
		static int CalC(int x, int y) {
			return (x + y);
		}
		// multiplication 
		
		static int Mul(int x , int y) {
			return x * y;
		
		
	}
		
		// division 
		
		static int Div(int x , int y) {
			return x / y;
			}	
		
		// subtraction
		static int Sub(int x , int y) {
			return x - y;
		
		
		}		
		
		
	
	
	
	
	
	
	}
