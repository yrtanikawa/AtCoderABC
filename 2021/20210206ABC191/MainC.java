import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] c = new char[h][w];
		for(int i = 0; i < h; i++){
			c[i] = sc.next().toCharArray();
		}
		int ans = 0;
		int tmp;
		for(int i = 1; i < h; i++){
			for(int j = 1; j < w; j++){
				tmp = 0;
				if(c[i-1][j-1]=='#') tmp++;
				if(c[i][j-1]=='#') tmp++;
				if(c[i-1][j]=='#') tmp++;
				if(c[i][j]=='#') tmp++;
				
				if(tmp==1 || tmp==3) ans++;
			}
		}
		
		System.out.println(ans);
	}
}
