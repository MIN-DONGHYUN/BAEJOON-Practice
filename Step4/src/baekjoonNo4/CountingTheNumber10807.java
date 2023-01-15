// 백준 10807번 문제 개수 세기, 배열을 입력받고 v를 찾는 문제

package baekjoonNo4;

import java.util.Scanner;				//scanner 사용위해 import

public class CountingTheNumber10807 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//scanner사용하겠다
		
		int T = sc.nextInt();		// T에 테스트할 횟수를 ㅣ보드로 입력받음
		
		int A[] = new int[T];		// 배열 A에 T개를 설정 
		
		int cnt = 0;				// 카운트 세기 위해 설정 
		
		for(int i = 0; i < T; i++)	// T번 반복
		{
			A[i] = sc.nextInt();	// 배열에 키보드 입력값 대입
		}
		int result = sc.nextInt();	// 보고싶은 결과를 키보드 입력
		for(int j = 0; j < T; j++)	// T번 반복
		{
			if(result == A[j])		// 배열과 보고싶은 결과가 같다면 
			{
				cnt++;				// 카운트 1증가
			}
		}
		System.out.println(cnt);	// 카운트 출력
		
		
		sc.close();					//메모리 누수 방지 
	}

}
