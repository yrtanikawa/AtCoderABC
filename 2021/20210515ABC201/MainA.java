import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int[] a = new int[n];
		for(int i = 0; i < n ; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		
		if(a[2]-a[1]==a[1]-a[0]) System.out.println("Yes");
		else System.out.println("No");
	}
}
