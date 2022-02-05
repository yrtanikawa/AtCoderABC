import java.util.*;
import java.lang.Math;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x[] = new long[n];
		long y[] = new long[n];
		for( int i = 0; i < n; i++ ){
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
		}
		int ans = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(y[i] != y[j] || x[i] >= x[j]){
					continue;
				}
				for(int k = 0; k < n; k++ ){
					if(x[i] != x[k] || y[i] >= y[k]){
						continue;
					}
					for(int l = 0; l < n; l++){
						if(x[l] == x[j] && y[l] == y[k]){
							ans++;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}



//WA
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i < n; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		int[] l = new int[n];
		int[] cm = new int[n];
		int index = 0;
		//x軸に平行かどうか
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(y[i]==y[j]){
					//i,jはx軸に平行
					//x[i]y[i]からx[j]y[j]の線分の長さとxを記録
					if(x[i]<x[j]){
						l[index] = x[i];
						cm[index] = x[j]-x[i];
						index++;
					}else{
						cm[index] = x[i]-x[j];
						l[index] = x[j];
						index++;
					}
				}
			}
		}
		
		int ans = 0;
		for(int i = 0; i < index; i++){
			for(int j = i+1; j < index; j++){
				//左のx座標が同じ、長さも同じ線分ならans++
				if(l[i]==l[j]){
					if(cm[i]==cm[j]){
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
