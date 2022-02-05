import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] p = new int[n];
		int[] x = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			p[i] = sc.nextInt();
			x[i] = sc.nextInt();
		}
		
		int ans = 1000000001;
		for(int i = 0; i < n; i++){
			x[i] -= a[i];
			if(x[i] > 0) ans = Math.min(ans, p[i]);
		}
		
		if(ans== 1000000001) System.out.println(-1);
		else System.out.println(ans);
	}
}
