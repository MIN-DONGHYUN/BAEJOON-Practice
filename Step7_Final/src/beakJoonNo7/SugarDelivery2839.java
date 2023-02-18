// 백준 2839번 문제 설탕 배달, 5와 3을 최소 횟수로 합하여 N을 만드는 문제

/*
번호 3  4  5   6     7  8    9    10     11    12   13   14    15    16   17   18   19    20   21   22   23    24   25    26    27   28    29    30
3KG 1     0   2        1    3    0      2     4    1     3     0     2    4    1    3     0    2    4    1     3    0     2     4    1     3     0
5KG 0     1   0        1    0    2      1     0    2     1     3     2    1    3    2     4    3    2    4     3    5     4     3    5     4     6
없음    -1          -1                                 

5의배수는 5를 늘리는게 가장적은수

5*n+1 일때 3kg는 2개 5kg n개
5*n+3 일때 3kg는 1개 5kg n개

5*n+2일때 3kg는 3개 5kg는 n개  12부터
5*n+4일때 3kg는 3개 5kg는 n개  9부터

*/
package beakJoonNo7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery2839 {

	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼리더 사용

			int N = Integer.parseInt(br.readLine());  //키보드로부터 값을 받아옴
			if(3<= N && N <=5000)  // 3부터 5000꺼자
			{
				int cnt = 0;	//값 받아옴

				if(N%5 == 0)    //5의 배수일때 
				{	
					cnt = N/5;
				}
				else if(N<11 && N%3 == 0)	// 11전까지 3의 배수일때 
				{
					cnt = N/3;
				}
				else if(N>2 && N%5 == 1)	// 2 이후 5를 나눠을때 나머지 1일때
				{
					cnt = N/5-1;
					cnt += 2;
				}
				else if(N>8 && N%5 == 2)	// 8 이후 5를 나눠을때 나머지 2일때
				{
					cnt = N/5-2;
					cnt += 4;
				}
				else if(N>2 && N%5 == 3)	// 2 이후 5를 나눠을때 나머지 3일때
				{
					cnt = N/5;
					cnt ++;
				}
				else if(N>8 && N%5 == 4)	// 8 이후 5를 나눠을때 나머지 4일때
				{
					cnt = N/5-1;
					cnt += 3;
				}
				else						// 나머지 4와 7 경우 
				{
					cnt = -1;
				}
				System.out.println(cnt);	// 출력 
			}
			br.close();						//메모리 누수 방지 
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
