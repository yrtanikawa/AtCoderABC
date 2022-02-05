import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char[] c = s.toCharArray();
		for(int i = 0; i < n; i++){
			if(i%2==0 && c[i]=='1'){
				System.out.println("Takahashi");
				return;
			}else if(i%2!=0 && c[i]=='1'){
				System.out.println("Aoki");
				return;
			}
		}
	}
}
