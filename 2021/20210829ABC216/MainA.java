import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		String s = String.valueOf(d);
		
		int x = (int)d;
		String y0 = s.substring(s.length()-1);
		int y = Integer.valueOf(y0);
		//System.out.println(x + " " + y); 
		
		if(y<=2) System.out.println(x+"-");
		else if(y<=6) System.out.println(x);
		else System.out.println(x+"+");
	}
}
