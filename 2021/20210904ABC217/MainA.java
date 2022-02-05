import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		List<String> list = new ArrayList<>();
		list.add(s);
		list.add(t);
		Collections.sort(list);
		if(list.get(0).equals(s)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
