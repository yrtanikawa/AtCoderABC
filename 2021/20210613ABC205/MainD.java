import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		long[] a = new long[n];
		long[] k = new long[q];

		for(int i = 0; i < n; i++) a[i] = sc.nextLong();
		for(int i = 0; i < q; i++) k[i] = sc.nextLong();
		
		
		


//---------------------------------

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		long[] a = new long[n];
		long[] k = new long[q];

		for(int i = 0; i < n; i++){
			a[i] = sc.nextLong();
		}
		for(int i = 0; i < q; i++){
			k[i] = sc.nextLong();
		}
		
		Set<Long> set = new HashSet<>();
		for(int i = 0; i < n; i++){
			if(!set.contains(a[i])) set.add(a[i]);
		}
		
		long[] c = new long[21474836];
		int cnt = 0;
		for(long i = 0; i < 21474836; i++){
			if(i < q){
				if(set.contains(i)){
					continue;
				}else{
					c[cnt] = i;
					cnt++;
				}
			}
			else{
				c[cnt] = i;
				cnt++;
			}
		}
		for(int i = 0; i < q; i++){
			System.out.println(c[k[i]]);
		}
		
	}
}
