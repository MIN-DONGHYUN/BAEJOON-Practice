//백준 10757번 문제 큰 수 A+B 
// 파이썬 같은 언어는 10,000자리 정도의 자연수도 자유롭게 다룰 수 있습니다. 하지만 C/C++이라면 이 문제를 어떻게 풀까요? C/C++ 사용자가 아니더라도 고민해 보면 좋을 것입니다.
// BigInteger 를 사용하면 큰 수도 더할 수 있다
// 더할 때에는 기존변수.add(더할변수));를 사용한다.

package beakJoonNo7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BigNumAplusB10757 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// 버퍼사용으로 속도 up
		
		StringTokenizer st = new StringTokenizer(br.readLine());  // 스트링 토큰 을 사용하여 스페이스로 구분
		
		
		BigInteger A = new BigInteger(st.nextToken());	// BigInteger를 사용하면 long 보다 긴 수를 더 할 수 있다.
		BigInteger B = new BigInteger(st.nextToken());
		System.out.println(A.add(B));   /// 출력 
	}
}
	

// 틀린부분 
		
		/*
		A.toCharArray();
		B.toCharArray();
		
		if(A.length() > B.length())
		{
			for(int i =0; i< B.length(); i++)
			{
				if((A.charAt(i)-48) + (B.charAt(i)-48) + cnt > 9)
				{
					cnt++;
					sb.append((A.charAt(i) + B.charAt(i) + cnt) % 10);
				}
				else
				{
					System.out.println(A.charAt(i) + "\t" + i+"번째");
					sb.append(((A.charAt(i)-48) + (B.charAt(i)-48) + cnt));
				}
				
				if(i == B.length()-1)
				{
					for(int j = 0; j < A.length() - B.length() ; j++)
					{
						if(A.charAt(i+j+1)+cnt > 9)
						{
							sb.append(A.charAt(i+j+1) % 10);
							cnt = 1;
						}
						else
						{
							sb.append(A.charAt(i+j+1));
							cnt = 0;
						}
					}
				}
				else
				{
					cnt = 0;
				}
				
			}
			
		}
		System.out.println(sb.toString());
		
	}

}
*/