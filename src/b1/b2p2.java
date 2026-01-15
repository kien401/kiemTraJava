package b1;

import java.util.Scanner;

public class b2p2 {
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
    public static int uoc(int n) {
    	int max = 0;
    	for (int i=1; i<= Math.sqrt(n);i++) {
    		if(n%i==0) {
    	
    			if(soNguyenTo(i)) {
    				max =i;
    			}
    			if (i!=n/i) {
    			
    		
    				if(soNguyenTo(n/i)) {
    					if(n/i> max) {
    						max= n/i;
    					}
    				}
    			}
    		
    		}
    		
    	}
    	return max;
	
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); {
			int n= sc.nextInt();
		System.out.println(uoc(n));

	}

}
}
