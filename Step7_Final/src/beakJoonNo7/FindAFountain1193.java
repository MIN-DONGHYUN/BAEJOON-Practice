// 백준 1193번 문제, 분수찾기, 분수의 순서에서 규칙을 찾는 문제

package beakJoonNo7;

import java.util.Scanner;

public class FindAFountain1193 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// 키보드 입력 받기위해 설정 
		
		int T = sc.nextInt();		// 몇번 받을건지 설정 
		
		int cnt=0, cnt2 = 0;		// 초기값으로 통일
		int A = 0;
		int B = 0;
		
		for(int i=0;i<=A;i++)		// A번까지 반복 
		{							// A는 1 3 6 10 15 순으로 점차 늘어남 
			
			if(A>= T)				// A가 결국 입력한 T보다 높으면 for문을 탈출 
			{
				break;
			}
			B++;    // B번 돌아갔다는것을 표시하기 위해 1씩 증가 
			A+=B;   // A에 1 3 6 10 15 로 1개 3개 등등이 각 B번째의 최대값이라고 설정 
			
		}
		if(B%2 == 0)				// B번째가 %2 ==0 이면 
		{
			cnt = B;				// 첫번째 자리 수에 B를 대입
			cnt2 = 1;				// 두번째 자리 수에 1을 대입 
			for(int i=0;i<(A-T); i++)	// 반복한다 A-T번까지 즉-- A가 3이고 T가 2면 1번 반복
			{
				cnt--;				// 반복할때마다 -1
				cnt2++;				// 반복할때마다 +1
			}
		}
		else
		{
			cnt = 1;				// 첫번째 자리 수에 1를 대입
			cnt2 = B;				// 두번째 자리 수에 B을 대입 
			for(int i=0;i<(A-T); i++)	// 반복한다 A-T번까지 즉-- A가 3이고 T가 2면 1번 반복
			{
				cnt++;				// 반복할때마다 +1
				cnt2--;				// 반복할때마다 -1
			}
		}

		System.out.println(cnt +"/" + cnt2);		//출력
		
		sc.close();		//메모리 누수 방지 
	}

}