import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		for(int i = 0; i < n; i++){
			s[i] = sc.nextInt();
		}
		boolean[] exist = new boolean[n];
		Arrays.fill(exist, false);
		
		for(int a = 1; a <= 1000; a++){
			for(int b = 1; b <= 1000; b++){
				int room = (4*a*b) + (3*a) + (3*b);
				for(int i = 0; i < n; i++){
					if(room==s[i]) exist[i] = true;
				}
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < n; i++){
			if(!exist[i]) cnt++;
		}
		System.out.println(cnt);
	}
}
