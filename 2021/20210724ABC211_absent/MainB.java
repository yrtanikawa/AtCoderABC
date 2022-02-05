import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 4;
		HashSet<String> set = new HashSet<>();
		set.add("H");
		set.add("2B");
		set.add("3B");
		set.add("HR");
		for(int i = 0; i < n; i++){
			String s = sc.next();
			if(set.contains(s)){
				set.remove(s);
			}
		}
		
		if(set.isEmpty()) System.out.println("Yes");
		else System.out.println("No");
		
	}
}
