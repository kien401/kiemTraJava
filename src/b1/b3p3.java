package b1;

import java.util.Scanner;

public class b3p3 {
    public static int  sum(int n) {
    	int sum=0;
    	for(int i=1; i<=Math.sqrt(n); i++) {
    		if(n%i==0) {
    			if(i%3==0) {
    				sum+=i;
    			}
    			if(i!=n/i) {
    				if(n/i %3==0) {
    					sum+=n/i;
    				}
    			}
    		}
    	}
    	return sum;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); {
			int n = sc.nextInt();
			System.out.println(sum(n));
			
		}

	}

}
