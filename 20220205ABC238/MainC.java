

//n<10^8’ö“x‚È‚ç‰ð‚¯‚é
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long mod = 998244353;
		long n = sc.nextLong();
		long sum = 0;
		for(long i = 1; i <= n; i++){
			sum += f(i);
			sum %= mod;
		}
		System.out.println(sum);
	}
	public static long f(long n){
		long digit = String.valueOf(n).length();
		if(digit == 1){
			return n;
		}
		long tmp = (long)Math.pow(10, digit-1);
		return n-tmp+1;
	}
}
