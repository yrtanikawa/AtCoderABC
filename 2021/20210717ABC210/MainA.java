import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0;
		for(int i = 1; i <= n; i++){
			if(i>a) ans += y;
			else ans += x;
		}
		System.out.println(ans);
	}
}
