import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String alf = "abcdefghijklmnopqrstuvwxyz";
		int n = sc.nextInt();
		String[] s = new String[n];
		String[] t = new String[n];
		for(int i = 0; i < n; i++){
			String tmp = sc.next();
			s[i] = changeAlf(alf, x, tmp);
		}
		Arrays.sort(s);
		
		for(int i = 0; i < n; i++){
			System.out.println(changeAlf(x, alf, s[i]));
		}
	}
	
	public static String changeAlf(String x, String alf, String s){
		String ans = "";
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			for(int j = 0; j < 26; j++){
				if(alf.charAt(j)==c){
					ans += x.charAt(j);
					break;
				}
			}
		}
		return ans;
	}
}
