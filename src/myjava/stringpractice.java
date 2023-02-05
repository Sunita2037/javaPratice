package myjava;

public class stringpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String city1 = "Kathmandu";
String city2 = "bhaktapur";
String city3 = "Kathmandu";

boolean result = city1.equals(city2);
System.out.println(result);
boolean result1 = city1.equals(city3);
System.out.println(result1);

String livingthings1 = "humenbeing";
String livingthings2 = "animals";
String livingthings3 = "plants";
boolean value1 = livingthings1.equals(livingthings2);
System.out.println(result);

boolean value2 = livingthings2.equals(livingthings3);
System.out.println(result);
boolean value3 = livingthings1.equals(livingthings3);
System.out.println(result);
boolean value4 = livingthings3.equals(livingthings1);
System.out.println(result);
if(result) {
	
	System.out.println("city1 and city2  equal");
	
}
else {
	System.out.println("city1 and city2 are not equal");
	
}


	}
	
}
