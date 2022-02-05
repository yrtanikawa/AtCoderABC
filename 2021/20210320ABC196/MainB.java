import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		int n = x.length();
		for(int i = 0; i < n; i++){
			if(x.charAt(i)=='.'){
				x = x.substring(0, i);
				break;
			}
		}
		System.out.println(x);
	}
}
