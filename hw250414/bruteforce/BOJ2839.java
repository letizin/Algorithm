package bruteforce;

import java.util.Scanner;

public class BOJ2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int max5 = n/5;
		int max3 = n/3;
		int minBag = n;
		
		for(int i = 0; i<=max5; i++) {
			for(int j = 0; j<=max3; j++) {
				int sum = i*5 + j*3;
				int numBags = i+j;
				if(sum == n && numBags < minBag) {
					minBag = numBags;
				}
			}
		}
		
		if(minBag == n) {
			System.out.println("-1");
		}else {
			System.out.println(minBag);
		}
	}
}
