import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		
	}
	
	//ŠeˆÊ‚Ì”‚ÌÏ
	public static int mulDigit(int n){
		int mul = 1;
		while(n != 0){
			if(n%10==0){
			}else{
				mul *= n%10;
			}
			n /= 10;
		}
		return mul;
	}
}
