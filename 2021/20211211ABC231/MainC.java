import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i = 0; i < q; i++){
			int x = sc.nextInt();
			int ok = n, ng = -1;
			while(ok-ng > 1){
				int mid = (ok+ng)/2;
				if(a[mid]>=x) ok = mid;
				else ng = mid;
			}
			System.out.println(n-ok);
		}
	}
}
