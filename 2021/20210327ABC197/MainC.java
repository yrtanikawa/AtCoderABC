import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < 1<<(n-1); i++){
			int xored = 0;
			int ored = 0;
			for(int j = 0; j <= n; j++){
				if(j < n) ored |= a[j];
				if(j==n || (i >> j & 1) > 0){
					xored ^= ored;
					ored = 0;
				}
			}
			min = Math.min(min, xored);
		}
		System.out.println(min);
	}
}
