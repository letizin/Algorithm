package divideconquer;

import java.io.*;
import java.util.*;

public class BOJ10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[21];  //DP 배열 초기화
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];  //피보나치 공식 이용
        }
        System.out.print(dp[n]);
    }
}