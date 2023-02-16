package myjava;

public class stringday4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0123456789101112131415
		// java is fun for me
	String str1 = "java is fun for me";
	String q = str1.substring(0,5);
	System.out.println(q);
	
	String q1= str1.substring(0,10);
	System.out.println(q1);
	
	String str2 = "Nepal is my country";
	String q2 = str2.substring(0,19);
	System.out.println(q2);
	String str3 = "My name is sunita";
	String q3 = str3.substring(0, 17);
	System.out.println(q3);
	
	// Join

			String str = "Hi";
			String str5 = "I am learning";
			String str6 = "java";

			String h = String.join(" ", str, str5, str6);
			System.out.println(h);
			
			// Join 
			String str7 = "Hello";
			String str8 = "tomorrow is";
			String str9 = "my work";
			String s =String.join(" ",str7,str8,str9);
			System.out.println(s);
			
			String str0 = "chinmaydeshpande";
			String stra = "gmail.com";
			String strb = String.join("@", str0, stra);
			System.out.println(strb);
			
			String straa = "I am";
			String strbb = "Nepali";
			String strq = String.join(" ",straa,strbb);
			System.out.println(strq);
			
			String str11 = "hello";
			String str12 = "every one";
			String str13 = "are you";
			String str14 = "getting";
			String str15 = "the";
			String str16 = "string";
			String str00 = String.join("!" , str11, str12, str13, str14, str15, str16);
			System.out.println(str00);
			
			// program 3
			
			String city6 = "Nagpur"; //
			// 012345
			// Nagpur

			int q5 = city6.indexOf('a');
			System.out.println(q5);
			
			String city7 = "samay";
			// 0 1 2 3 4 5
			// s a m a y a
			int q6 = city7.indexOf("a", 5);
			System.out.println(q6);
	
			String country = "america";
			int a1 = country.indexOf("a", 6);
			System.out.println(a1);
			
			String city8 = "samaya dani";

			for (int i = 1; i < city8.length(); i++) {
				if (city8.charAt(i) == 'a') {
					System.out.println(i);
				}
			}
					String city = "kathmandu";
					for (int i = 0; i < city.length(); i++ ) {
						if (city.charAt(i) =='a') {
							System.out.println(i);
							
						}
					}
					String city9 = " Learning java is fun ";
					String city10 = city9.trim();
					System.out.println(city10.length());
					System.out.println(city9.length());
					
					String country1 = " America ";
					String country2 = country1.trim();
					System.out.println(country1.length());
					System.out.println(country2.length());
					
					// If want to remove spaces in between
					String q11 = city10.replace(" ", "");
					System.out.println(q11);
					
					// Program4

					String q12 = "I am learning css";
					// ["I","am","learning","css"];
					String[] q13 = q12.split(" ");
					System.out.println(q13);
//					String result = "";

					for(String strs : q13) {
						System.out.println(strs);
						
						//program5 
						
						String firstName1 = "I am learning java";
						String firstName2 = "";
						boolean q111 = firstName1.isEmpty();
						System.out.println(q111);
						boolean q112 = firstName2.isEmpty();
						System.out.println(q112);
						
						
					}
					
	}
				
			}
			

