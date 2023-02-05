package myjava;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator(30, 13);
		Calculator(50, 5);
		Calculator(22, 12);

		Addition();
		Addition();
		Addition();
		Addition();
		Addition();

		AdditionA(4, 6);
		AdditionA(15, 5);
		AdditionA(40, 2);

		
		
		
		int a1 = AdditionC(3,3);
		System.out.println(a1);
		System.out.println(a1+a1);
		System.out.println(a1*0.10);
		System.out.println(a1);
		
		// relational operator 
				// < , > , <= ,>= ,!= , ==
				// boolean value 
				
		System.out.println(33 > 5); // true
		System.out.println(3 <= 5); // true
		System.out.println(330 != 5); // true
		System.out.println(3 < 5); // true
		System.out.println(33 >= 5);  // true
		System.out.println(33 == 33); //
				
		// Logical operators 
		
				// AND  &&
				
				// true   &&  true  =========>  true
				// true   &&  false =========>  false
				// false  &&  true   =========> false
				// false  &&  false  =========> false
		System.out.println(2 == 2 && 6 != 7); 
		System.out.println(2 != 2 && 6 != 7);
		System.out.println(2 == 2 && 6 == 7);
		System.out.println(2 != 2 && 6 == 7);
		
		
		// OR ||
		
				// true   ||  true  =========>  true
				// true   ||  false =========>  true
				// false  ||  true   =========> true
				// false  ||  false  =========> false
		System.out.println(2 == 2 || 6 != 7); 
		System.out.println(2 != 2 || 6 != 7);
		System.out.println(2 == 2 || 6 == 7);
		System.out.println(2 != 2 || 6 == 7);
		
		
		// NOT !
		
				System.out.println(!(2==2));
				System.out.println(!(2!=2));
				
		System.out.println(!(4==4));
		System.out.println(!(7!=7));
		
		System.out.println(4 > 6);
		System.out.println(9< 11);
		
		
		System.out.println(2 <= 4);
		System.out.println(20 >= 10);
		System.out.println(! (3 >= 2));
		
		int numS = 100;
		if(numS> 0 && numS <= 20) {
			System.out.println("5% discount");
		}
			else if(numS > 21 && numS <= 100) {
				System.out.println("10% discount");
				
				
			}
			
			int nump = 70;
			if(nump >= 40 && nump <= 80) {
				System.out.println("2%");
			}
			else if(nump <=60 && nump >=20) {
				System.out.println("4%");
			}
			else if(nump >= 30 && nump <= 90) {
				System.out.println("8");
			}
			
			
			
			
		
		
		int numT = 50;
		
		if(numT > 0 && numT <= 5) {
			System.out.println("10%discount");
		}
		
		else if(numT > 10 && numT <= 50) {
			System.out.println("20% discount");
		}
		

	
		int numw = 70;
		if(numw >= 40 && numw <= 80) {
			System.out.println("2%");
		}
		else if(numw <=60 && numw >=20) {
			System.out.println("4%");
		}
		else if(numw >= 30 && numw <= 90) {
			System.out.println("8");
		}
		}
		
		
		
		
		
		
	

	static void Calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

	}

	static void Addition() {
		System.out.println(1 + 1);
	}

	static void AdditionA(int x , int y) {
		System.out.println(x+y);
		System.out.println(x-y);
	    System.out.println(x*y);
	    System.out.println(x/y);
	    System.out.println(x%y);
	}
	
	 // function with parameter and with return type
		// return is last statement for function
		
		static int AdditionC(int x , int y) {
				System.out.println(x+y);
				return x + y;
	    
	    
	    
		
		

}
}
			// TODO Auto-generated method stub

		

