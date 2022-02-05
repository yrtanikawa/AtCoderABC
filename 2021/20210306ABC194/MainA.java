import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int nyuko = a+b;
		
		if(nyuko >=15 && b >= 8) System.out.println(1);
		else if(nyuko >= 10 && b >= 3) System.out.println(2);
		else if(nyuko >= 3) System.out.println(3);
		else System.out.println(4);
	}
}
