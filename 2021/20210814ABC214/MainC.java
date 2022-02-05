import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		int[] t = new int[n];
		for(int i = 0; i < n; i++){
			s[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			t[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < n*2; i++){
			t[(i+1)%n]=Math.min(t[(i+1)%n], t[i%n]+s[i%n]);
		}
		
		//‰ñ“š‚Ìo—Í
		for(int i = 0; i < n; i++){
			System.out.println(t[i]);
		}
	}
}
//https://atcoder.jp/contests/abc214/submissions/25070510



//https://atcoder.jp/contests/abc214/submissions/25029131
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		int[] t = new int[n];
		int tt = Integer.MAX_VALUE;
		int id = -1;
		for(int i = 0; i < n; i++){
			s[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			t[i] = sc.nextInt();
			if(tt >= t[i]){
				tt = id;
				id = i;
			}
		}
		
		int[] ans = new int[n];
		Arrays.fill(ans, Integer.MAX_VALUE);
		ans[0] = t[0];
		long now = tt;
		for(int i = 1; i < 2*n; i++){
			ans[(id+i)%n] = tt;
			tt = Math.min(tt+s[(id+i)%n], t[(id+i+1)%n]);
		}

		for(int i = 0; i < n; i++){
			System.out.println(ans[i]);
		}
	}
}
