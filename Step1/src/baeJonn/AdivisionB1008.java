// 백준 1008번 
package baeJonn;

import java.util.Scanner;

public class AdivisionB1008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   //키보드로부터 출력 받아오기 
		
		double A = sc.nextDouble();        //A에 키보드로부터 실수형으로 받아오기 
		
		double B = sc.nextDouble();		   //B에 키보드로부터 실수형으로 받아오기 
		
		System.out.println(A / B);
		
		
		sc.close();				// 메모리 누수 방지 
	}
}