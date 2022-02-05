import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < k; i++){
			map.put(a[i], map.getOrDefault(a[i],0)+1);
		}
		
		int max = map.size();
		for(int i = k; i < n; i++){
			map.put(a[i-k], map.get(a[i-k])-1);
			if(map.get(a[i-k]) == 0){
				map.remove(a[i-k]);
			}
			
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
			max = Math.max(max, map.size());
		}
		
		System.out.println(max);
	}
}

//‚¿‚ª‚¤
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] c = new int[n];
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] kosu = new int[n];
		Arrays.fill(kosu, 0);
		
		for(int i = 0; i < n; i++){
			c[i] = sc.nextInt();
			set.add(c[i]);
			list.add(c[i]);
			
			if(i >= k){
				if(list.get(0)==c[i-k]){
					set.remove(c[i-k]);
					list.remove(0);
				}
			}
			kosu[i] = set.size();
		}
		Arrays.sort(kosu);
		System.out.println(kosu[n-1]);
	}
}
