package array;

/**
 * Created by Administrator on 2018/3/28 0028.
 */
public class LIS {
    public static int LIS(int arr[], int n) {
        int []dp=new int[n+1];
        for (int i = 1; i <= n; ++i)
            dp[i] = 0;
        int ans;
        dp[1] = 1;
        for (int i = 2; i <= n; ++i) {
            ans = dp[i];
            for (int j = 1; j < i; ++j) {
                if (arr[i] > arr[j] && dp[j] > ans)
                    ans = dp[j];
            }
            dp[i] = ans + 1;
        }
        ans = 0;
        for (int i = 1; i <= n; ++i) {
            if (dp[i] > ans)
                ans = dp[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] array={1 ,7 , 3 , 5 , 9 , 4,  8};
        int ans=LIS(array,7);
    }
}
