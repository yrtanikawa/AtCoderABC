import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		Set<Long> set = new HashSet<Long>();

		long tmp;
		for(int i = 2; n>=(long)Math.pow(i,2); i++){
			for(int j = 2; n>=(long)Math.pow(i,j); j++){
				set.add((long)Math.pow(a, b));
			}
		}
		
		System.out.println(n-set.size());
	}
}
