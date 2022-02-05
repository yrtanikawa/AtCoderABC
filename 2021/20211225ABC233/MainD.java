import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextLong();
		}
		
		long[] s = new long[n+1];
		s[0] = 0;
		for(int i = 0; i < n; i++){
			s[i+1] = s[i] + a[i];
		}
		
		long ans = 0;
		Map<Long, Long> map = new HashMap<>();
		for(int i = 1; i <= n; i++){
			map.put(s[i-1], map.getOrDefault(s[i-1], 0l) + 1);
			ans += map.getOrDefault(s[i]-k, 0l);
		}
		System.out.println(ans);
	}
}
