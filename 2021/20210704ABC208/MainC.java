import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		TreeMap<Integer, Long> map = new TreeMap<>();
		int[] a = new int[n];
		int[] b = new int[n];
		long kubaru = (k-(k%n))/n;
		long kd = k%n;
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			b[i] = a[i];
			map.put(a[i], kubaru);
		}
		Arrays.sort(b);
		for(int i = 0; i < kd; i++){
			map.replace(b[i], map.get(b[i]) + 1);
		}
		
		for(int i = 0; i < n; i++){
			System.out.println(map.get(a[i]));
		}
	}
}
