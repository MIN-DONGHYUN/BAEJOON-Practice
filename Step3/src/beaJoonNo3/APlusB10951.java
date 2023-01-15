// 백준 10951번 문제 A + B  입력이 끝날 때까지 A+B를 출력하는 문제. EOF에 대해 알아 보세요.

package beaJoonNo3;

import java.util.Scanner;   // Scanner 사용을 위해 

public class APlusB10951 {  

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//키보드 입력 
		
		while(sc.hasNextInt()) {  ////hasNextInt 입력값이 정수 일 때만 true 아니면 false반환
			int a = sc.nextInt();	// 숫자 
			int b = sc.nextInt();  
			
			System.out.println(a + b);
		}
		
		sc.close();		// 메모리 누수 방지 
	}
}
