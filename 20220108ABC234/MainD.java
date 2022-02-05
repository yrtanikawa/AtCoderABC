import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++){
			p[i] = sc.nextInt();
		}
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for(int i = 0; i < k; i++){
			que.add(p[i]);
		}
		StringBuilder sb = new StringBuilder();
		sb.append(que.peek() + "\n");
		for(int i = k; i < n; i++){
			if(que.peek() < p[i]){
				que.poll();
				que.add(p[i]);
			}
			sb.append(que.peek() + "\n");
		}
		System.out.println(sb);
	}
}
