import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n+1];
		int[] c = new int[n+1];
		for(int i = 1; i <= n; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 1; i <= n; i++){
			b[i] = sc.nextInt();
		}
		for(int i = 1; i <= n; i++){
			c[i] = sc.nextInt();
		}
		
		int[] count = new int[n+1];
		for(int i = 1; i <= n; i++){
			count[b[c[i]]]++;
		}
		long ans = 0;
		for(int i = 1; i <= n; i++){
			ans += count[a[i]];
		}
		System.out.println(ans);
	}
}

/*--------*/

//WA&TLE
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			c[i] = sc.nextInt();
		}

		int ans = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(a[i] == b[c[j]-1]) ans++;
			}
		}
		System.out.println(ans);
	}
}
