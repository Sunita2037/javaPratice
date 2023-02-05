package myjava;

public class day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is inbuilt data type
	//create object of type string	
String fullname = "sunita";
String A = fullname.toUpperCase();
System.out.println(A);

String myname = "deepak";
String d = myname.toUpperCase();
System.out.println(d);

//creating instance or object of human class
Human sunita = new Human("sunita dhungel",41);
System.out.println(sunita.age);
System.out.println(sunita.fullname);
sunita.talk();
sunita.walk();


	}

}

class Human {
	//properties or fields
	
	String fullname;
	int age;
	
	//constructor to set property values , field values
	
	
	public Human(String fullN, int age) {
		this.fullname =fullN;
		this.age = age;
	}
	//methods
	//talk() and walk()
	public void talk() {
		System.out.println("I am talking");
	}
	public void walk() {
		System.out.println("I am walking");
	}
}








