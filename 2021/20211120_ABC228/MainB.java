import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n+1];
		for(int i = 1; i <= n; i++){
			a[i] = sc.nextInt();
		}
		
		boolean[] sec = new boolean[n+1];
		Arrays.fill(sec, false);
		int i = x;
		sec[i] = true;
		int cnt = 1;
		while(true){
			if(!sec[a[i]]){
				sec[a[i]] = true;
				i = a[i];
				cnt++;
			}else{
				break;
			}
		}
		System.out.println(cnt);
	}
}
