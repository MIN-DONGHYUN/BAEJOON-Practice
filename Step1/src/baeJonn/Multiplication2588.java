//백준 2588번

package baeJonn;

import java.util.Scanner;

public class Multiplication2588 {
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);  //키보드값 받기
		
		int num[] = {0,0};  // 배열
		
		
		for (int i = 0; i<=1; i++) {
			num[i] = sc.nextInt();   // 정수를  받아온다
		}
		
		System.out.println(num[0] * (num[1] - (((num[1]/100)*100)) - (((num[1]/10) - ((num[1]/100) * 10)) * 10) ));  //1의자리  
		// System.out.println(num[0]*(num[1]%10)); 앞으론 이렇게 사용하자
		System.out.println(num[0] * ((num[1]/10) - ((num[1]/100) * 10)));   // 10의자리
		// System.out.println(num[0]*((num[1]%100)/10));  앞으론 이렇게 사용하자
	    System.out.println(num[0] * (num[1]/100));   // 1의자리      
	    System.out.println(num[0]*num[1]);    //전체값 
		
		sc.close();
		
	}

}
/*
 	import java.util.Scanner;
	public class Main {

    	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	int A=scanner.nextInt();
        	scanner.nextLine();
        	String B=scanner.nextLine();
        	System.out.println(A*(Integer.parseInt(B.substring(2))));
        	System.out.println((A*(Integer.parseInt(B.substring(1,2)))));
        	System.out.println(A*(Integer.parseInt(B.substring(0,1))));
        	System.out.println(A*(Integer.parseInt(B)));
    }
}*/

//////////////////////////////이게 정답에 가까운듯 % 사용//////////////////////

/*
 	import java.util.*;
	public class Main {
		public static void main(String[] args) {
			int a,b;
			
			Scanner sc = new Scanner(System.in);
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println(a*(b%10));
			System.out.println(a*((b%100)/10));
			System.out.println(a*(b/100));
			System.out.println(a*b);
	}
}
 */

