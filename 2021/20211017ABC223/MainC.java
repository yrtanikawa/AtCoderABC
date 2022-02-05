import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];//’·‚³
		double[] b = new double[n];//•b‘¬
		double[] t = new double[n];//‚»‚Ì‹æŠÔ‚ğI‚¦‚é‚Ì‚É‚©‚©‚éŠÔ(cm/s)
		double sumA = 0.0;//‘‹——£
		double sumB = 0.0;
		double sumT = 0.0;//¶‚É’…‰Î‚µ‚Ä‰E‚É“’B‚·‚éŠÔ(s)
		for(int i = 0; i < n; i++){
			a[i] = sc.nextDouble();
			sumA += a[i];
			b[i] = sc.nextDouble();
			sumB += b[i];
			t[i] = a[i]/b[i];
			sumT += t[i];
		}
		//System.out.println(sumA);
		//System.out.println(sumB);
		//System.out.println(sumT);
		
		/*-----------*/
		
		sumT /= 2;//2‚Â‚Ì‰Î‚ª‚Ô‚Â‚©‚éŠÔ
		double ans = 0;
		for(int i = 0; i < n; i++){
			ans += Math.min(a[i], sumT*b[i]);
			sumT -= Math.min(a[i]/b[i], sumT);
		}
		System.out.println(ans);
	}
}
