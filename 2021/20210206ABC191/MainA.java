import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		int d = sc.nextInt();
		
		if(v*t <= d && d <= v*s) System.out.println("No");
		else System.out.println("Yes");
	}
}
