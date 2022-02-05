import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			
		}
		
		//max=最大値(ある区間の最小値*区間の幅)
		int ans = 0;
		for(int l = 0; l < n; l++){
			int x = a[l];
			for(int r = l; r < n; r++){
				x = Math.min(x, a[r]);
				ans = Math.max(ans, x*(r-l+1));
			}
		}
		System.out.println(ans);
	}
}



//TLE
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			
		}
		
		//max=最大値(ある区間の最小値*区間の幅)
		int max = 0;
		int sum = 0;
		for(int l = 0; l < n; l++){
			for(int r = l; r < n; r++){
				if(l==r){
					sum = a[l];
				}else{
					int min = 100000;
					for(int i = l; i <= r; i++){
						min = Math.min(min, a[i]);
					}
					sum = min*(r-l+1);
				}
				max = Math.max(max, sum);
			}
		}
		System.out.println(max);
	}
}
