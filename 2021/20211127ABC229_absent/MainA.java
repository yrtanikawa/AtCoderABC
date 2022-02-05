import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String ans = "Yes";
		if(s1.equals(".#") && s2.equals("#.")) ans = "No";
		if(s1.equals("#.") && s2.equals(".#")) ans = "No";
		System.out.println(ans);
	}
}
