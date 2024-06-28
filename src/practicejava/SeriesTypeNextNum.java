package practicejava;

import java.util.Scanner;

public class SeriesTypeNextNum {
	
	public static int getTrainingUnits(int n) {
        int MOD = 1000000007;
        if (n <= 3) {
            if (n == 1) {
                return 1;
            } else if (n == 2) {
                return 2;
            } else {
                return 3;
            }
        } else {
            int[] dp = new int[n+1];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 3;
            for (int i = 4; i <= n; i++) {
                dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % MOD;
            }
            return dp[n];
        }
    }
    
    public static void main(String[] args) {
        int n = 6;
        int trainingUnits = getTrainingUnits(n);
        System.out.println("On day " + n + ", David will train " + trainingUnits + " units.");
    }
}
