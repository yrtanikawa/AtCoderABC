import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long t = sc.nextLong();
		long ans = 0;
		for(long a = 0; a <= s; a++){
			for(long b = 0; b <= s-a; b++){
				for(long c = 0; c <= s-a-b; c++){
					if(a+b+c<=s && a*b*c<=t){
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
