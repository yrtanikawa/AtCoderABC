import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		for(int i = 0; i < n; i++){
			if(i%2==0){
				if(Character.isUpperCase(s.charAt(i))){
					System.out.println("No");
					return;
				}
			}else{
				if(Character.isLowerCase(s.charAt(i))){
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
