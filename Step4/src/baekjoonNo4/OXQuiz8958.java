//백준 8958OX퀴즈, OX 퀴즈의 결과를 일차원 배열로 입력받아 점수를 계산하는 문제

package baekjoonNo4;

import java.util.Scanner;

public class OXQuiz8958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		//키보드 사용하기 위해 scanner
		
		int T = sc.nextInt();			// 키보드로 테스트 숫자 받아옴 
		
		sc.nextLine();					// 버퍼에 있는 것을 비우기 위해 사용
		
		String OX [] = new String [T];	// 문자열 타입 배열 받아옴
		
		int cnt=0;						// 카운트 초기화
		int result = 0;					//결과값 초기화
		
		for(int i=0;i<T;i++)			// T번 반복
		{
			OX[i] = sc.nextLine();					// 배열에 키보드로 받아옴 
			for(int j=0;j<OX[i].length();j++)		// 배열길이만큼 반복
			{
				if(OX[i].charAt(j) == 'O')			// 문자열을 하나씩 반복하여 O이면 실행 
				{
					cnt++;							// 카운트 1 증가
					result += cnt;					// 결과 값에 cnt를 더함 
				}
				else								// 문자열 하나씩 반복하여 X면 실행 
				{
					cnt=0;							// cnt를 초기화
				}
			}
			System.out.println(result);				// 결과값 출력
			result = 0;								// 결과값과 카운트 초기화
			cnt=0;
		}
		sc.close();									// 메모리 누수 방지 
	}
}
