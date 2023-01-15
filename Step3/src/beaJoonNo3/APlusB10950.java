//백준 10950 A+B 반복문

package beaJoonNo3;

import java.util.Scanner;			//jave.util패키지 사용

public class APlusB10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		//키보드 입력하기위해 
				
		int Test = sc.nextInt();					//int형으로 키보드에 받는다
		
		int[] num = new int[Test*2];				// 배열 num 설정, Test의 2배를 배열사용하겠다.
		
		for(int i = 0; i <= Test * 2 - 1 ; i++)		//i가 0부터 Test 2배 -1까지 반복
		{		
			num[i] = sc.nextInt();					//각 배열에 키보드 입력
		}
		for(int j = 0; j <= Test * 2 - 1; j++)		// 다시한번 합을 나타내기위해 반복문
		{
			System.out.println(num[j] + num[j+1]);	//A+B처럼 나오게 설정
			j++;									// 이거 안쓰면 num[0] + num[1] , num[1] + num[2]가 됨 
		}
		
		sc.close();			//메모리 누수 방지 
	}

}
