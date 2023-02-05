package myjava;

public class revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numT = 4;
		
		if(numT > 0 && numT <= 5) {
			System.out.println("5%discount");
		}	
		else if(numT > 5 && numT <= 10) {
			System.out.println("10%discount");
		}	
		else if(numT > 10) {
			System.out.println("25% discount");
		}	
		else {
			System.out.println("Please enter correct input");
		}
	}
		
	// function without parameter and without return type
	
	
		static void Addition() {
			System.out.println(8 + 7);
		
		
		
		
		
		for(int a = 1 ; a < 4 ; a++) {
		System.out.println("me");
	}
	for(int b = 5 ; b > 2 ; b--) {
		System.out.println("sunita");
	}
	for(int q = 10 ; q < 20 ; q++) {
		System.out.println(q);
	}
	for(int c = 3 ; c <= 9 ; c++) {
		System.out.println(c);
		if(c == 5) {
			break;
		}
		for(int w = 6 ; w >= 2 ; w--) {
			System.out.println(w);//6,5,4,3
		}
	}
	}

}