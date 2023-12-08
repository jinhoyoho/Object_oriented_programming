import java.util.Scanner;
import java.util.PriorityQueue;

public class TwoPair{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PriorityQueue<Integer> heapq = new PriorityQueue<Integer>(); // 우선순위 큐
		
		System.out.println("Enter four number:");
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num4 = in.nextInt();
		
		heapq.add(num1); // 우선순위 큐 추가
		heapq.add(num2);
		heapq.add(num3);
		heapq.add(num4);
		
		num1 = heapq.remove();
		num2 = heapq.remove();
		num3 = heapq.remove();
		num4 = heapq.remove(); // 반환
		
		// heapq를 사용하다가 느낀건데 그냥 정렬 쓰면 됨...
		
		if ((num1 == num2) && (num3 == num4))
		{
			System.out.println("Two Pairs.");
		}
		else
		{
			System.out.println("Not two pairs.");
		}
		
	}
}