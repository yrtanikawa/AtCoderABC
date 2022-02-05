import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long ans = 0;
		long x = 1;
		long y = 11;
		while(y <= n){
			ans++;
			
			x++;
			y = Long.parseLong(String.valueOf(x)+String.valueOf(x));
		}
		
		System.out.println(ans);
	}
}
