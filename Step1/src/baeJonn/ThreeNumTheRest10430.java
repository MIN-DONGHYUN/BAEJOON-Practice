//백준 10430번

package baeJonn;

import java.util.Scanner;

public class ThreeNumTheRest10430 {
	
	public static void main(String[] args) {
	
		int A[] = {0,0,0};		// 배열 설정 
		
		Scanner sc = new Scanner(System.in);		//키보드 사용하기 위해 
		
		for(int i = 0; i<=2 ; i++)			//반복문으로 a[]에 키보드 입력값 받아오기
		{
				A[i] = sc.nextInt();
		}
		
		//System.out.println(A[0]);
		System.out.println((A[0] + A[1]) % A[2]);		// 출력
		System.out.println(((A[0] % A[2]) + (A[1] % A[2])) % A[2]);
		System.out.println((A[0] * A[1]) % A[2]);
		System.out.println(((A[0] % A[2]) * (A[1] % A[2]) % A[2]));
		
		sc.close();		//메모리 누수 방지 
	}
}
