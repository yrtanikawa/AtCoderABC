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
		
		int ab = 0;
		for(int i = 0; i < n; i++){
			ab += a[i]*b[i];
		}
		
		if(ab==0) System.out.println("Yes");
		else System.out.println("No");
	}
}
