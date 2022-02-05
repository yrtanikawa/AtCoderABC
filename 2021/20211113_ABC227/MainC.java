import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		for(long a = 1; a*a*a<=n; a++){
			long t = n/a;
			for(long b = a; b*b<=t; b++){
				long c = t/b;
				ans += Math.max(c-b+1, 0);
			}
		}
		System.out.println(ans);
	}
}
