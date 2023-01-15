//백준 15552번 빠른 A + B


// 1. 기본적으로 BufferedReader는 한 줄을 통째로 입력받는 방법으로 주로 쓰입니다.

// 2. readLine() 메서드는 값을 읽어올 때, String값으로 개행문자(엔터값)를 포함해 한줄을 전부 읽어오는 방식입니다.

// 3. read() 메서드는 값을 읽어올 때, int값으로 변형하여 읽어오는 방식입니다. 

// https://www.acmicpc.net/board/view/9744


/*
Buffer에 저장 후 읽어올 수 있는 방법은 아래와 같이 된다.
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

BufferedReader를 통해 데이터를 읽을 땐 readLine() 메서드를 참고하면 된다.

그러나 String으로 고정되어 오기 때문에 원하는 타입으로 형변환을 시켜주도록 하자.

내가 필요한건 문자를 정수로 변경해야하니 Integer.parseInt를 이용하였다. 
*/

package beaJoonNo3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException; 

public class SpeedAplusB15552 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언 (한줄을 통째로 입력받는 방법???)
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//할당된 버퍼에 값 넣어주기
		
		//String s = bf.readLine(); //String일때는 이렇게 쓴다. //기본적으로 BufferReader은 String형식으로 받는다. 
		int T = Integer.parseInt(br.readLine()); //String을 int형식으로 변경해야 BufferReader을 사용할 수 있다.
		
		StringTokenizer st; // StringTokenizer을 선언한다. 
		// StringTokenizer은 하나의 문자열을 여러 문자열로 분리하는 기능을 가진다.
		// 토큰은 구분 문자로 분리된 문자열을 말한다. 즉 -를 구분자로 두면 - 가 나오면 문자열구분
		
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " "); //StringTokenizer인자값에 입력 문자열 넣음
			// 즉 문자열을 구분 문자 " "로 분리한 StringTokenizer 객체 생성 
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n"); //두개의 String을 받아오고 " "으로 구분한다.			
		}
		
		//int a = Integer.parseInt(st.nextToken()); //첫번째 호출
		//int b = Integer.parseInt(st.nextToken()); //두번째 호출

		//String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음
		
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		br.close();  // 버퍼입력받은거 종료
		
		bw.flush();   //남아있는 데이터를 모두 출력시킴
		bw.close();   //스트림을 닫음
	}
}


//일반적인 스케너는 시간이 초과

/*package beaJoonNo3;

import java.util.Scanner;

public class SpeedAplusB15552 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int result[] = new int [T];
		
		for(int i = 0; i <= T-1; i++)
		{
			int A = sc.nextInt();
			int B = sc.nextInt();
			result[i] = A + B;
		}
		for(int j = 0; j <= T-1; j++)
		{
			System.out.println(result[j]);
		}
		sc.close();	
	}
}
*/

