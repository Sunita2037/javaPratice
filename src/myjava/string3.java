package myjava;

public class string3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub

					String city = "pune";
					//String city2 = new String("nagpur");
					System.out.println(city);
					
					// 0  1   2   3
					// p  u   n   e
					// program 1
					for(int i = 0 ; i < 4; i++ ) { //1 // 2 // 3 // 4
						//System.out.println(i); // 0 , 1 // 2 // 3
						// i ----0
						// i ----1
						// i ----2
						// i ----3
						System.out.println(city.charAt(i));
		
					}
					// 0   1  2  3
					// p   u  n  e 
					// program 2
					for(int i = city.length()-1 ;  i>=0 ; i--) {
						//System.out.println(i);
						System.out.println(city.charAt(i));
					}
						//program 3
						// chinmay  ======> yamnihc
						// pune ====> enup
						
						String country = "nepal"; 
						String rev  = "";
						
						for(int i = 0 ; i < country.length() ; i++) {
							//System.out.println(i);
							//System.out.println(country.charAt(i));
							
							rev = country.charAt(i) + rev;
							System.out.println(rev);
							
							
						}
					
						System.out.println(rev);	
						String city3 = "wardha";
						String rev2 = "";
						
						// 0   1  2   3   4   5
						// w   a  r   d   h   a
						
						for(int i =  city3.length()-1 ; i >= 0 ; i--) {
							//System.out.println(i);
							//System.out.println(city3.charAt(i));
							rev2 = rev2 + city3.charAt(i);
//					      ""  +  a   ======> a
							//       a  +   h  ======> ah
							//       ah +   d  =====> ahd
							//      ahd +   r  =====> ahdr
							//     ahdr  +  a  ======> ahdra
							//     ahdra +  w =======> ahdraw
						}
						
						System.out.println(rev2);
						// program 4
						String fruits = "apple mango banana grapes papaya";
						String userInput = "banana";
						if(fruits.contains(userInput)) {
							System.out.println("Fruit is available");
						}
						else {
							System.out.println("Fruit not available");
						
						
						}
						String firstname = "sunita";
						int count = 0;
						for(int i = 0 ; i < firstname.length(); i++) {
							System.out.println(firstname.charAt(i));
							String name1 = firstname.toUpperCase();
							System.out.println(name1);
							
						}
						String lastname = "dhungel";
						String last1 = lastname.toUpperCase();
						System.out.println(last1);
	
						String Lastname1 = "Dhakal";
						
						int count1 = 0;
						for (int i = 0 ; i < Lastname1.length();i++) {
							System.out.println(Lastname1.charAt(i));
													
						String  last2 = Lastname1.toUpperCase();
						System.out.println(last2);
						
					}
					
	}
	}


