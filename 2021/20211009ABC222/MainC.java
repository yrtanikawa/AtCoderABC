import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] a = new char[2*n][m];
		Obj[] rank = new Obj[2*n];
		for(int i = 0; i < 2*n; i++){
			a[i] = sc.next().toCharArray();
			Obj o = new Obj();
			o.index = i;
			rank[i] = o;
		}
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				int p1 = rank[2*j].index;
				int p2 = rank[2*j+1].index;
				
				int result = check(a[p1][i],a[p2][i]);
				if(result==1) rank[2*j].win++;
				else if(result==-1) rank[2*j+1].win++;
			}
			Arrays.sort(rank, (o1, o2) ->{
				if(o1.win != o2.win){
					return o2.win - o1.win;
				}
				return o1.index - o2.index;
			});
		}
		
		for(int i = 0; i < 2*n; i++){
			System.out.println(rank[i].index+1);
		}
	}
	
	public static int check(char p1, char p2){
		if(p1==p2) return 0;
		if(p1=='G' && p2=='C') return 1;
		if(p1=='C' && p2=='P') return 1;
		if(p1=='P' && p2=='G') return 1;
		return -1;
	}
	
	public static class Obj{
		int index, win;
	}
}






//NG
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] s = new String[2*n];
		//map:”Ô†EŸ—˜”
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < 2*n; i++){
			s[i] = sc.next();
			map.put(i, 0);
		}
		//1í–Ú
		int[] win = new int[2*n];
		Arrays.fill(win, 0);
		for(int i = 0; i < n; i++){
			char p1 = s.charAt(i*2);
			char p2 = s.charAt(i*2 +1);
			if(check(p1, p2) == 1){
				win[i*2]++;
				map.put(i*2, map.get(i*2)+1);
			}else if(check(p1, p2)==-1){
				win[i*2 + 1]++;
				map.put(i*2+1, map.get(i*2+1)+1);
			}
		}
		
		
	}
	
	public static int check(char p1, char p2){
		if(p1=='G' && p2=='C') return 1;
		if(p1=='G' && p2=='P') return -1;
		if(p1=='C' && p2=='P') return 1;
		if(p1=='C' && p2=='G') return -1;
		if(p1=='P' && p2=='G') return 1;
		if(p1=='P' && p2=='C') return -1;
		return 0;
	}
}
