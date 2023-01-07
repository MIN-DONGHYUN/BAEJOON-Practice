//백준 3003번 

package baeJonn;

import java.util.Scanner;

public class Chess3003 {

	public static void main(String[] args) {
		
		int A = 0,B = 0,C = 0 ,D = 0,E = 0,F = 0;   // 변수설정
		
		Scanner sc = new Scanner(System.in);  // 키보드사용위해 
		
		for(int i = 0; i <=5; i++)   // for문으로 반복
		{

			int num = sc.nextInt();   //int로 키보드에서 받아옴
			
			
			if(i == 0) {			//i가 0일때 A변수에 대입 
			   A = num;
			}
			else if(i == 1) {		//i가 1일때 B변수에 대입 
			   B = num;	
			}
			else if(i == 2) {		//i가 2일때 C변수에 대입 
			   C = num;	
			}
			else if(i == 3) {		//i가 3일때 D변수에 대입 
			   D = num;
			}
			else if(i == 4) {		//i가 4일때 E변수에 대입 
			   E = num;	
			}
			else {					//i가 5일때 F변수에 대입 
			   F = num;
			}
		}
		
		System.out.println((1 - A) +" "+(1 - B)+" "+(2 - C)+" "+(2 - D)+" "+(2 - E) +" "+(8 - F));   //킹,퀸,룩, 비숍, 나이트, 폰 갯수 나타내기
		
		sc.close();			//메모리 누수 방지 
	}
}

/* 배열 사용시 
	import java.util.Scanner;
	public class Main {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			int[] piece = new int[6];
			int[] piece2 = {1, 1, 2, 2, 2, 8};

			for(int i = 0; i < piece.length; i++) {
				piece[i] = input.nextInt();
			}
			input.close();
			for (int i = 0; i < piece.length; i++) {
				System.out.print(piece2[i] - piece[i] + " ");
			}
		}
}
*/
