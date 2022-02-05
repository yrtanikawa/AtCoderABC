import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 8;
		if(n<=125) ans = 4;
		else if(n<=211) ans = 6;
		else ans = 8;
		System.out.println(ans);
	}
}
