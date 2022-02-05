import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++){
			int a = sc.nextInt();
			if(i%2==0) sum += a-1;
			else sum += a;
		}
		
		if(x>=sum) System.out.println("Yes");
		else System.out.println("No");
	}
}
