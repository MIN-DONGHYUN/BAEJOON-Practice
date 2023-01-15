//백준 3052문제 나머지, 배열을 활용하여 서로 다른 값의 개수를 찾는 문제 

package baekjoonNo4;

import java.util.Scanner;		//util 패키지의 Scanner사용을 위해 import

public class TheRest3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		// 키보드 입력을 하기 위해 scanner
		
		int A = 0;						// 변수 선언 
		int B[] = new int [10];			// 배열 선언 	
			
		int cnt = 0;					// 카운트 선언 
		
		for(int i = 0; i < 10; i++)		// 10번 반복 
		{
			A = sc.nextInt();			// A는 키보드로부터 입력받는다
			B[i] += A%42;				// B에 A%42를 입력받는다,
			
			for(int j = 0; j < i+1; j++)	// j를 i+1번까지 반복한다.  이유는 10까지 반복하면 안에 검사를 중복할 수 있기 때문에 
			{
				if(i != j)		// i가 j와 같지않을때 실행한다 이유는 같을때는 당연히 값이 같아 cnt가 올라갈수 있음
				{
					if(B[i]==B[j])	// 배열에 있는 값을 비교해서 같다면 cnt를 올리지 않고 탈출 
					{
						break;		// 같으면 탈출 
					}
				}	
				else			// 그니까 이건 i가 0일때 j는 똑같이 0일때만 돌아가고 나머지는 안돌아간다.
				{
					cnt++;		//증가 
				}
			}
		}
		System.out.println(cnt);	//출력
		sc.close();			//메모리 누수 방지 
	}

}
