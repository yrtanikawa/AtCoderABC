import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] a = new int[k+1];
		
		for(int i = 0; i <= k; i++){
			if(i==0) a[i] = n;
			else{
				a[i] = maxNum(a[i-1]) - minNum(a[i-1]);
			}
		}
		System.out.println(a[k]);
	}
	
	public static int minNum(int x){
		String s = Integer.toString(x);
		int n = s.length();
		String ans = "";
		char[] c = s.toCharArray();
		Arrays.sort(c);
		for(int i = 0; i < n; i++){
			ans += c[i];
		}
		//System.out.println(ans);
		return Integer.parseInt(ans);
	}
	public static int maxNum(int x){
		String s = Integer.toString(x);
		int n = s.length();
		String ans = "";
		char[] c = s.toCharArray();
		Arrays.sort(c);
		for(int i = n-1; i >= 0; i--){
			ans += c[i];
		}
		//System.out.println(ans);
		return Integer.parseInt(ans);
	}
}
