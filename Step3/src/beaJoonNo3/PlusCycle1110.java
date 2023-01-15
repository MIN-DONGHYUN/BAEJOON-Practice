// 백준 1110번 문제 더하기 사이클, 원래 수로 돌아올 때까지 연산을 반복하는 문제

package beaJoonNo3;

import java.util.Scanner;			//Scanner 사용위해 import

public class PlusCycle1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//scanner로 입력값 받기위해
		
		int start = sc.nextInt();			// 시작값에 키보드 입력 받아옴
		int same = start;					// same에 키보드 값 기억
		
		int lastNo = 0;						//전역 변수 설정
		int mid = 0;
		int cnt = 0;
		
		for(;;)								// 무한반복
		{
			for(int i = 9; i > 0; i--)		// 9번 돌아가자
			{
				if((start % (10*i)) < 10)	// 조건식이 10보다 작으면 실행 
				{
					lastNo += (start % (10*i));	//그 값을 lastNo에 저장
					break;						// for문 탈출
				}
			}
			mid = start/10 + lastNo;		// mid에 값 저장 ex) 스타트 26이면 mid = 2 + 6 = 8
			if(mid >= 10)					// 미드가 10이 넘어가면 
			{
				mid -= 10;					// 10일빼버림 
			}
			start = lastNo*10 + mid;		// 스타트에 결과값 대입
			cnt++;							// 카운트 올린다.
			lastNo = 0;						// lastNo를 초기화 한다.
			if(same == start)				// 처음 들어온 start값과 변한 start값이 같으면
			{
				System.out.println(cnt);	// cnt출력후 무한반복을 빠져나간다.
				break;
			}
		}
		sc.close();							// 메모리 누수 방지 
	}

}

/*
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String number1 = br.readLine();

		System.out.println(getCycle(number1));
	}

	static int getCycle(String number1Str) {

		StringBuilder numberTmp = new StringBuilder(number1Str);
		int number1 = Integer.parseInt(number1Str);
		int cnt = 0; // 사이클을 구하기 위한 변수
		int tmpSum = 0; // 주어진 수의 가장 오른쪽 자리 수와 각 자리수의 합을 구해야 하므로 재사용을 위해 변수 선언

		// 반복 실행
		do {
			// 주어진 수가 1자리 수라면 0을 앞에 붙힌다.
			if (numberTmp.length() < 2) { // 한자리 숫자 일때
				numberTmp.insert(0, 0); // 0번째 자리에 0추가
			}

			// 각 자리수의 합
			tmpSum = numberTmp.charAt(0) + numberTmp.charAt(1) - '0' * 2; // AB >> A+B =CD
			// 주어진 수를 가장 오른쪽 자리만 남긴다.
			numberTmp.deleteCharAt(0); // D
			// 주어진 수를 가장 오른쪽 자리만 남긴 문자열에 각 자리수의 합의 오른쪽 자리를 이어 붙힌다.
			numberTmp.append(tmpSum % 10); // 1의 자리수 = 10으로 나눈후 나머지 // ??
			// 한번 반복이 실행되므로 카운트를 더한다.
			cnt++;

			// 조건은 매번 변하는 numberTmp가 원래 숫자와 같아질 때 까지!
		} while (number1 != Integer.parseInt(String.valueOf(numberTmp)));

		return cnt;
	}

}

*/

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int temp = N;
        int count = 0;
        while (true) {
            int left = temp /10;
            int right = temp %10;

            temp = right * 10 + (left + right) % 10;
            count ++;

            if(N==temp) {
                break;
            }
        }
        System.out.println(count);
    }
}
*/