import java.util.*;
public class Main {
	public static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		String s = sc.next();
		int q = sc.nextInt();
		int[] t = new int[q];
		int[] a = new int[q];
		int[] b = new int[q];
		for(int i = 0; i < q; i++){
			t[i] = sc.nextInt();
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		String s1 = s.substring(0,n);
		String s2 = s.substring(n);
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		int inv = 0;
		for(int i = 0; i < q; i++){
			if(t[i] == 1){
				if(inv % 2 == 0){
					swap(c1, c2, a[i], b[i]);
				}else{
					swap(c2, c1, a[i], b[i]);
				}
			}else{
				inv++;
			}
		}
		
		if(inv%2==0) System.out.println(new String(c1) + new String(c2));
		else System.out.println(new String(c2) + new String(c1));
	}
	
	public static void swap(char[] c1, char[] c2, int a, int b){
		if(b<=n){
			char tmp = c1[a-1];
			c1[a-1] = c1[b-1];
			c1[b-1] = tmp;
		}else if(a>n){
			a -= n;
			b -= n;
			char tmp = c2[a-1];
			c2[a-1] = c2[b-1];
			c2[b-1] = tmp;
		}else{
			b -= n;
			char tmp = c1[a-1];
			c1[a-1] = c2[b-1];
			c2[b-1] = tmp;
		}
	}
}

//TLE
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			int t = sc.nextInt();
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			if(t==1){
				String s1 = s.substring(0,a);
				String s2 = s.substring(a,a+1);
				String s3 = s.substring(a+1,b);
				String s4 = s.substring(b,b+1);
				String s5 = s.substring(b+1);
				s = s1 + s4 + s3 + s2 + s5;
			}
			
			if(t==2){
				s = s.substring(n) + s.substring(0,n);
			}
		}
		System.out.println(s);
	}
}
