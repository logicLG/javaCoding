package xiaozhao.xz2017.xiaohongshu;


import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class dizeng {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(maxProfit(arr,n));

    }
    public static int maxProfit(int[] prices, int length) {		int res = 0;		int dp[][] = new int[length][length];		for (int i = 0; i < length - 1; i++) {						for (int j = i + 1; j < length; j++) {				dp[i][j] = prices[j] - prices[i];				System.out.print(dp[i][j] + " ");			}					} 		int max = 0;		int ma2 = 0;		int start = 0;		int end = 0;		for (int i = 0; i < length; i++)			for (int j = i + 1; j < length; j++) {				if (dp[i][j] > max) {					max = dp[i][j];					start = i;					end = j;				}			}		System.out.println(start + " " + end + " " + max);		for (int i = 0; i < start; i++)			for (int j = i + 1; j < start; j++) {				if (dp[i][j] > ma2) {					ma2 = dp[i][j]; 				}			} 		if (end < length - 1)			for (int i = end + 1; i < length; i++) {				for (int j = i + 1; j < length; j++) {					if (dp[i][j] > ma2) {						ma2 = dp[i][j]; 					}				}			}		res = max + ma2;		return res;	}


}
