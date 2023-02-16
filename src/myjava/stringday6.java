package myjava;

public class stringday6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[5];
		String names2[] = new String[5];
		names[0] = "rita";
		names[1] = "sunita";
		names[2] = "mina"; // in this how can we print all the names at once?
		names[3] = "tina";
		names[4] = "ramila";

		
		
		
		System.out.println(names);
//Array stores the element by index
		System.out.println(names[0]);
		System.out.println(names[1]);
		String[] cities = { "Kathmandu", "Bhaktapur", "Lalitpur", "Chitawan", "Hetauda" };
		System.out.println(cities[2]);
		System.out.println(cities[4]);
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
			System.out.println(i);
		}

		int[] numbers = { 00, 12, 32, 42, 33, };
		int[] numbersa = new int[4];
		numbersa[0] = 82;
		numbersa[1] = 62;
		numbersa[2] = 72;
		numbersa[3] = 52;
		int sum = 0;
		for (int i = 0; i < numbersa.length; i++) {
			// System.out.println(i);
			System.out.println(numbersa[i]);
			sum = sum + numbersa[i];
		}
//System.out.println(sum);
		int sub = 0;
		for (int i = 0; i < numbersa.length; i++) {
			sub = sub - numbersa[i];
			System.out.println(sub);

		}
		String info = "I am learning javascript";
		String[] info_br = info.split(" ");
		String[] info_br2 = info.split("a");
		for (int i = 0; i < info_br.length; i++) {

		}
		for (int i = 0; i < info_br2.length; i++) {
			// System.out.println(i);
			System.out.println(info_br2[i]);

		}
		String cityname = "Lalbandi";
		char bb[] = cityname.toCharArray();
		System.out.println(bb);
		for(int i = 0; i < bb.length; i++) {
			System.out.println(bb[i]);
		}
		// for each loop
		int age [] = {12,23,34,45};
		System.out.println("for -each loop");
		for(int a:age) {
			System.out.println(a);
			
			// javascript --- for , map()
			
			String [] namesa = {"Durga", "Laxmi","Saraswoti",};
			for(String s:namesa) {
				System.out.println(s);
			}
			char[]cc = {'a','d','e','y'};
			String rev = "";
			for(char i : cc) {
				rev = rev + i;
			}
			System.out.println(rev);
			int numbersq[] = {2,12,22,32,21,44};
			int sum1 = 0;
			for(int i = 0; i < numbersq.length; i++) {
				System.out.println(numbersq[i]);
				sum1 = sum1 + numbersq[i];
			}
			System.out.println(sum1);
			 //program 5
			int numbersc [] = {2,3,5,6,11,22,23,44};
			//sum and average
			
			int suma = 0;
			float avg = 0;
			for(int a1:numbersc) {
				suma = suma + a1;
			}
			System.out.println(suma);
			avg = suma/numbersc.length;
			System.out.println(avg);
			// program 6
			
			int [][]matrix = {{12,22,32,33,},{40,50,60,66}};
			System.out.println(matrix[0][0]);//12
			System.out.println(matrix[0][3]);//33
			System.out.println(matrix[1][2]);//60
			System.out.println(matrix[1][1]);//50
		}
		
		
	}

	}

