package myjava;

public class functioncalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator(10, 22);
		Calculator(11, 5);
		
		
		Addition(2 , 3);
		Addition(1, 7);
		Addition(5 , 9);
		Addition(12 , 8);
		
	}

static void Calculator(int x, int y) {
	System.out.println(x + y);
	System.out.println(x - y);
	System.out.println(x * y);
	System.out.println(x / y);
	System.out.println(x % y);

}

     static void Addition(int a , int b) {

     System.out.println(a + b);
 	System.out.println(a - b);
 	System.out.println(a * b);
 	System.out.println(a / b);
 	System.out.println(a % b);


}
}









