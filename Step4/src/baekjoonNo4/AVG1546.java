//백준 1546 평균, 평균을 조작하는 문제

package baekjoonNo4;

import java.util.Scanner;

public class AVG1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		//키보드 사용하기위해
		
		int T = sc.nextInt();						//테스틀 실행 회수 키보드 입력
		
		double score[] = new double [T];			// 소수가 나오게 하기 위해 
		
		double max = 0;								//합계, 평균 설정
		double avg = 0;
		
		for(int i = 0; i < T; i++ )					//T까지 반복 
		{
			score[i] = sc.nextInt();				// 배열에 입력받음
			if(score[i] > max)						//기존 max보다크면
			{
				max = score[i];						//max에 결과값 넣음
			}
		}
		
		for(int j = 0; j < T; j++)					// T번 반복
		{
			avg += (score[j]/max*100)/T;			// avg에 조작 평균값 넣기
		}
		System.out.println(avg);					//출력
		
		sc.close();									// 메모리 누수 방지
	}

}
