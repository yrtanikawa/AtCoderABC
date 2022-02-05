import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int na = n*108/100;
		if(na == 206) System.out.println("so-so");
		else if(na < 206) System.out.println("Yay!");
		else System.out.println(":(");
	}
}
