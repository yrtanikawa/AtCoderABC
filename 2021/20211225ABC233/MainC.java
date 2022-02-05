import java.util.*;
public class Main {
	static int[][] a;
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		a = new int[n][];
		for(int i = 0; i < n; i++){
			int l = sc.nextInt();
			a[i] = new int[l];
			for(int j = 0; j < l; j++){
				a[i][j] = sc.nextInt();
			}
		}
		dfs(0, n, k);
		System.out.println(ans);
	}
	static void dfs(int i, int n, long k){
		if(i == n){
			if(k == 1){
				ans++;
			}
			return;
		}
		int m = a[i].length;
		for(int h = 0; h < m; h++){
			if(k%a[i][h] == 0){
				dfs(i+1, n, k/a[i][h]);
			}
		}
	}
}
