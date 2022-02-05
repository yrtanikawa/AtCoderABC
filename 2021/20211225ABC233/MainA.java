import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x>=y){
			System.out.println(0);
		}else{
			int n = y-x;
			System.out.println((int)Math.ceil((double)n/10));
		}
	}
}
