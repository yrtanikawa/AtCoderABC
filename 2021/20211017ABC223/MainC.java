import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];//����
		double[] b = new double[n];//�b��
		double[] t = new double[n];//���̋�Ԃ��I����̂ɂ����鎞��(cm/s)
		double sumA = 0.0;//������
		double sumB = 0.0;
		double sumT = 0.0;//���ɒ��΂��ĉE�ɓ��B���鎞��(s)
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
		
		sumT /= 2;//2�̉΂��Ԃ��鎞��
		double ans = 0;
		for(int i = 0; i < n; i++){
			ans += Math.min(a[i], sumT*b[i]);
			sumT -= Math.min(a[i]/b[i], sumT);
		}
		System.out.println(ans);
	}
}
