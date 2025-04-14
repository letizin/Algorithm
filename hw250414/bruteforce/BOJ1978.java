package bruteforce;

import java.util.Scanner;

public class BOJ1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int set = 0;
		int count = 0;
		boolean setT = true;
		for(int i=0; i<n; i++) {
			int get = sc.nextInt();
			if(get != 1) {
				for(int j = 2; j<get; j++) {
					if(get % j == 0) {
						setT = false;
					}
				}
				
				if(setT == true) {
					count++;
				}
				setT = true;
			}
		}
		
		System.out.println(count);
	}
}
