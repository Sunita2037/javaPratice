package myjava;

public class stringpr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Define string and print it in reverse:	
		
		String city = "kathmandu";
		// String city2 = city;
		// for(int i = 0; i < city.length();i++);
		// System.out.println(city);
		// for(int i = city.length()-1;i >=0;i--) {

		// System.out.println(city.charAt(i));

		// To print vowel letters

		String name = "Sunita";
		int count = 0;
		for (int j = 0; j < name.length(); j++) {
			// System.out.println(j);
			if (name.charAt(j) == 'a' || name.charAt(j) == 'e' || name.charAt(j) == 'i' || name.charAt(j) == 'o'
					|| name.charAt(j) == 'u') {
				count = count + 1;

				// System.out.println(count);
				// System.out.println(name.charAt(j));
			}
			String lastname = "dhungel";
			int count1 = 0;
			for (int i = 0; i < lastname.length(); i++) {
				System.out.println(i);
				if (lastname.charAt(i) == 'a' || lastname.charAt(i) == 'e' || lastname.charAt(i) == 'i'
						|| lastname.charAt(i) == 'o' || lastname.charAt(i) == 'u') {
					count1 = count1 + 1;
					System.out.println(lastname.charAt(i));
				}

			}
			// conditional statement
			// one input multiple outcome
			// check whether given number is negative or positive
			int number = 20;
			if (number > 0) {
				System.out.println("positive");

			} else {
				System.out.println("negative");

			}
			// greatest of two given numbers
			int a = 10;
			int b = 12;
			if (a > b) {
				System.out.println("a isgreater");
			} else {
				System.out.println("b is greater");
			}
		}
			
					}
				}
			
					
				
