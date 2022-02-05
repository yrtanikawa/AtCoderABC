import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=42) n++;
		String ans = "AGC";
		if(n<100) ans += "0";
		if(n<10) ans += "0";
		ans += n;
		System.out.println(ans);
	}
}
