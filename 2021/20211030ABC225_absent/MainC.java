import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] b = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				b[i][j] = sc.nextInt();
			}
		}
		
		int[][] x = new int[n][m];
		int[][] y = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				x[i][j] = (b[i][j]+6)/7;//s”
				y[i][j] = (b[i][j]-1)%7+1;//—ñ”
			}
		}
		String ans = "Yes";
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				if(0 < i && x[i][j] != x[i-1][j]+1) ans = "No";
				if(0 < j && y[i][j] != y[i][j-1]+1) ans = "No";
				if(0 < j && x[i][j] != x[i][j-1]) ans = "No";
				if(0 < i && y[i][j] != y[i-1][j]) ans = "No";
			}
		}
		
		System.out.println(ans);
	}
}
