import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		
		long a10 = Integer.parseInt(a, k);
		long b10 = Integer.parseInt(b, k);
		
		System.out.println(a10*b10);
	}
}
