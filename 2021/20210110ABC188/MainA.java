import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x < y){
			if(x+3 > y) System.out.println("Yes");
			else System.out.println("No");
		}else{
			if(x < y+3) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
