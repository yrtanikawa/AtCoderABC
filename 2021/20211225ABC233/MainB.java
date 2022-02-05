import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		String s = sc.next();	//ab cdefg h
		int n = s.length();
		String s1 = s.substring(0, l-1);
		String s2 = s.substring(l-1, r);
		String s3 = s.substring(r-1);
		StringBuilder sb = new StringBuilder(s2);
		s2 = sb.reverse().toString();
		System.out.println(s1+s2+s3);
	}
}
