//백준 10926번 

package baeJonn;

import java.util.Scanner;

public class SpecialCharacterPlus10926 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//키보드로 입력 받아오기 위해 사용
		
		String Str = sc.nextLine();		//String타입으로 Str에 키보드에 받아온다.
		
		System.out.println(Str + "??!");	//키보드 받아온거 + ??!를 출력한다,

		sc.close();		//메모리 누수 방지 
	}
}
