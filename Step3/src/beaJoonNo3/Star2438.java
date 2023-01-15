//백준 2438문제 별 찍기 - 1, 별을 찍는 문제 1

package beaJoonNo3;

import java.util.Scanner;		//java.util패키지 의 scanner사용위헤

public class Star2438 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //키보드 입력 받기 위해 
		
		int T = sc.nextInt();		// 테스트 몇번할지 키보드로 입력받음
		
		for (int i = 0 ; i < T; i++)	// T번 돌아가도록 반복
		{
			for(int j = 0; j < i+1; j++)	// 별을 찍는것을 반복한다.
			{								// 돌아간 만큼 별을 찍어서 문자열 복사한것처럼 나타낸다.
				System.out.print("*");		// 별을 찍는다.
			}
			System.out.print("\n");			// 줄바꿈
			
		}
		sc.close();  //메모리 누수 방지 
	}
}
