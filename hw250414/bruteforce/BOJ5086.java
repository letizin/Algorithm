package bruteforce;

import java.util.Scanner;

public class BOJ5086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean set = true;
		
		do {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) {
				set = false;
			}else {
				if(a<b) {
					if(b % a == 0) {
						System.out.println("factor");
					}else {
						System.out.println("neither");
					}
				}else {
					if(a % b == 0) {
						System.out.println("multiple");
					}else {
						System.out.println("neither");
					}
				}
			}
		}while(set);
	}
}
