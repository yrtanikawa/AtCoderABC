import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int k = sc.nextInt();
		for(int i = 0; i < k; i++){
			if(n%200==0){
				n /= 200;
			}else{
				n *= 1000;
				n += 200;
			}
		}
		System.out.println(n);
	}
}
