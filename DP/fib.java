package DP;

public class fib {

	public static void main(String[] args) {
		
		
		int n=5;
		int[]strg=new int[n+1];
		System.out.println(fibRecursion(n));
		System.out.println(fibTD(n,strg));
		System.out.println(fibBU(n));
		System.out.println(fibBUSE(n));
	}

	private static int fibBUSE(int n) {
		
		int[]strg=new int[2];
		strg[0]=0;
		strg[1]=1;
		for(int slide=1;slide<=n-1;slide++) {
			
			int sum=strg[0]+strg[1];
			strg[0]=strg[1];
			strg[1]=sum;
			
			
		}
		
		return strg[1];
		
	}

	private static int fibBU(int n) {
	
		int[]strg=new int[n+1];
		strg[0]=0;
		strg[1]=1;
		for(int i=2;i<=n;i++) {
			
			strg[i]=strg[i-1]+strg[i-2];
			
		}
		
		return strg[n];
		
	}

	private static int fibTD(int n, int[] strg) {
		
		if(n==0||n==1) {
			return n;
		}
		if(strg[n]!=0) {
			return strg[n];
		}
		  
		int f1=fibRecursion(n-1);
		int f2=fibRecursion(n-2);
		
		strg[n]= f1+f2;

		return strg[n];
		
	}

	private static int  fibRecursion(int n) {
		
		if(n==0||n==1) {
			return n;
		}
		
		  
		int f1=fibRecursion(n-1);
		int f2=fibRecursion(n-2);
		
		return f1+f2;
				
		
		
	}
	
	
	
	
}
