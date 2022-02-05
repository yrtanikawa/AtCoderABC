import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		long[] rem = new long[200];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			rem[a[i]%200]++;
		}
		
		long ans = 0;
		for(int i = 0; i < 200; i++){
			ans += (rem[i]*(rem[i]-1))/2;
		}
		System.out.println(ans);
	}
}

//TLE
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		
		int ans = 0;
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
				if((a[i]-a[j])%200==0){
					ans++;
					//System.out.println(i + " " + j);
				}
			}
		}
		System.out.println(ans);
	}
}
