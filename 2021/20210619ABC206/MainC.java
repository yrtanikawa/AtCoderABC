import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		long result = cntComb(n);
		int cnt = 1;
		int prev = 0;
		
		for(int i = 0; i < n; i++){
			int tmp = a[i];
			if(tmp==prev){
				cnt++;
			}else{
				result -= cntComb(cnt);
				cnt = 1;
			}
			prev = tmp;
		}
		
		result -= cntComb(cnt);
		System.out.println(result);
	}
	
	public static long cntComb(int i){
		return (long)i*(i-1)/2;
	}
}
