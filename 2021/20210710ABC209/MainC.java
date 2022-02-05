import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] c = new int[n];
		for(int i = 0; i < n; i++){
			c[i] = sc.nextInt();
		}
		Arrays.sort(c);
		long ans = 1;
		long mod = 1000000007;
		for(int i = 0; i < n; i++){
			ans = ans*Math.max(0, c[i]-i)%mod;
		}
		System.out.println(ans);
	}
}

//‚¿‚ª‚¤
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//ABC203-cŽQl
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i = 0; i < n; i++){
			int c = sc.nextInt();
			if(map.containsKey(c)){
				map.replace(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		
		if(map.lastKey() < n){
			//System.out.println("Suspension");
			System.out.println(0);
			return;
		}
		
		long ans = 1;
		long mod = 1000000007;
		int before_a = 0, before_b = 0;
		int cnt = 0;
		for(int a : map.keySet()){
			int b = map.get(a);
			//System.out.println(a + " : " + b);
			
			/*-----*/
				//‚í‚©‚ç‚ñ
			/*-----*/
			
			before_a = a;
			before_b = b;
			cnt++;
		}
		System.out.println(ans);
	}
	
	public static int comb(int x, int y){
		int num = 1;
		for(int i = 1; i <= y; i++){
			num = num * (x-i+1)/i;
		}
		return num;
	}
}

