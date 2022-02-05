import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		long sum = 0;
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			sum += a[i];
		}
		long x = sc.nextLong();
		
		long p = x / sum;
		long sumb = p * sum;
		long ans = p * n;
		for(int i = 0; i < n; i++){
			sumb += a[i];
			ans++;
			if(sumb > x){
				System.out.println(ans);
				return;
			}
		}
	}
}
