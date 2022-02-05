import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] a = new int[n];
		HashMap<Integer, Integer> map1 = new HashMap<>();
		HashMap<List<Integer>, Integer> map2 = new HashMap<>();
		//map2: ”šEŒÂ”Ei
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			int cnt = 1;
			if(map1.containsKey(a[i])){
				cnt += map1.get(a[i]);
			}
			map1.put(a[i], cnt);
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(a[i]);
			list.add(cnt);
			map2.put(list, i+1);
		}
		
		for(int i = 0; i< q; i++){
			int x = sc.nextInt();
			int k = sc.nextInt();
			ArrayList<Integer> list2 = new ArrayList<>();
			list2.add(x);
			list2.add(k);
			if(map2.get(list2)!=null){
				System.out.println(map2.get(list2));
			}else{
				System.out.println(-1);
			}
		}
	}
}
