package bruteforce;

import java.util.Random;
import java.util.Scanner;

public class BOJ2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int card = sc.nextInt();
		int sumvalue = sc.nextInt();
		
		int maxsum = 0;
		
		// 카드 숫자 읽어서 배열에 저장하기
		int[] cards = new int[card];
		
		for(int i = 0; i<card; i++) {
			cards[i] = sc.nextInt();
		}
		
		for(int card1 = 0; card1 < card-2; card1++) {
			for(int card2 = card1 + 1; card2 < card-1; card2++) {
				for(int card3 = card2 + 1; card3 < card; card3++) {
					int sum = cards[card1] + cards[card2] + cards[card3];
					if(sum <= sumvalue && sum > maxsum) {
						maxsum = sum;
					}
				}
			}
		}
		
		System.out.println(maxsum);
	}
}
