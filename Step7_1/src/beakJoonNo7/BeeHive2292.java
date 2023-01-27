// 백준 2292번 문제 벌집, 벌집이 형성되는 규칙에 따라 벌집의 위치를 구하는 문제 

package beakJoonNo7;

import java.util.Scanner;

public class BeeHive2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 키보드 입력받기위해 Scanner
		
		int A = sc.nextInt();			//키보드로 하나의 정수를 입력받는다.
		int cnt = 0;					//카운트 초기화 선언 
		int B = 0;						// B 값 초기화 선언
		
		//입력 값까지 1겹, 2겹, 3겹을 뚫고 얼마나 걸리는지 알기 위해 반복문 해옴 
		for(int i=0; A>i;)  //1+0*6, 1+1*6, 1+3*6, 1+6*6, 1+10*6
		{					// 0      1       3      6      10     15 ...
			
			i = 1 + (B*6);		// 1 7 19 37 ... 이렇게 1겹이 추가된다.
			++cnt;				// 카운트를 전위 연산자로 추가하고 
			B += cnt;			// B에 카운트를 계속 누적합을 시킨다.

		}
		System.out.println(cnt);	// 출력 
		
		sc.close();			// 메모리 누수 방지 
	}

}
