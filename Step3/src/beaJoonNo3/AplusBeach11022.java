// 백준 11022문제 A + B - 8, A+B를 11021문제보다 아름답게 출력하는 문제

package beaJoonNo3;

import java.util.Scanner;		//java.util 패키지의 scanner사용

public class AplusBeach11022 {			

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		//키보드 사용하기 위해 scanner
		
		int T = sc.nextInt();			// 테스트를 몇번 할 것인지 
		
		int Asave [] = new int[T];		// T번째 돌아가는 A의 값을 배열로 저장하기위해 
		int Bsave [] = new int[T];		// T번째 돌아가는 B의 값을 배열로 저장하기위해
		
		int result []= new int[T];		// T번째 돌아가는 A+B의 결과값을 배열로 저장하기위해 
		
		for(int i = 0; i <T; i++)		// T번 까지 반복
		{
			int A = sc.nextInt();		// A의 값을 키보드로 받아옴
			int B = sc.nextInt();		// B의 값을 키보드로 받아옴 
			result[i] = result[i] + (A + B);	// 결과값을 배열에 저장 
			Asave[i] = Asave[i] + A;			// A의 값을 저장
			Bsave[i] = Bsave[i] + B;			// B의 값을 저장 
		}
		for(int j = 0; j <T; j++)			// 출력하기 위해 다시 for문 반복
		{
			System.out.println("Case #" + (j+1) + ": " + Asave[j] + " + " + Bsave[j] + " = " + result[j] );	//A+B처럼 나오게 설정
			
		}
		sc.close();		//메모리 누수 방지 
	}

}
