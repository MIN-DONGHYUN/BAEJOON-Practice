//백준 14681번 사분면 고르기

package baeJohnNo2;

import java.util.Scanner;

public class Quadrant14681 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   // 키보드 입력을 위해 사용
		
		int A[] = {0,0};				// 배열 사용
		
		for(int i = 0 ; i<=1; i++) {	// 반복문으로 키보드 입력받기 
			A[i] = sc.nextInt();		//A[0],A[1}를 키보드로부터 받는다.
		}
		
		if(A[0] >= 0)					//A[0]이 양수라면
		{
			if(A[1] >= 0)				//A[1]이 양수라면 1사분면
			{
				System.out.println("1");
			}
			else						//A[1]이 음수라면 4사분면 
			{
				System.out.println("4");
			}
		}
		else							//A[0]이 음수라면
		{
			if(A[1] >= 0)				//A[1]이 양수라면 2사분면
			{
				System.out.println("2");
			}
			else						//A[1]이 음수라면 3사분면 
			{
				System.out.println("3");
			}
		}
		sc.close();			//메모리 누수 방지 
	}
}
