import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = 0;
		for(int i = 1; i <= n; i++){
			ans += 100*i*k;
		}
		ans += n*k*(k+1)/2;
		System.out.println(ans);
	}
}
