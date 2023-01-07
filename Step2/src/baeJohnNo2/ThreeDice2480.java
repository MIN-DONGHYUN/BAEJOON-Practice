//백준 2480번 주사위 세개

package baeJohnNo2;

import java.util.Scanner;		//java.util 패키지의 스케너 사용

public class ThreeDice2480 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// 키보드 사용하기 위해 사용
		
		int A[] = {0,0,0};		// 배열, 주사위 숫자 
		
		for (int i = 0 ; i <= 2 ; i++)	// 주사위 3개를 쓰기위해
		{
			A[i] = sc.nextInt();		// 배열에 키보드입력값 저장 
		}
		if(A[0] == A[1] && A[1] == A[2] && A[0]==A[2])	// 주사위가 모두 같다면 
		{
			System.out.println(10000 + A[0]*1000);		//10000 + 주사위값*1000 
		}
		else if(A[0] == A[1] || A[0] == A[2] || A[1] == A[2])	// 주사위가 두개만 같다면 
		{
			if(A[0]==A[1])				// 1,2번 주사위가 같다면 
			{
				System.out.println(1000 + A[0]*100);	// 1000 + 1번주사위*100 
			}
			else if(A[0]==A[2])			// 1,3번 주사위가 같다면
			{
				System.out.println(1000 + A[0]*100);	// 1000 + 1번주사위*100 
			}
			else						// 2,3번 주사위가 같다면
			{
				System.out.println(1000 + A[1]*100);	// 1000 + 2번주사위*100 
			}	
		}
		else					//모두 다른 값이라면 
		{
			if(A[0] > A[1] && A[0] > A[2] )		//1번 주사위가 가장 높을시 
			{
				System.out.println(A[0]*100);   //1번 주사위*100
			}
			else if(A[1] > A[0] && A[1]>A[2])	//2번 주사위가 가장 높을시
			{
				System.out.println(A[1]*100);   //2번 주사위*100
			}
			else								//3번 주사위가 가장 높을시
			{
				System.out.println(A[2]*100);   //3번 주사위*100
			}
			
		}

		sc.close(); // 메모리 누수 방지 
	}

}
