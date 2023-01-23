//백준 1316번 문제 그룹 단어 체커, 조건에 맞는 문자열을 찾는 문제 

package beakJoonNo6;

import java.util.Scanner;

public class GroupWordChecker1316 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		String str []= new String [T];
		
		int cnt=0;
		int cnt1 = 0;
		
		for(int i=0;i<T;i++)
		{
			str[i] = sc.nextLine();
			for(int j=0;j<T;j++)
			{
				char ch [] = str[i].toCharArray();
				if(i+1 < str[i].length())
				{
					if(ch[i] == ch[i+1])
					{
						cnt--;
					}
					//else if(ch[i] == ch[j])
					//{
					//	cnt -= 2;
					//}
				}
				
			}
			cnt++;
			if(cnt != 0)
			{
				cnt1++;
			}
			
			
		}
		System.out.println(cnt1);
		sc.close();
	}

}
