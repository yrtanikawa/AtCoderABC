import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashSet<Character> set = new HashSet<>();
		for(int i = 0; i < 3; i++){
			set.add(s.charAt(i));
		}
		int ans = 0;
		if(set.size()==1) ans = 1;
		if(set.size()==2) ans = 3;
		if(set.size()==3) ans = 6;
		System.out.println(ans);
	}
}
