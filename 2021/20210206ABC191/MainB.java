import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		Queue<Integer> q = new ArrayDeque<>();
		int size = 0;
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			if(a != x){
				q.add(a);
				size++;
			}
		}
		
		for(int i = 0; i < size; i++){
			if(i != size) System.out.print(q.poll() + " ");
			else System.out.println(q.poll());
		}
	}
}
