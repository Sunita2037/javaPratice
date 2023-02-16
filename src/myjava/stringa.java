package myjava;

public class stringa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Define string and reverse it
		
		String city = "kathmandu";
		
		//for(int i =  city.length()-1;i>=0;i--) {
		//System.out.println(i);
		//System.out.println(city.charAt(i));
		
		//String country = "Nepal";
		
		//String rev = "";
		//for(int i = 0; i < country.length();i++) {
			//rev = country.charAt(i) + rev;
			//System.out.println(rev);
		//}
		String name = "sunita";
		String rev1 = "";
		for(int i = 0; i < name.length();i++) {
			rev1 = name.charAt(i)+ rev1;
			System.out.println(rev1);
		}
		String Fruit = "Banana";
		for(int i = Fruit.length()-1;i>=0;i--) {
			System.out.println(i);
			System.out.println(Fruit.charAt(i));
		}
		String animal = "tiger";
		for(int i = animal.length()-1;i>=0;i--) {
		System.out.println(animal.charAt(i));
		}
		}
	
	
	
	
	
	
	
	
	
}
