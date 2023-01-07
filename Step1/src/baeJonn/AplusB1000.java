// 백준 1000번 문제 
package baeJonn;

import java.util.Scanner;

public class AplusB1000 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   //키보드로부터 출력 받아오기
		
		int A = sc.nextInt();			//A에 키보드로 불러온 정수값 받아오기
		
		int B = sc.nextInt();			//B에 키보드로 불러온 정수값 받아오기
		
		System.out.println(A + B);
			
		sc.close();			//메모리 누수 방지 
	}
}