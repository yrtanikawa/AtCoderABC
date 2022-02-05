import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		String s = sc.next();
		int ans = 0;
		for(int i = 0; i <= 9999; i++){
			boolean[] flag = new boolean[10];
			int x = i;
			for(int j = 0; j < 4; j++){
				flag[x%10] = true;
				x /= 10;
			}
			
			boolean flag2 = true;
			for(int j = 0; j < 10; j++){
				if(s.charAt(j)=='o' && !flag[j]) flag2 = false;
				if(s.charAt(j)=='x' && flag[j]) flag2 = false;
			}
			
			if(flag2) ans++;
		}
		
		System.out.println(ans);
	}
}

/*----------------------*/

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		String s = sc.next();
		
		int o = 0;
		int x = 0;
		int hum = 0;
		for(int i = 0; i < n; i++){
			char c = s.charAt(i);
			if(c=='o') o++;
			else if(c=='x') x++;
			else hum++;
		}
		
		if(o>4){//ok
			System.out.println(0);
			return;
		}
		
		if(o==4){//ok
			System.out.println(24);
			return;
		}
		
		if(o==3){//ok
			System.out.println(36 + 24*hum);
			return;
		}
		
		if(o==2){
			System.out.println(14 + 36*hum + 24*hum*(hum-1)/2);
			return;
		}
		
		if(o==1){
			System.out.println(1 + 14*hum + 36*hum*(hum-1)/2 + 24*hum*(hum-1)*(hum-2)/6);
			return;
		}
		
		if(o==0){
			System.out.println(1*hum + 14*hum*(hum-1)/2 + 36*hum*(hum-1)*(hum-2)/6 + 24*hum*(hum-1)*(hum-2)*(hum-3)/24);
			return;
		}
	}
}


/*---------------*/


//error
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		String s = sc.next();
		
		int o = 0;
		int x = 0;
		int hum = 0;
		for(int i = 0; i < n; i++){
			char c = s.charAt(i);
			if(c=='o') o++;
			else if(c=='x') x++;
			else hum++;
		}
		
		if(o>4){//ok
			System.out.println(0);
			return;
		}
		
		if(o==4){//ok
			System.out.println(4*3*2*1);
			return;
		}
		
		if(o==3){//ok
			System.out.println((3*2*1*4*hum) + (6*2*3));
			return;
		}
		
		if(o==2){
			System.out.println(((6*2) + (4*2)) + (3*2*4*hum) + (6*2*hum*hum));
			return;
		}
		
		if(o==1){
			System.out.println(1 + (4*hum) + (6*hum*hum) + (4*hum*hum*hum));
			return;
		}
		
		if(o==0){
			System.out.println(hum*hum*hum*hum);
			return;
		}
	}
}
