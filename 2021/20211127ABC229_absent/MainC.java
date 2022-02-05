import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long w = sc.nextLong();
		long[][] ch = new long[n][2];
		for(int i = 0; i < n; i++){
			ch[i][0] = sc.nextLong();
			ch[i][1] = sc.nextLong();
		}
		Arrays.sort(ch,(i1,i2)->Long.compare(i2[0],i1[0]));
		long v = 0;
		for(long[] c : ch){
			if(w <= 0) break;
			long now = Math.min(c[1], w);
			w -= now;
			v += now * c[0];
		}
		System.out.println(v);
	}
}
