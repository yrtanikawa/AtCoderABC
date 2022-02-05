import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = n%10;
		n /= 10;
		int b = n%10;
		n /= 10;
		int a = n;
		int abc = (100*a) + (10*b) + c;
		int bca = (100*b) + (10*c) + a;
		int cab = (100*c) + (10*a) + b;
		System.out.println(abc + bca + cab);
	}
}
