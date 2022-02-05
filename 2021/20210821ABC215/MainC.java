import java.util.*;
public class Main {
	public static TreeSet<String> set = new TreeSet<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int k = sc.nextInt();
		
		perm(s, "");
		
		int cnt = 0;
		for(String t : set){
			if(cnt==k-1){
				System.out.println(t);
				return;
			}
			cnt++;
		}
	}
	
	public static void perm(String q, String ans){
		if(q.length() <= 1){
			set.add(ans+q);
		}else{
			for(int i = 0; i < q.length(); i++){
				perm(q.substring(0, i) + q.substring(i+1), ans+q.charAt(i));
			}
		}
	}
}
