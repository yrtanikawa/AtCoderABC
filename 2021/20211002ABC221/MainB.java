import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int n = s.length();
		
		if(s.equals(t)){
			System.out.println("Yes");
			return;
		}
		
		for(int i = 0; i < n-1; i++){
			String tmp = s.substring(0,i) 
				+ s.substring(i+1,i+2) 
				+ s.substring(i,i+1) 
				+ s.substring(i+2);
			//System.out.println(tmp);
			if(tmp.equals(t)){
			System.out.println("Yes");
			return;
		}
		}
		System.out.println("No");
	}
}


//WA
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] cs = s.toCharArray();
		String t = sc.next();
		char[] ct = t.toCharArray();
		int n = s.length();
		
		if(s.equals(t)){
			System.out.println("Yes");
			return;
		}
		
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++){
			if(cs[i]!=ct[i]) set.add(i);
		}
		
		if(set.size()!=2){
			System.out.println("No");
			return;
		}
		
		Iterator<Integer> it = set.iterator();
		int x = it.next();
		int y = it.next();
		if(Math.abs(x-y)==1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
