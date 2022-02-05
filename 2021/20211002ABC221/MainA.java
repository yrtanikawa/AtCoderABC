import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int dis = Math.abs(a-b);
		long ans = 1;
		for(int i = 0; i < dis; i++) ans *= 32;
		System.out.println(ans);
	}
}
