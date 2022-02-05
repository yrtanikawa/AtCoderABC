import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextint();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = 0;
		
		if(h==1){
			if(w==1){
				ans=1;
			}else if(w==2){
				if(a==0) ans=1;
				if(a==1) ans=1;
			}else if(w==3){
				if(a==0) ans=1;
				if(a==1) ans=2;
			}else if(w==4){
				if(a==0) ans=1;
				if(a==1) ans=3;
				if(a==2) ans=1;
			}else if(w==5){
				if(a==0) ans=1;
				if(a==1) ans=4;
				if(a==2) ans=3;
			}else if(w==6){
				if(a==0) ans=1;
				if(a==1) ans=5;
				if(a==2) ans=5;
				if(a==3) ans=1;
			}else if(w==7){
				if(a==0) ans=1;
				if(a==1) ans=6;
				if(a==2) ans=10;
				if(a==3) ans=4;
			}else if(w==8){
				if(a==0) ans=1;
				if(a==1) ans=6;
				if(a==2) ans=13;
				if(a==3) ans=9;
				if(a==4) ans=1;
			}else if(w==9){
			
			}else if(w==10){
				
			}else if(w==11){
			
			}else if(w==12){
			
			}else if(w==13){
				
			}else if(w==14){
			
			}else if(w==15){
			
			}else if(w==16){
				
			}
		}else if(h==2){
			if(w==1){
				
			}else if(w==2){
			
			}else if(w==3){
			
			}else if(w==4){
				
			}else if(w==5){
			
			}else if(w==6){
			
			}else if(w==7){
				
			}
		}else if(h==3){
			if(w==1){
			
			}else if(w==2){
			
			}else if(w==3){
				
			}else if(w==4){
			
			}else if(w==5){
			
			}
		}else if(h==4){
			if(w==1){
			
			}else if(w==2){
				
			}else if(w==3){
				
			}else if(w==4){

			}
		}else if(h==5){
			if(w==1){
				
			}else if(w==2){
			
			}else if(w==3){
			
			}
		}else if(h==6){
			if(w==1){
			
			}else if(w==2){
			
			}
		}else if(h==7){
			if(w==1){
			
			}else if(w==2){
			
			}
		}else if(h==8){
			if(w==1){
				
			}else if(w==2){
			
			}
		}else if(h==9){
		
		}else if(h==10){
		
		}else if(h==11){
		
		}else if(h==12){
		
		}else if(h==13){
		
		}else if(h==14){
		
		}else if(h==15){
		
		}else if(h==16){
			
		}
		
		System.out.println(ans);
	}
}
