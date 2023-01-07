//백준 9498번

package baeJohnNo2;

import java.util.Scanner;

public class ExaminationResults9498 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		//키보드 사용 위해
		
		int A = sc.nextInt();						//A에 키보드 입력값을 정수로 받는다
		
		if(A >= 90)									// A가 90점이상일때 
		{
			System.out.println("A");
		}
		else if(A >= 80)							// A가 80점이상일때
		{
			System.out.println("B");
		}
		else if(A >= 70)							// A가 70점이상일때
		{
			System.out.println("C");
		}
		else if(A >= 60)							// A가 60점이상일때
		{
			System.out.println("D");
		}
		else    									// A가 60점미만일때
		{
			System.out.println("F");
		}

		sc.close();			//메모리 누수 방지 
	}
}
