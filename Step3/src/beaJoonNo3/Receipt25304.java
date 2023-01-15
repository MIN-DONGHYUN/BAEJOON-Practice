// 백준 25304 영수증

package beaJoonNo3;

import java.util.Scanner;		//java.util패키지의 scanner사용

public class Receipt25304 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// 키보드사용 위해 설정
		
		int result2 = 0;					// 결과값 비교하기위해 변수설정
		
		int result = sc.nextInt();			// 결과값 키보드로부터 받아옴
		
		int num = sc.nextInt();				// 물건 산 갯수 키보드로부터 받아옴
		
		int money [] = new int[num * 2];	// money배열에 값 + 갯수를 저장
		
		for(int i = 0; i <= num * 2 -1; i++)  // 물건 산 갯수 *2 -1 로 배열 갯수 설정
		{
			money[i] = sc.nextInt();		// 배열 키보드로 결과 넣기 
		}
		
		for(int j = 0; j <= num * 2 - 1; j++ )	// money[]배열에 물건 값과 갯수를 곱해서 총액을 나타내기 위해 사용
		{
			money[j] = money[j] * money[j+1];	//if money[0] = money[0] * money[1];
			j++;								// j를 1더해서 중복을 방지한다. 0과 1이 곱하고 2와 3이 곱하도록
		}
		for(int k = 0; k <= num -1; k++)		//각 물건의 총액을 더하기 위해서 설정한다. 
		{
			result2 = money[2*k]  + result2;	//결과를 더해서 result2에 넣는다.
		}
		
		if(result == result2)				//만약 총액과 각 물건의 총액이 같다면
		{
			System.out.println("Yes");		//Yes
		}
		else								//총액과 각 물건의 총액이 다르다면
		{
			System.out.println("No");		//No
		}
		sc.close();		//메모리 누수 방지 
	}
}

/*   배열 사용 안할 시 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int tot = sc.nextInt();
        int tot_check = 0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            tot_check = tot_check + (a*b);
        }
        sc.close();
        if (tot == tot_check)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}


*/
