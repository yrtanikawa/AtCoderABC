import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] s = new int[n];
		int[] s2 = new int[n];
		Arrays.fill(s, 0);
		for(int i = 0; i < n; i++){
			s[i] = sc.nextInt()+sc.nextInt()+sc.nextInt();
			s2[i] = s[i];
		}
		Arrays.sort(s2);
		for(int i = 0; i < n; i++){
			if(s2[n-k] <= s[i]+300){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}

/*
ex1.
3 1
178 205 132 = 515
112 220 96	= 428
36 64 20	= 120
*/