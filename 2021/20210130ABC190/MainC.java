import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		for(int i = 0; i < m; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int[] c = new int[k];
		int[] d = new int[k];
		for(int i = 0; i < k; i++){
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		
		int ans = 0;
		
		boolean[] dish = new boolean[n+1];
		for(int i = 0; i < Math.pow(2, k); i++){
			int count = 0;
			Arrays.fill(dish, false);
			for(int j = 0; j < k; j++){
				if((1&i>>j) == 1) dish[c[j]] = true;
				else dish[d[j]] = true;
			}
			
			for(int p = 0; p < m; p++){
				if(dish[a[p]] == true && dish[b[p]] == true){
					count++;
				}
			}
			ans = Math.max(ans, count);
		}
		
		System.out.println(ans);
	}
}
