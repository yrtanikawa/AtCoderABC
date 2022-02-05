import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		int ans = 0;
		if(a[0]==a[1] && a[1]==a[2]) ans = a[0];
		if(a[0]==a[1]) ans = a[2];
		if(a[1]==a[2]) ans = a[0];
		if(a[0]==a[2]) ans = a[1];
		System.out.println(ans);
	}
}
