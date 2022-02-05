import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt()*100;
		int now = 0;
		for(int i = 0; i < n; i++){
			int v = sc.nextInt();
			int p = sc.nextInt();
			now += v*p;
			if(now > x){
				System.out.println(i+1);
				return;
			}
		}
		
		System.out.println(-1);
	}
}

/*
WA è≠êîåÎç∑ÅHÅH
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double x = sc.nextDouble();
		double now = 0.0;
		for(int i = 0; i < n; i++){
			double v = sc.nextDouble();
			double p = sc.nextDouble();
			now += v*p/100;
			if(now > x){
				System.out.println(i+1);
				return;
			}
		}
		
		System.out.println(-1);
	}
}
*/