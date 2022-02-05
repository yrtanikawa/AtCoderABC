import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String ans = "";
		
		while(n > 0){
			if(n%2==1){
				n--;
				ans = "A" + ans;
			}else{
				n /= 2;
				ans = "B" + ans;
			}
		}
		
		System.out.println(ans);
	}
}
