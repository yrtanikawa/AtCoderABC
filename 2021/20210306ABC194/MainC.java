import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		long asum = 0;
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			asum += a[i];
		}
		
		long a1 = 0;
		for(int i = 0; i < n; i++){
			a1 += a[i]*a[i];
		}
		
		long ans = n*a1 - asum*asum;
		
		System.out.println(ans);
	}
}
