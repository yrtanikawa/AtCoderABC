import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if((long)Math.pow(2, n) > (long)Math.pow(n, 2)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
