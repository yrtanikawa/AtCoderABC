import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int a = sc.nextInt()-1;
		int b = sc.nextInt()-1;
		char tmp1 = c[a];
		char tmp2 = c[b];
		c[a] = tmp2;
		c[b] = tmp1;
		System.out.println(new String(c));
	}
}
