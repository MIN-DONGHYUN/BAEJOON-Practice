//백준 1712번 문제 손익분기점, 이익이 발생하는 지점을 찾는 문제

package beakJoonNo7;

import java.util.Scanner;

public class Break_evenPoint1712 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		//키보드 사용을 위해 Scanner
		
		int A = sc.nextInt();			//고정비용 초기값 입력
		int B = sc.nextInt();			//가변비용 초기값 입력
		int C = sc.nextInt();			//한대당 판매비용 초기값 입력
		int result = 0;					//결과값 초기화
		
		if(B-C >= 0)					//가변비용이 판매비용보다 같거나 크면 
		{
			result = -2;				// -1 로 나타내기 위해 -2대입
		}
		else							// 판매비용이 가변비용보다 크면 
		{
			result = A/(C-B); 			// 고정비용/ (판매비용-가변비용) 으로 값을 낸후
		}
		
		System.out.println(result+1);	// 결과값에 1을 더해서 손익분기점 넘은 시점을 본다.
		
		sc.close();					//메모리 누수 방지 
	}
}
		
		/*
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		
		int i = 0;
		do
		{
			i++;
			if(B>C)
			{
				i = -1;
				break;
			}
		}while(!(A+(B*i) < (C * i)));
		
		System.out.println(i);
		
		sc.close();
		
	}

}
*/