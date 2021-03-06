import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];//長さ
		double[] b = new double[n];//秒速
		double[] t = new double[n];//その区間を終えるのにかかる時間(cm/s)
		double sumA = 0.0;//総距離
		double sumB = 0.0;
		double sumT = 0.0;//左に着火して右に到達する時間(s)
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
		
		sumT /= 2;//2つの火がぶつかる時間
		double ans = 0;
		for(int i = 0; i < n; i++){
			ans += Math.min(a[i], sumT*b[i]);
			sumT -= Math.min(a[i]/b[i], sumT);
		}
		System.out.println(ans);
	}
}
