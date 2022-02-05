import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		String t = "oxxoxxoxxoxxoxxoxxoxxoxxoxxoxxoxxoxxoxx";
		if(t.contains(s)) System.out.println("Yes");
		else System.out.println("No");
	}
}
