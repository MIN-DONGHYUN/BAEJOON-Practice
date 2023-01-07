//백준 2884번 알람시계 -45분 

package baeJohnNo2;

import java.util.Scanner;  //java.util패키지의 scanner사용

public class AlarmClock2884 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);  //키보드 출력을 위해 사용
		
		int A[] = {0,0};				// 배열설정 
		
		for(int i = 0; i <= 1; i++)		// 키보드 입력값을 A배열에 넣기 
		{
			A[i] = sc.nextInt();	    //배열에 키보드 입력값 받기
		}
		
		A[1] = A[1] - 45;				// 분에서 45분 일찍일어나기 위헤 뺀다.
		
		if(A[1] < 0)				   //분이 0보다 작으면 
		{
			A[1] = A[1] + 60;			// 분은 60분을 추가하고
			A[0] = A[0] - 1;		   // 시간은 1시간 빼준다,
			
		}
		if(A[0] < 0)					//시간이 0시보다 작으면
		{
			A[0] = A[0] + 24;			//시간을 24시간 더해준다
		}
		
		System.out.println(A[0] +" " + A[1]);	// 45분뺀 시간 출력 
		
		sc.close();		//메모리 누수 방지
	}
}
