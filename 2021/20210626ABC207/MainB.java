import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		long blue = a;
		long red = 0;
		
		long ans = 0;
		
		while(true){
			//System.out.println("blue "+ blue + " red " + red);
			if(blue <= red*(long)d){
				System.out.println(ans);
				return;
			}
			if(ans > 100000000){
				System.out.println(-1);
				return;
			}
			
			blue += (long)b;
			red += (long)c;
			ans++;
		}
	}
}
