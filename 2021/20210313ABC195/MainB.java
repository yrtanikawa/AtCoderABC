import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int w2 = w*1000;
		
		int max = -1;
		int min = Integer.MAX_VALUE;
		for(int i = 1; i <= 1000000; i++){
			if(a*i <= w2 && w2 <= b*i){
				min = Math.min(min, i);
				max = Math.max(max, i);
			}
		}
		
		if(max == -1) System.out.println("UNSATISFIABLE");
		else System.out.println(min + " " + max);
	}
}
/*
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int w2 = w*1000;
		
		int min = Integer.MAX_VALUE;
		int max = 0;
		
		int w2_a = w2%a;
		if(w2_a < b && w2_a >= a){
			max = w2/a + 1;
		}
		int w2_b = w2%b;
		if(w2_b > a && w2_b <= b){
			min = w2/b + 1;
		}
		
		if(min!=Integer.MAX_VALUE){
			if(max==0) max = min;
		}
		if(max!=0){
			if(min==Integer.MAX_VALUE) min = max;
		}
		
		if(min!=Integer.MAX_VALUE && max!=0) System.out.println(min + " " + max);
		else System.out.println("UNSATISFIABLE");
	}
}
*/