import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int X1=(X / 1000) % 10;
		int X2=(X / 100) % 10;
		int X3=(X/ 10) % 10;
		int X4=(X / 1) % 10;
		
		if(X1 == X2 && X2==X3 && X3==X4){
			System.out.println("Weak");
		}else if((X1+1)%10==X2 && (X2+1)%10==X3 && (X3+1)%10==X4  ) {
			System.out.println("Weak");
		}else {
			System.out.println("Strong");
		}
	}
}







//ˆá‚¤

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();

		boolean mind = true;
;
		
		if(x.charAt(0)==x.charAt(1)){
			if(x.charAt(1)==x.charAt(2)){
				if(x.charAt(2)==x.charAt(3)){
					mind = true;
				}
			}
		}	
		

		String s = "78901234567890123";
		for(int i = 0; i < s.length()-4; i++){
			if(x.equals(s.substring(i, i+4))){
				mind  = true;
			}
		}
				
		if(mind) System.out.println("weak");
		else System.out.println("Strong");
	}
}
