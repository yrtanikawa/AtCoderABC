import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();				//11
		String s2 = Long.toBinaryString(k);	//1011
		//System.out.println(s2);
		String ans = s2.replaceAll("1", "2");
		System.out.println(ans);
	}
}
