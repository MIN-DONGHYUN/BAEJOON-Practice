//백준 18108번

package baeJonn;

import java.util.Scanner;

public class Minus543_18108 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//키보드로 받기위해 사용
		
		int Num = sc.nextInt();			//키보드로 정수형을 받아옴
		
		System.out.println((Num - 543));	//키보드 받아온값 - 543
		
		sc.close();		//메모리 누수 방지 
	}
}
