import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(c==0){
			if(a>b) System.out.println("Takahashi");
			else System.out.println("Aoki");
		}else{
			if(a<b) System.out.println("Aoki");
			else System.out.println("Takahashi");
		}
	}
}
