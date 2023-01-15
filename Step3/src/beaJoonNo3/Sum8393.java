//백준 8393번 합

package beaJoonNo3;

import java.util.Scanner;		//jave.util패키지에scanner사용

public class Sum8393 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //키보드 입력 위해 사용
		
		int result = 0;				// result 결과 변수 만듬
		
		int sum = sc.nextInt();		//sum애 키보드 값을 받아온다
		
		int num[] = new int[sum];	// sum값을 num 배열의 수로 지정한다.
		
		for(int i = 0; i <= sum - 1 ; i++)	// i가 0부터 sum-1까지 반복한다.
		{
			if(i == 0)					//i가 0일때 실행 
			{
				num[i] = num[i] + 1;	//num[0] = num[0] + 1;
			}
			else						// i가 1이상부터 실행 
			{
				num[i] = num[i-1] + 1;  //num[1] = num[0] + 1;
			}
		}

		for(int j = 0; j <= sum - 1; j++)  // 결과를 나타내기 위해 전체 결과 를 num[0]부터 더한다.
		{			
			result = result + num[j];	//결과에 num[0]부터 순서대로 저장
		}
		
		System.out.println(result);		//결과 표시 
		
		sc.close();		// 메모리 누수 방지 
	}
}
