import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		
		if(c[0] == c[1] && c[1] == c[2]) System.out.println("Won");
		else System.out.println("Lost");
	}
}
