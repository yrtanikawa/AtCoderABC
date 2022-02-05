import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] x = new long[n];
		long[] y = new long[n];
		for(int i = 0; i < n; i++){
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
		}
		long ans = 0;
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				for(int k = j+1; k < n; k++){
					if(area2cul(x[i],y[i],x[j],y[j],x[k],y[k]) != 0){
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
	
	public static long area2cul(long x1, long y1, long x2, long y2, long x3, long y3){
		long tmp1 = (x2-x1)*(y3-y1);
		long tmp2 = (x3-x1)*(y2-y1);
		return Math.abs(tmp1-tmp2);
	}
	
	//https://qiita.com/tydesign/items/d41ac74b5effd87141b8
	public static boolean onLine2(long x1, long y1, long x2, long y2, long x3, long y3){
		long dx1 = Math.abs(x1-x2);
		long dy1 = Math.abs(y1-y2);
		long dx2 = Math.abs(x1-x3);
		long dy2 = Math.abs(y1-y3);
		if(dx2*dy1 == dx1*dy2){
			return true;
		}else{
			return false;
		}
	}
	
	//3点が同一線上にある→true
	public static boolean onLine(long x1, long y1, long x2, long y2, long x3, long y3){
		long[] dis2 = new long[3];//2点間距離の2乗
		dis2[0] = dis2Cal(x1,y1,x2,y2);
		dis2[1] = dis2Cal(x2,y2,x3,y3);
		dis2[2] = dis2Cal(x3,y3,x1,y1);
		Arrays.sort(dis2);
		
		//ここの記述??
		if(dis2[2]==dis2[0]+dis2[1]){
			return true;
		}else{
			return false;
		}
		//---------------
	}
	
	//2点間距離の2乗を返す
	public static long dis2Cal(long x1, long y1, long x2, long y2){
		long dis2 = ((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2));
		return dis2;
	}
}
