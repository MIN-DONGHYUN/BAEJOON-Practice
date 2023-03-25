package beakJoonNo6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Palindrome10988 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//버퍼 리더를 사용해보자 
		// 버퍼 리더선언 오리발, (new InputStreamReader(system.in 을 사용하여 입력을 받아온다.))
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int cnt = 0;
		boolean gogo = false;
		
		String str = br.readLine();

		
		if(1 <= str.length() && str.length() <= 100)
		{
			for(int z = 0 ; z < str.length(); z++)
			{
				if('a' <= str.charAt(z) && str.charAt(z) <= 'z')
				{
					gogo = true;
				}
				else {
					gogo = false;
					break;
				}
				
			}
			
			if( gogo == true)
			{
				for(int i = 0; i < str.length()/2; i++)
				{
					if(str.charAt(i) != str.charAt(str.length() - i -1 ))
					{                // 5    2    level    01   43
						cnt = 0;
						break;
					}
					else {
						cnt = 1;
					}
				}
			}	
		}
		
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
		bw.close();
	}

}
