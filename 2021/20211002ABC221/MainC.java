import java.util.*;
public class Main {
	public static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int x = n.length();
		perm(n, "", x);
		System.out.println(Collections.max(list));
	}
	
	public static void listAdd(String mas, int x){
		for(int i = 0; i < x-1; i++){
			String s = mas.substring(0, i+1);
			String t = mas.substring(i+1);
			if(s.charAt(0)=='0' || t.charAt(0)=='0'){
				continue;
			}
			int snum = Integer.parseInt(s);
			int tnum = Integer.parseInt(t);
			list.add(snum*tnum);
		}
	}

	public static void perm(String q, String ans, int x){
		if(q.length() <= 1){
			listAdd(ans+q, x);
		}else{
			for(int i = 0; i < q.length(); i++){
				perm(q.substring(0, i) + q.substring(i+1), ans+q.charAt(i), x);
			}
		}
	}
}
