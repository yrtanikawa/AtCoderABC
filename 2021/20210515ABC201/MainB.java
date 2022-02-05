import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int[] t = new int[n];
		HashMap<Integer, String> map = new HashMap<>();
		for(int i = 0; i < n; i++){
			s[i] = sc.next();
			t[i] = sc.nextInt();
			map.put(t[i], s[i]);
		}
		Arrays.sort(t);
		
		System.out.println(map.get(t[n-2]));
	}
}
