import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length()==1) System.out.println("000"+s);
		if(s.length()==2) System.out.println("00"+s);
		if(s.length()==3) System.out.println("0"+s);
		if(s.length()==4) System.out.println(s);
	}
}
