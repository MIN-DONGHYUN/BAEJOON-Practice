// 백준 10250 번 문제 ACM호텔, 호텔 방 번호의 규칙을 찾아 출력하는 문제

package beakJoonNo7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ACMHotel10250 {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		//BufferedReader 사용
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		//BufferedWrite 사용
		
			int T = Integer.parseInt(br.readLine());		// 테스트 회수 입력받음
			
			StringBuilder sb = new StringBuilder();			// 스트링 빌더 사용
			
			for(int i = 0; i < T; i++)						// 테스트 번 반복 
			{
				StringTokenizer st = new StringTokenizer(br.readLine());	//스트링 토큰 사용
				int H = Integer.parseInt(st.nextToken());  //층			
				Integer.parseInt(st.nextToken());  //방수
				int N = Integer.parseInt(st.nextToken());  // 손님 번호
				String result = "";		//결과값 받기 위해 선언 
				
				int cnt1 = N/H;			// 호수를 나타내기 위해 
				int cnt2 = N%H;			// 층을 나타내기 위해 
				
				if(cnt1 == 0)		// 호수가 0이면 
				{
					result = Integer.toString(cnt2) + "01";			// 층수 + 01
				}
				else				// 호수가 0이 아니면 
				{
					
					if(cnt1+1 < 10 )	// 호수 +1 가 10보다 작으면 
					{
						result = Integer.toString(cnt2) + "0" + Integer.toString(cnt1+1);		//층수 + 0 +호수 
					}
					else			// 10이상이면 
					{
						result = Integer.toString(cnt2) + Integer.toString(cnt1+1);			//층수 + 호수 
					}
					if(N%H == 0)									// 층%손님수 이 0 이랑 같으면  
					{
						result = H + Integer.toString(N/H);			// 층 + 호수 
						
						if(N/H < 10)								// 10보다 작으면 
						{
							result = H + "0" + Integer.toString(N/H);	// 층 + 0 + 호수 
						}
					}
				}
				sb.append(result+"\n");					// 스트링 빌더에 쌓는다.
			}
			bw.write(sb.toString());					// 스트링 빌더을 출력한다.
			bw.close();									// 메모리 누수 방지 
			br.close();
			
		} 
		catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
