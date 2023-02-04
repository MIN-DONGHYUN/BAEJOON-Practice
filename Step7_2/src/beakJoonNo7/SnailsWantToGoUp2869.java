//백준 2869 문제 달팽이는 올라가고 싶다, 달팽이의 움직임을 계산하는 문제

package beakJoonNo7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SnailsWantToGoUp2869 {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		// 스트링 버퍼 사용 
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			StringTokenizer st;			// 토큰 사용하기 위해

			st = new StringTokenizer(br.readLine());  // 한 줄마다 구분함
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			int cnt = 0;
					
			cnt = (V - B) / (A -B);				// cnt 는 (목표위치 - 하루 내려가는 양) / (하루 올라가는 양 - 하루 내려가는 양)  
			if((V - B) % (A -B) != 0)			// 나머지가 남아있다면 하루 더 올라가야 하니까 1더해줌 
			{
				cnt++;
			}
			
			bw.write(Integer.toString(cnt));	// 출력 
			bw.close();
			br.close();
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}	
		
	}

}
