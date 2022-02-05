import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		for(int i = 0; i < 80; i++){
			if((long)Math.pow(2, i) > n){
				System.out.println(i-1);
				return;
			}
		}
	}
}
