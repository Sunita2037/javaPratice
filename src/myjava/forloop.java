package myjava;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(initialization;conditionCheck;increment/Decrement) {
//		//statements 
		
for(int x = 2 ; x <= 6 ; x++) {
	System.out.println(x);
	if(x == 3) {
		break;
		
	}
	for(int n = 20 ; n >= 10 ; n--) {
		System.out.println(n);
		if(n == 15) {
			break;
		}
		for(int s = 1 ; s <= 5 ; s++) {
		System.out.println(s);
		if(s == 2) {
			continue;
		}
		}
		for(int i = 5 ; i >=1 ; i--) { // 4 // 3 // 3
			System.out.println(i); // 5 // 4 // 3 // 2
			if(i == 2) {
				break;
				}
	}
		for(int i = 5 ; i >=1 ; i--) { // 4 // 3 // 3
			System.out.println(i); // 5 // 4 // 3 // 2
			if(i == 2) {
				continue;
}

			for(int a = 6 ; a>= 1 ; a--) {
				System.out.println(a);//6,5,4,3,2,1
				if (a == 7) {
					break;
				}
			}
	}
}
	}

	}
}

