import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 3;
		String[] s = new String[n];
		for(int i = 0; i < n; i++){
			s[i] = sc.next();
		}
		
		String t = sc.next();
		String ans = "";
		for(int i = 0; i < t.length(); i++){
			ans += s[(t.charAt(i)-'0')-1];
		}
		System.out.println(ans);
	}
}
