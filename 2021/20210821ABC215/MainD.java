import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		
	}
	
	//a,b‚ÌÅ‘åŒö–ñ”‚ð‹‚ß‚é
	public static int gcd(int m, int n){
		if(n==0){
			return m;
		}
		return gcd(n, m%n);
	}
}
