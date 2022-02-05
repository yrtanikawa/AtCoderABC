//‚¿‚ª‚¤
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] l = new double[n];
		double[] r = new double[n];
		for(int i = 0; i < n; i++){
			int t = sc.nextInt();
			l[i] = sc.nextDouble();
			r[i] = sc.nextDouble();
			if(t==2){
				r[i] -= 0.5;
			}
			if(t==3){
				l[i] += 0.5;
			}
			if(t==4){
				l[i] += 0.5;
				r[i] -= 0.5;
			}
		}
		
		int ans = 0;
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				double a = l[i];
				double b = r[i];
				double c = l[j];
				double d = r[j];
				if(Math.max(a, c) <= Math.min(b,d)) ans++;
			}
		}
		System.out.println(ans);
	}
}
