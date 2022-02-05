import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x%100==0) System.out.println(100);
		else System.out.println(100-(x%100));
	}
}
