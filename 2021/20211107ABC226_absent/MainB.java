import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < n; i++){
			int l = sc.nextInt();
			String s = sc.nextLine();
			set.add(s);
		}
		System.out.println(set.size());
	}
}
