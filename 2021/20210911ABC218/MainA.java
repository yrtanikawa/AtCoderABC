import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] c = sc.next().toCharArray();
		
		if(c[n-1]=='o') System.out.println("Yes");
		else System.out.println("No");
		
	}
}
