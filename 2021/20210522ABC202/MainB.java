import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		String ans = "";
		for(int i = 0; i < n; i++){
			char c = s.charAt(i);
			if(c=='0') ans = "0" + ans;
			if(c=='1') ans = "1" + ans;
			if(c=='6') ans = "9" + ans;
			if(c=='8') ans = "8" + ans;
			if(c=='9') ans = "6" + ans;
		}
		System.out.println(ans);
	}
}
