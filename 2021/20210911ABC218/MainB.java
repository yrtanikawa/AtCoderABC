import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 26;
		String s = "abcdefghijklmnopqrstuvwxyz";
		char[] c = s.toCharArray();
		
		String ans = "";
		for(int i = 0; i < n; i++){
			int p = sc.nextInt();
			char tmp = c[p-1];
			ans += tmp;
		}
		System.out.println(ans);
	}
}
