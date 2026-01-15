package b1;

import java.util.Scanner;

public class b1p1 {

	
		
		    public static boolean soNguyenTo(int n) {
		    	if(n<2) {
		    		return false;
		    	}
		    	for (int i=2; i<n;i++) {
		    		if(n%i==0) {
		    			return false;
		    		}
		    		
		    	}
		    	return true;
		    }
		    public static boolean sumDigit(int n) {
		    	int sum=0;
		    	while(n!=0) {
		    		sum+=n%10;
		    		n/=10;
		    	}
		    	return soNguyenTo(sum);
		    }
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int n= sc.nextInt();
				if(soNguyenTo(n)&& sumDigit(n)) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}

		

	}


