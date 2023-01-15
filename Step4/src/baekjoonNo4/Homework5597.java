// 백준 5597문제 과제 안내신 분...?, 과제 제출 기한이 지났습니다.

package baekjoonNo4;

import java.util.Scanner;

public class Homework5597 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		//키보드 입력을 받기 위해		
		
		int A [] = new int [31];			//배열을 31개 만든다.
		
		for(int i = 1; i <= 28; i++)		// 28명이 제출한 것이므로 1부터 28까지 반복
		{
			int search = sc.nextInt();		// 키보드 입력을 받아온다.
			A[search] = 1;					// 키보드입력을 배열의 번호에 저장하고 1을 넣는다.
		}
		for(int j = 1; j < A.length; j++)	// 1부터 배열의 길이까지 반복한다.즉 1~30까지 
		{
			if(A[j] != 1)					// j를 순서대로 반복하고 없는번호는 그 값이 0이 되어있기 때문에 1이 아닌것을 찾는다.
			{
				System.out.println(j);		// 출력 
			}
		}
		sc.close(); //메모리 누수 방지 
	}
}
