package bruteforce;

import java.util.Scanner;

public class BOJ2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
		int result = 0;

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				count++;
			}
			if (count == K) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
