import java.util.Scanner;

public class 피보나치수5_박주원 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(fibonacci(n));
	}
	
	static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n-2) + fibonacci(n-1);

	}

}
