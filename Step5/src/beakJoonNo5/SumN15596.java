// 백준 155596문제 정수N개의 합, 함수를 구현해 봅시다. 

package beakJoonNo5;

public class SumN15596 {

	long sum(int[] a) 			// main이 아닌 함수를 직접 만들어본것
	{
		long sum = 0;		// 합계 선언
		
		for(int i=0;i<a.length;i++)	//a배열의 길이까지 반복
		{
			sum += a[i];		//합을 누적
		}
		return sum;		//리턴해서 합을 리턴
	}
}
