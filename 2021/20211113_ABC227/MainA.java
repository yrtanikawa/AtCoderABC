import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = sc.nextInt()-1;
		while(k>0){
			a++;
			k--;
			if(a>n) a=1;
		}
		System.out.println(a);
	}
}
