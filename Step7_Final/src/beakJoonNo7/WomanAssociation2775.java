package beakJoonNo7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class WomanAssociation2775 {

	public static void main(String[] args) {
		
		try {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		//BufferedReader 사용
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		//BufferedWrite 사용
			
			int T = Integer.parseInt(br.readLine());		// 테스트 회수 입력받음
			StringBuilder sb = new StringBuilder();			//스트링 빌더 
			
			for(int i = 0 ; i < T ; i++)					// T번 반복
			{
				int k = Integer.parseInt(br.readLine());	// 입력받음 
				int n = Integer.parseInt(br.readLine());
				
				int [][] APT = new int [15][15];			// 15층 15호수까지 
				
				for(int a = 0; a < 15; a++)					//15번 반복 
				{
					APT[a][1] = 1;							//몇층이든 1호수는 1
					APT[0][a] = a;							//0층 몇호든 호수만큼 a					
				}

				for(int j =1; j < 15; j++ )					// 1층부터 15층 전까지 
				{
					for(int z = 2 ; z < 15; z++)			//2호수 부터 15호수전까지 
					{
						APT[j][z] = APT[j-1][z] + APT[j][z-1];	// ex 1 3 이면 0층 3호와 1층 2호를 더한다.
					}
				}
				sb.append(APT[k][n]+"\n");				// 출력하기 위해 저장 
			}
			//1 2 3 4 5   +1                         0층
			//1 3 6 10 15  +2 3 4 5
 			//1 4 10 20 35 +3 6 10 15
			//1 5 15 35 70 +4 10 20 35               3층
			
			//  1  3   6
			//  2  3   10
			bw.write(sb.toString());		// 출력 
			bw.close();
			br.close();
			
		} 
		
		catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
	}

}
