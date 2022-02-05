import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i==j){
					ans = Math.min(ans, a[i]+b[j]);
				}else{
					ans = Math.min(ans, Math.max(a[i], b[j]));
				}
			}
		}
		
		System.out.println(ans);
	}
}

//‚Ü‚¿‚ª‚¢
/*import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		int minsum = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			//ˆêl‚Åì‹Æ‚µ‚½ê‡‚ÌÅ¬’l
			minsum = Math.min(minsum, a[i]+b[i]);
		}
		
		int mina = Integer.MAX_VALUE-1, minasec = Integer.MAX_VALUE;
		int minb = Integer.MAX_VALUE-1, minbsec = Integer.MAX_VALUE;
		int ai = 0, bi = 0;
		for(int i = 0; i < n; i++){
			if(mina > a[i]){
				minasec = mina;
				mina = a[i];
				ai = i;
			}
			if(minb > b[i]){
				minbsec = minb;
				minb = b[i];
				bi = i;
			}
		}
		if(ai!=bi){
			System.out.println(Math.max(mina, minb));
		}else{
			//System.out.println(minsum + " " + (mina+minbsec)+ " "+ (minasec+minb));
			System.out.println(Math.min(minsum, Math.min(mina+minbsec, minasec+minb)));
		}
	}
}
*/