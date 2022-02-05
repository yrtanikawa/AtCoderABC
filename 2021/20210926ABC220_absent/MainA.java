import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = c;
		while(n <= b){
			if(a <= n && n <= b){
				System.out.println(n);
				return;
			}
			n += c;
		}
		System.out.println(-1);
	}
}
