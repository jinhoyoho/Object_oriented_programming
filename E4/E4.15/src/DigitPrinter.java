import java.util.Scanner;
import java.util.Stack;

public class DigitPrinter{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a 5 digit interger: ");
		
		int digit = in.nextInt(); // 정수 입력
		Stack<Integer> stack = new Stack<>(); // int형 스택 선언
		
		for (int i=0; i<5; i++) {
			stack.push(digit%10); // 10으로 나눈 나머지 저장
			digit /= 10; // 10으로 나눈 몫 저장
		}
		
		for (int i=0; i<5; i++) {
			System.out.print(stack.pop() + " ");
		}
	}
}