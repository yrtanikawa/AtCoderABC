import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int t = sc.nextInt();
		int x = sc.nextInt();
		if(s<t){
			if(s<=x && x<t){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			if((s<=x&&x<t+24) || (0<=x&&x<t)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}
