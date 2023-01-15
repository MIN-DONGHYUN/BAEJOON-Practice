//백준 10871번 X보다 작은 수,배열을 입력받고 X보다 작은 수를 찾는 문제

package baekjoonNo4;

import java.util.Scanner;		// util패키지 scanner 사용을 위해

public class LessThanX10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		// 키보드입력을 받기 위해
		
		int T = sc.nextInt();		//테스트횟수 키보드 입력 
		
		int Go = sc.nextInt();		// 비교할 정수 키보드 입력 
		
		int A [] = new int [T];			// 배열 설정 
		
		for(int i = 0; i < T; i++)		//T번까지 반복 
		{
			A[i] = sc.nextInt();		//배열에 저장할 값 키보드에서 받음 
			if(Go > A[i])				// 만약 Go가 A의 배열보다 크다면 
			{
				System.out.print(A[i] +" ");	// A의 배열을 출력해라 
			}
		}
		
		sc.close();			//메모리 누수 방지 
	}

}
