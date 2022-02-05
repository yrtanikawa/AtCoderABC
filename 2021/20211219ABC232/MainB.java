import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int k = (s.charAt(0) - t.charAt(0) + 26) % 26;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i)-'a' != (t.charAt(i)-'a'+k)%26){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
