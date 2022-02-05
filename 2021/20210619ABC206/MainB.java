import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		for(int i = 1; i < n*2; i++){
			m += i;
			if(m >= n){
				System.out.println(i);
				return;
			}
		}
	}
}
