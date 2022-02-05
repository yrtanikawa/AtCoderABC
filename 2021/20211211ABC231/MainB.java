import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < n; i++){
			s[i] = sc.next();
			set.add(s[i]);
		}
		
		String[] s2 = new String[set.size()];
		int cnt = 0;
		for(String c : set){
			s2[cnt] = c;
			cnt++;
		}
		for(int i = 0; i < set.size(); i++) System.out.println(s2[i]);
		int[] h = new int[set.size()];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < set.size(); j++){
				if(s[i].equals(s2[j])){
					h[j]++;
				}
			}
		}
		
		int max = 0;
		int tag = -1;
		for(int i = 0; i < set.size(); i++){
			if(max < h[i]){
				max = h[i];
				tag = i;
			}
		}
		
		System.out.println(s2[tag]);
	}
}
