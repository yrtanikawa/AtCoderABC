import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 余白を圧縮する
		String[][] swk = new String[n][n];
		String[][] twk = new String[n][n];
		int sh = 0;
		int swl = n - 1;
		int swr = 0;
		for (int i = 0; i < n; i++) {
			String work = sc.next();
			if (work.indexOf("#") >= 0) {
				swk[sh] = work.split("");
				sh++;
				swl = Math.min(swl, work.indexOf("#"));
				swr = Math.max(swr, work.lastIndexOf("#"));
			}
		}
		String[][] s = new String[sh][swr - swl + 1];
		for (int i = 0; i < sh; i++) {
			int x = 0;
			for (int j = swl; j <= swr; j++) {
				s[i][x] = swk[i][j];
				x++;
			}
		}
		int th = 0;
		int twl = n - 1;
		int twr = 0;
		for (int i = 0; i < n; i++) {
			String work = sc.next();
			if (work.indexOf("#") >= 0) {
				twk[th] = work.split("");
				th++;
				twl = Math.min(twl, work.indexOf("#"));
				twr = Math.max(twr, work.lastIndexOf("#"));
			}
		}
		String[][] t = new String[th][twr - twl + 1];
		for (int i = 0; i < th; i++) {
			int x = 0;
			for (int j = twl; j <= twr; j++) {
				t[i][x] = twk[i][j];
				x++;
			}
		}
		
		if (sh == th && (swr - swl + 1) == (twr - twl + 1)) {
			// 現状で同じかチェック
			boolean flag = true;
			for (int i = 0; i < sh; i++) {
				for (int j = 0; j < swr - swl + 1; j++) {
					if (!s[i][j].equals(t[i][j])) {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				System.out.println("Yes");
				return;
			}
			
			// ひっくり返して同じかチェック
			flag = true;
			for (int i = 0; i < sh; i++) {
				for (int j = 0; j < swr - swl + 1; j++) {
					if (!s[i][j].equals(t[sh - 1 - i][swr - swl - j])) {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				System.out.println("Yes");
				return;
			}
		}

		if (sh == (twr - twl + 1) && (swr - swl + 1) == th) {
			// 90度回転させて一致するかチェック
			boolean flag = true;
			for (int i = 0; i < sh; i++) {
				for (int j = 0; j < swr - swl + 1; j++) {
					if (!s[i][j].equals(t[swr - swl - j][i])) {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				System.out.println("Yes");
				return;
			}

			// 180度回転させて一致するかチェック
			flag = true;
			for (int i = 0; i < sh; i++) {
				for (int j = 0; j < swr - swl + 1; j++) {
					if (!s[i][j].equals(t[j][sh - i - 1])) {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}