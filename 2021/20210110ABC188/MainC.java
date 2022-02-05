import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = (int)Math.pow(2, n);
		int[] a = new int[m];
		for(int i = 0; i< m; i++){
			a[i] = sc.nextInt();
		}
		int max1=0, max2=0;
		int idx1=-1, idx2=-1;
		for(int i = 0; i < m/2; i++){
			if(max1 < a[i]){
				max1 = a[i];
				idx1 = i;
			}
			if(max2 < a[i+m/2]){
				max2 = a[i+m/2];
				idx2 = i + (m/2);
			}
		}
		if(max1 > max2) System.out.println((idx2+1));
		else System.out.println((idx1+1));
	}
}

/*
‚¿‚ª‚¤
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int [n/2];
		boolean[] win = new boolean[n];
		for(int i = 0; i< n; i++){
			a[i] = sc.nextInt();
			win[i] = true;
		}
		
		for(int i = 0; i < n/2; i++){
			b[i] = a[i];
		}
		Arrays.sort(b);
		
		int  ans = 0;
		for(int i = 0; i < n; i++){
			if(b[b.length-1]==a[i]){
				ans = i;
				break;
			}
		}
		System.out.println(ans+1);
	}
}
*/