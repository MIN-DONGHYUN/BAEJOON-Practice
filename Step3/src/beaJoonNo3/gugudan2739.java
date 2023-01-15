//백준 2739번 구구단

package beaJoonNo3;

import java.util.Scanner;  //java.util 패키지의 스케너사용

public class gugudan2739 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //키보드 입력 위해 사용
		
		int num = sc.nextInt();				  // 키보드 입력값 num에 넣기
		
		for(int i = 1; i <=9 ; i++)			  //반복문 1~9까지 
		{
			System.out.println(num + " * " + i + " = " + (num*i));  // 구구단 출력
		} 
		
		sc.close();   //메모리 누수 방지
	}
}
