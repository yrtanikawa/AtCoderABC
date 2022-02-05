import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			
		}
		for(int i = 0; i < n; i++){
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(Math.max(0, b[0]-a[n-1]+1));
	}
}

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			
		}
		for(int i = 0; i < n; i++){
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		
		int ans = 0;
		for(int i = a[n-1]; i <= 1000; i++){
			if(i <= b[0]) ans++;
		}
		
		System.out.println(ans);
	}
}
