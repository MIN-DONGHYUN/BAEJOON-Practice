// 백준 10818번 문제 최소, 최대, 최소값과 최댓값을 찾는 문제 

package baekjoonNo4;

import java.util.Scanner;		//Scanner import하기위해

public class MinMax10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  // 키보드 사용위해 Scanner
		
		int T = sc.nextInt();			//테스트 횟수
		
		int A[] = new int [T];			// 배열 설정 
		
		int max=0, min=0;				// 최소, 최대값 초기화
		
		for(int i = 0; i < T; i++)		// T번까지 반복
		{
			A[i] = sc.nextInt();		// 배열에 키보드 입력 
			
			if(i == 0)					//i가 0일때 
			{
				min = A[i];				// min에 처음 입력한 값 대입
				max = A[i];				// max에 처음 입력한 값 대입
				continue;				// 밑을 실행하지 않고 증감식으로 돌아가기 
			}
			if(min > A[i])				// 입력값이 min보다 작을때 
			{
				min = A[i];				// min에 대입
			}
			else						// 입력값이 min보다 클때 
			{
				if(max < A[i])		// max보다 입력값이 클때 
				{
					max = A[i];		// max에 대입
				}

			}
		}
		
		System.out.println(min + " " + max);  // 출력 
		
		
		sc.close();		//메모리 누수 방지 
	}

}
