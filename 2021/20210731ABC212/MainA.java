import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s ="";
		if(0<a && b==0) s = "Gold";
		else if(a==0 && 0<b) s = "Silver";
		else s = "Alloy";
		
		System.out.println(s);
	}
}
