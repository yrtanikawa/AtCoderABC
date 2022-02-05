import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		long ans = f(f(f(t)+t)+f(f(t)));
		System.out.println(ans);
	}
	public static long f(long t){
		return t*t + 2*t + 3;
	}
}
