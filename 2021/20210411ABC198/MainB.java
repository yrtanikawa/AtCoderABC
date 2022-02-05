import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toString(n);
		boolean can = false;
		
		for(int i = 0; i < 11; i++){
			can = kaibun(s);
			if(can){
				System.out.println("Yes");
				return;
			}
			s = "0" + s;
		}
		System.out.println("No");
	}
	
	public static boolean kaibun(String s){
	int minIdx = 0;
	int maxIdx = s.length() - 1;

	while(minIdx < maxIdx) {
		if(s.charAt(minIdx++) != s.charAt(maxIdx--)) {
			return false;
		}
	}
	return true;
	}
}
