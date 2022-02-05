import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int x = sc.nextInt()-1;
		int y = sc.nextInt()-1;
		String[] s = new String[h];
		char[][] c = new char[h][w];
		for(int i = 0; i < h; i++){
			s[i] = sc.next();
			c[i] = s[i].toCharArray();
		}
		
		int ans = 1;
		
		//c‚É’Tõ
		for(int j = x-1; j >= 0; j--){
			if(c[j][y]=='.'){
				ans++;
			}else{
				break;
			}
		}
		for(int j = x+1; j < h; j++){
			if(c[j][y]=='.'){
				ans++;
			}else{
				break;
			}
		}
		
		//‰¡‚É’Tõ
		for(int i = y-1; i >= 0; i--){
			if(c[x][i]=='.'){
				ans++;
			}else{
				break;
			}
		}
		for(int i = y+1; i < w; i++){
			if(c[x][i]=='.'){
				ans++;
			}else{
				break;
			}
		}
		System.out.println(ans);
	}
}
