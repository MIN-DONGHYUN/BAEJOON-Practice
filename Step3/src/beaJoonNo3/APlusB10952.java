// 백준 10952번 문제 A + B  0 0이 들어올 때까지 A+B를 출력하는 문제

package beaJoonNo3;

import java.util.Scanner;

public class APlusB10952 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Test = 100;				// 대충 테스트 100번 한다고 치자 
		int cnt = 0;				// 몇번 돌아갔는지 카운트 하기 위해 설정함 
		int A[] = new int [Test];	// 배열로 테스트 100번까지 넣을수 있게 한다.
		int B[] = new int [Test];	// 배열로 테스트 100번까지 넣을수 있게 한다.
		
		for(int i=0;;i++)			// 무한 반복 
		{
			A[i] = sc.nextInt();	// 배열에 키보드로 입력받는다
			B[i] = sc.nextInt();	// 배열에 키보드로 입력받는다
			
			if(A[i] == 0 && B[i] == 0)	// A,B배열에 0이 들어간다면
			{
				break;		// 무한반복을 빠져나가자 
			}
			cnt++;			// 카운트를 하나씩 올린다.
		}
		for(int j = 0; j < cnt; j++)		// j가 0부터 cnt까지 반복한다.(즉 전for문이 돌아간 회수만큼 돌아간다.
		{
			System.out.println(A[j]+B[j]);	// 두 배열의 값을 더한다.
		}
		
		sc.close();		// 메모리 누수 방지 
	}
}
