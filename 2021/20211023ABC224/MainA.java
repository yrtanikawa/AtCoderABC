import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		if(s.charAt(n-1)=='t'){
			System.out.println("ist");
			return;
		}else{
			System.out.println("er");
		}
	}
}
