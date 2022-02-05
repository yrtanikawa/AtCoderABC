import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int[] en = new int[11];
		en[0] = 0;
		for(int i = 1; i < 11; i++){
			if(i==1){
				en[i] = 1;
			}else{
				en[i] = en[i-1]*i;
			}
			//System.out.println("en" + i + " = " + en[i]);
		}
		
		int ans = 0;
		for(int i = 10; i >= 1; i--){
			ans += p / en[i];
			p %= en[i];
		}
		System.out.println(ans);
	}
}
