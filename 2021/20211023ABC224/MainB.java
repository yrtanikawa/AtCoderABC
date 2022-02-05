import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] a = new int[h+1][w+1];
		for (int[] tmp : a) {
			Arrays.fill(tmp, 0);
		}
		for(int i = 1; i <= h; i++){
			for(int j = 1; j <= w; j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i1 = 1; i1 <= h; i1++){
			for(int i2 = i1+1; i2 <= h; i2++){
				for(int j1 = 1; j1 <= w; j1++){
					for(int j2 = j1+1; j2 <= w; j2++){
						if(a[i1][j1]+a[i2][j2] > a[i2][j1]+a[i1][j2]){
							System.out.println("No");
							return;
						}
					}
				}
			}
		}
		System.out.println("Yes");
	}
}
