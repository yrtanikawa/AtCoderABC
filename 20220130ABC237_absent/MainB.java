import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] a = new int[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				a[i][j] = sc.nextInt();
			}
		}
		int[][] b = new int[w][h];
		for(int i = 0; i < w; i++){
			for(int j = 0; j < h; j++){
				b[i][j] = a[j][i];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < w; i++){
			for(int j = 0; j < h; j++){
				sb.append(b[i][j]);
				if(j!=h-1) sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
