package myjava;

import java.util.Arrays;

public class stringday7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[4][6];
		int[][] b = { { 11, 12, 23, 43, 44, 45, }, { 21, 10, 55, 54, 65, 66 }, { 31, 32, 34, 53, 51, 62 },
				{ 19, 29, 30, 40, 51, 89 } };

		System.out.println(b[0][2]); // 23
		System.out.println(b[1][3]); // 54
		System.out.println(b[2][0]);// 31

		for (int i = 0; i < b.length; i++) {
			System.out.println(i);
			System.out.println(b[i].length);

			int[] r = b[i];
			for (int j = 0; j < r.length; j++) {
				System.out.println(r[j]);
			}
		}
		// Program 2
		int[][] numbers = { { -1, -2, -3 }, 
				{ -11, -12, -13 },
				{ -22, -33, -44, } 
				};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i);
			System.out.println(numbers[i]);
			System.out.println(Arrays.toString(numbers[i]));
			
			int rows [] = numbers[i];
			for(int j = 0; j < rows.length; j++) {
				System.out.println(j);
			}
		}
		//Program3
		int numbersb[] = {22,33,44};
		for(int q1:numbersb) {
			System.out.println(q1);
		}
		// multiple dimensional array
		
		int numbersc [][] = {{11,22,33},
				{12,13,14},
				{21,32,43}};
		for(int []q1:numbersc) {
			//System.out.println(q1);
			//System.out.println(Arrays.toString(q1));
			for(int a2:q1) {
				System.out.println(a2);
				
			}
				
		}
		
		// program 4
		int numbersd [][] = {
				{0,9,8,7},
				{6,5,4,3},
				{2,1,11,23}};
		for(int[]rows:numbersd) {
			//System.out.println(rows);
			//System.out.println(Arrays.toString(rows));
			for(int col:rows) {
				System.out.println(col);
				
				int numberse [][] = {
						{11,22,33,44,55},
						{66,77,88,99,00},
						{111,222,333,444}
				};
				for(int[] rows1: numberse) {
					
					System.out.println(rows1);
					System.out.println(Arrays.toString(rows1));
					for(int col1:rows1) {
           //System.out.println(col1);
						
					}
				}
				
				//program 5
				
				int[][][]t1 = {
						{
							{21,32,43},
							{65,76,87}
						},
						{
							{71,31,21},
							{65,75,85}
						}
						
				};
				
				System.out.println(t1[0][0][1]);//32
				System.out.println(t1[1][1][1]);//75
				System.out.println(t1[0][01][2]);//87
				System.out.println(t1[1][0][1]);//31
				
				
				
			}
		}
		String country = "Nepal";
		String rev = "";
		for(int j = 0; j < country.length(); j++) {
		rev = country.charAt(j)+rev;
		System.out.println(rev);
		}
		
	}
		
	}


