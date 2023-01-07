//백준 2753번 윤년 

package baeJohnNo2;

import java.util.Scanner;

public class LeapYear2753 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   // 키보드를 사용하기 위해 
		
		int A = sc.nextInt();    // A에 키보드에서 받아온 정수값을 받음
		
		if( A % 4 == 0 && A % 100 != 0 || A % 400 == 0)  //A가 4의배수이며 A가 100배수 아닐때 또는 A가 400배수일때 
			                                             //윤년을 프로그램한것임  
		{
			System.out.println("1");				//윤년일때 1
		}
		else {
			System.out.println("0");				//윤년이 아닐때 0
		}
		
		sc.close();				//메모리 누수 예방

	}

}
