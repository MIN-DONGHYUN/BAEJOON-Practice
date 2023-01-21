// 백준 1065번 한수. X가 한수인지 판별하는 함수를 정의하여 문제를 해결해 봅시다.

package beakJoonNo5;

import java.util.Scanner;				// 키보드 사용을 위해 Scanner import

public class Han1065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// 키보드 입력을 받기 위해 Scanner
		
		int X = sc.nextInt();			// 정수 값 받아온다.
		
		int cnt = 0;					// 변수 선언 
		int a100 =0;
		int b10 = 0;
		int c1 = 0;
				
		for(int i = 1; i<= X; i++)		// 1부터 X정수까지 반복
		{
			if(i < 100)			// 1~99 까지는 모두 한수이므로 cnt를 계속 더한다.
			{
				cnt++;
				continue;
			}
			
			a100 = i/100;		// 100의자리 
			b10 = (i/10)%10;	// 10의자리 
			c1 = i%10;			// 1의자리 
				
			if((a100 - b10) == (b10 - c1))	// 100의자리 - 10의자리 = 10의자리 -1의자리가 같다면 
			{								// 같은 값 차이이므로 한수이다.
				cnt+= 1;					// cnt를 1 늘린다.
			}
			
		}
		System.out.println(cnt);		//출력
		
		
		sc.close();		//메모리 누수 방지 
	}

}
