import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		boolean[] pizza = new boolean[360];
		Arrays.fill(pizza, false);
		pizza[0] = true;
		int now = 0;
		for(int i = 0; i < n; i++){
			int p = a[i];
			now -= p;
			if(now < 0) now += 360;
			pizza[now] = true;
		}
		int max = 0;
		int before = 0;
		for(int i = 1; i < 360; i++){
			if(pizza[i] == true){
				max = Math.max(max, i-before);
				before = i;
			}
		}
		max = Math.max(max, 360-before);
		System.out.println(max);
	}
}
