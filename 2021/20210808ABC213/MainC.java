import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		TreeSet<Integer> aset = new TreeSet<>();
		TreeSet<Integer> bset = new TreeSet<>();
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			aset.add(a[i]);
			bset.add(b[i]);
		}
		
		HashMap<Integer, Integer> amap = new HashMap<>();
		HashMap<Integer, Integer> bmap = new HashMap<>();
		for(int i : aset){
			amap.put(i, amap.size()+1);
		}
		for(int i : bset){
			bmap.put(i, bmap.size()+1);
		}
		
		for(int i = 0; i < n; i++){
			System.out.print(amap.get(a[i]));
			System.out.println(" " + bmap.get(b[i]));
		}
	}
}

//メモリオーバー
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[h+1][w+1];
		for(int[] r : arr){
			Arrays.fill(r, 0);
		}
		boolean[] tate = new boolean[h+1];
		boolean[] yoko = new boolean[w+1];
		Arrays.fill(tate, false);
		Arrays.fill(yoko, false);
		for(int i = 1; i <= n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = i;
			tate[a] = true;
			yoko[b] = true;
		}
		
		
		//図表示
		for(int i = 1; i <= h; i++){
			for(int j = 1; j <= w; j++){
				if(tate[i]==true && yoko[j]==true){
					if(arr[i][j]=0)System.out.print("*");
					else System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}
	}
}
