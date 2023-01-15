//백준 2439문제 별 찍기 - 2, 별을 찍는 문제 2

package beaJoonNo3;

import java.util.Scanner;		//java.util패키지 의 scanner사용위헤

public class StarReverse2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //키보드 입력 받기 위해 
		
		int T = sc.nextInt();		// 테스트 몇번할지 키보드로 입력받음
		
		for (int i = 0 ; i < T; i++)	// T번 돌아가도록 반복
		{	
			for(int j = i; j < T; j++)		// j가 i번 부터 테스트 T번까지 반복한다. ex) i =0이면 j도 0으로 들어가 5번 반복한다.
											// i = 1이면 j도 1이 들어가 4번 반복한다. 
			{
				if(j != T-1) 				// 만약 j가 T-1번과 다르다면 실행한다. 즉 j 반복문이 마지막부분이 아니라면 실행한다는 뜻이다.
				{
					System.out.print(" ");		// 공백을 찍는다.  , 만약 j = T-1이 아니라면 T-1까지 j 반복문 마지막까지 싱행될것이다.
				}
				else						// j 반복문이 마지막 반복을 실행하고 있을때 실행한다. 즉 j = T-1 일때 실행한다.
				{
					
					for(int k = T; k > j-i; k--){		// k = T로 초기값을 설정한다.
														// (j = T-1을뜻함) j에서 i반복문 실행횟수를 빼서 나타낸다.
														// ex) T가 5라면 k의 초기값은 5이고 j는 4일것이다 
														//     5 > 4-i 이므로 i반복문이 처음들어간다면 5 > 4 - 0 이므로 반복문 실행
														//     그 이후 k의 값을 후위수식으로 1 뺐으므로 k는 4가되어 더이상 반복문 실행 X
					
						System.out.print("*");		// 별을 찍는다.
					}
				}
			}
			System.out.print("\n");			// 줄바꿈
		}
		sc.close();  //메모리 누수 방지 
	}
}
/*   별 반대로 나옴 

*****
****
***
**
*

package beaJoonNo3;

import java.util.Scanner;		//java.util패키지 의 scanner사용위헤

public class StarReverse2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //키보드 입력 받기 위해 
		
		int T = sc.nextInt();		// 테스트 몇번할지 키보드로 입력받음
		
		for (int i = 0 ; i < T; i++)	// T번 돌아가도록 반복
		{
			for(int k = i; k < T; k++)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");			// 줄바꿈
			
		}
		sc.close();  //메모리 누수 방지 
	}
}

*/

/////버퍼 사용
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                sb.append(" ");
            }
            for(int k =1; k<=i; k++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}

*/

//////간단한게 정답에 가까움
/*
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
*/
