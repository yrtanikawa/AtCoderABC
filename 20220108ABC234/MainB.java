import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i< n; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		double max2 = 0;
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				double dis2 = (x[i]-x[j])*(x[i]-x[j]) + (y[i]-y[j])*(y[i]-y[j]);
				max2 = Math.max(max2, dis2);
			}
		}
		System.out.println(Math.sqrt(max2));
	}
}
