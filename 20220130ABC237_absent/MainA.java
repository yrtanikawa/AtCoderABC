import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = (long)1024*1024*1024*2;
		long b = -a;
		if(b <= n && n < a) System.out.println("Yes");
		else System.out.println("No");
	}
}
