import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int q = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		set.add(0);
		set.add(l);
		for(int i = 0; i < q; i++){
			int c = sc.nextInt();
			int x = sc.nextInt();
			
			if(c==1){
				set.add(x);
			}else{
				int high = set.higher(x);
				int low = set.lower(x);
				System.out.println(high - low);
			}
		}
	}
}
