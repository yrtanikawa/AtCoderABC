import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long AC = 0;
		long BC = 0;
		
		if(a >= 0 && b>= 0){
			AC = a;
			BC = b;
		}else if(a<0 && b >= 0){
			if(c%2==0){
				AC = a*(-1);
				BC = b;
			}else{
				AC = a;
				BC = b;
			}
		}else if(a >= 0 && b < 0){
			if(c%2==0){
				AC = a;
				BC = b*(-1);
			}else{
				AC = a;
				BC = b;
			}
		}else{
			if(c%2==0){
				AC = a;
				BC = b;
			}else{
				AC = a*(-1);
				BC = b*(-1);
			}
		}
		//System.out.println(AC +" " + BC);
		if(AC < BC) System.out.println("<");
		else if(AC > BC)  System.out.println(">");
		else  System.out.println("=");
	}
}

