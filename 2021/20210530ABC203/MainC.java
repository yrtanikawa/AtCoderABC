import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		Map<Long, Long> map = new TreeMap<Long, Long>();
		
		for(int i = 0; i < n; i++){
			long a = sc.nextLong();
			long b = sc.nextLong();
			if(map.containsKey(a)){
				map.replace(a, b+map.get(a));
			}else{
				map.put(a, b);
			}
		}
		
		for(long a : map.keySet()){
			if(a <= k) k += map.get(a);
		}
		
		System.out.println(k);
	}
}
