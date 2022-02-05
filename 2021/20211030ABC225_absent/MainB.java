import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		for(int i = 0; i < n-1; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a]++;
			arr[b]++;
		}
		for(int i = 1; i <= n; i++){
			if(arr[i]==n-1){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
