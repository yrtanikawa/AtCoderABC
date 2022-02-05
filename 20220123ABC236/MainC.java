import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0; i < n; i++){
			s[i] = sc.next();
		}
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < m; i++){
			String t = sc.next();
			set.add(t);
		}
		
		for(int i = 0; i < n; i++){
			if(set.contains(s[i])) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
