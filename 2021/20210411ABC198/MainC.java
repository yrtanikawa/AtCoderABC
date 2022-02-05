import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long r = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		long dis2 = x*x + y*y;
		double d = Math.sqrt(dis2);
		if(d==r) System.out.println(1);
		else if(d <= 2*r) System.out.println(2);
		else{
			System.out.println((int)Math.ceil(d/r));
		}
	}
}


import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long r = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		long dis2 = x*x + y*y;
		
		long c = 0;
		while(dis2 > 4*r*r){
			c++;
			dis2 -= 4*r*r;
		}
		
		if(dis2==r*r){
			System.out.println(c+1);
		}else{
			System.out.println(c+2);
		}
	}
}
