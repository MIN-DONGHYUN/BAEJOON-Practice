//백준 2525번 오븐시계

package baeJohnNo2;

import java.util.Scanner;    //java.util패키지의 스케너를 사용

public class OvenClock2525 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// 키보드 사용을 위해 명령 
		
		int A[] = {0,0,0};		//배열 시간, 분 , 오븐시간을 뜻함 
		
		for(int i = 0; i <= 2; i++ )	//반복문 0,1,2로 시간, 분, 오븐시간을 설정
		{
			A[i] = sc.nextInt();		//키보드에서 받아오는 것을 배열에 대입
		}
		
		A[1] = A[1] + A[2];				// 분에 오븐의 작동시간을 더한다.
		
		for(int j = 0; j <=16; j++)	  	// 오븐시간이 최대 1000이니 16번까지 실행 할 수 있다.
		{
			if(A[1] >= 60)				// 분이 60분을 넘어가면
			{
				A[1] = A[1] - 60;		// 60분을 원래 분에서 빼고
				A[0] = A[0] + 1;		// 시간을 1시간 추가한다.
				if(A[0] >=24)			// 시간이 24시를 넘어간다면
				{
					A[0] = A[0] - 24;	// 시간에서 24를 빼준다.
				}
			}
		}
		
		System.out.println(A[0] + " " + A[1]); // 시간과 분을 출력한다.
		
		sc.close();			//메모리 누수 방지 

	}

}
