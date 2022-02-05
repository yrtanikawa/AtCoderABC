import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		String[] arr = new String[n];
		for(int i = 0; i < n; i++){
			arr[i] = s.substring(1) + s.substring(0,1);
			s = arr[i];
		}
		Arrays.sort(arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[n-1]);
	}
}
