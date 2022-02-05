import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		HashMap<Integer,HashSet<Integer>> mp = new HashMap<>();
		for (int i = 0; i < n; i++) {
			HashSet<Integer> s0 = new HashSet<>();
			s0.add(i);
			mp.put(i,s0);
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;

			HashSet<Integer> s1 = mp.get(a);
			s1.add(b);
			mp.put(a,s1);
		}

		int ans = 0;
		for (int i = 0; i < n; i++ ) {
			int[] seen = new int[n];
			dfs(mp, seen, i);

			for (int j = 0; j < n; j++) {
				ans += seen[j];
			}
		}

		System.out.println(ans);
	}

	public static void dfs(HashMap<Integer,HashSet<Integer>> mp, int[] seen, int v) {
		seen[v] = 1;

		HashSet<Integer> s = mp.get(v);
		for (int e : s) {
			if (seen[e]==1) continue;
			dfs(mp, seen, e);
		}
	}
}


//ちがうーーーーーーーーー
import java.util.*;
public class Main {
	static boolean[][] graph;
	static boolean[] seen;
	static Map<Integer, Integer> map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		seen = new boolean[n];
		map = new TreeMap<Integer, Integer>();
		for(int i = 0; i < m; i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			map.put(a, b);
		}
		
		int ans = 0;
		for(int i = 0; i < n; i++){
			Arrays.fill(seen, false);
			dfs(map, i);
			for(int j = 0; j < n; j++){
				if(seen[j]){
					ans++;
					//System.out.println((i+1) + " " + (j+1)); 
				}
			}
		}
		System.out.println(ans);
	}
	
	public static void dfs(Map m, int v){
		seen[v] = true;
		for(int r : map.size()){
			if(seen[r]) continue;
			dfs(map, r);
		}
	}
}

//ーーーーーーーーーーーーーーーーー

import java.util.*;
public class Main {
	static boolean[][] graph;
	static boolean[] seen;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		graph = new boolean[m][m];
		seen = new boolean[n];
		for(int i = 0; i < m; i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			graph[a][b] = true;
		}
		
		int ans = 0;
		for(int i = 0; i < n; i++){
			Arrays.fill(seen, false);
			dfs(graph, i);
			for(int j = 0; j < n; j++){
				if(seen[j]){
					ans++;
					//System.out.println((i+1) + " " + (j+1)); 
				}
			}
		}
		System.out.println(ans);
	}
	
	public static void dfs(boolean[][] g, int v){
		seen[v] = true;
		for(int i = 0; i < g.length; i++){
			if(seen[i]) continue;
			else{
				if(g[v][i]) dfs(g, i);
			}
		}
	}
}
