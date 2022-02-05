import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = "chokudai";
		long[][] dp = new long[s.length()+1][9];
		
		for(int i = 0; i < s.length()+1; i++){
			dp[i][0] = 1;
		}
		for(int i = 1; i < 9; i++){
			dp[0][i] = 0;
		}
		
		for(int i = 1; i < s.length()+1; i++){
			for(int j = 1; j < 9; j++){
				if(s.charAt(i-1) == t.charAt(j-1)){
					dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
					dp[i][j] %= 1000000007L;
				}else{
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		System.out.println(dp[s.length()][8]%1000000007L);
	}
}
