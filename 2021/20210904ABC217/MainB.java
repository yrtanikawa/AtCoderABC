import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int abc = 0, agc = 0, ahc = 0, arc = 0;
		for(int i = 0; i < n; i++){
			String s = sc.next();
			if(s.equals("ABC")) abc++;
			else if(s.equals("ARC")) arc++;
			else if(s.equals("AGC")) agc++;
			else if(s.equals("AHC")) ahc++;
		}
		
		String ans = "";
		if(abc==0) ans = "ABC";
		if(arc==0) ans = "ARC";
		if(agc==0) ans = "AGC";
		if(ahc==0) ans = "AHC";
		
		System.out.println(ans);
	}
}
