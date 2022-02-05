import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] card = new int[n+1];
		for(int i = 0; i < 4*n - 1; i++){
			int a = sc.nextInt();
			card[a]++;
		}
		for(int i = 1; i <= n; i++){
			if(card[i]==3) System.out.println(i);
		}
	}
}
