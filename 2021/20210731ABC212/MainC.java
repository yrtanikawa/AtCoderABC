//‚í‚©‚ç‚ñ


import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			b[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		TreeList<Integer, Integer> list = new TreeList<>();
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				list.get(Math.abs(a[i]-b[i]));
			}
		}
		System.out.println(list.firstKey());
	}
}
