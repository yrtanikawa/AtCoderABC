import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a<=b && b<=6*a) System.out.println("Yes");
		else System.out.println("No");
	}
}
