import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++){
			h[i] = sc.nextInt();
		}
		int now = 0;
		int haight = h[0];
		for(int i = 1; i < n; i++){
			if(h[i] > haight){
				now = i;
				haight = h[i];
			}else{
				System.out.println(h[i-1]);
				return;
			}
		}
		System.out.println(haight);
	}
}
