import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		Arrays.sort(a);
		//a[n-2]==booby score
		for(int i = 0; i < n; i++){
			if(b[i] == a[n-2]) System.out.println(i+1);
		}
	}
}
