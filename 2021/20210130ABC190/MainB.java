import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int d = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		boolean can = false;
		for(int i = 0; i < n; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			
			if(x[i] < s && y[i] > d) can = true;
		}
		
		if(can) System.out.println("Yes");
		else System.out.println("No");
	}
}
