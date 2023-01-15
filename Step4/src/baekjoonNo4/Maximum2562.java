// 백준 2562번 문제 최댓값, 최댓값이 어디에 있는지 찾는 문제

package baekjoonNo4;

import java.util.Scanner;		//util 패키지의 scanner 사용

public class Maximum2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// 키보드 사용을 위해
		
		int A [] = new int [9];		// 배열 설정 
		
		int max = 0;				// 변수설정 
		
		int cnt = 1, cnt1 = 0;		// 카운트하기 위해 
		
		for(int i = 0; i < 9; i++)	//10번 반복 
		{
			A[i] = sc.nextInt();	// 배열에 키보드 입력값 저장 
			if(i == 0)				// i가 처음이라면 
			{
				max = A[i];			//최대값에 저장 
				cnt1 = cnt;			// cnt에 반복회수를 저장
			}
			if(max<A[i])			// max보다 키보드 입력값이 같으면 
			{
				max = A[i]; 		//max에 저장 
				cnt1 = cnt;			// cnt에 반복회수를 저장 
			}
			cnt++;					//반복 돌아갈때마다 cnt+1
		}
		System.out.println(max);	// 출력
		System.out.println(cnt1);
		sc.close();					//메모리 누수 방지 
	}

}
