package ComprinnoSolutions;

import java.util.*;
import java.lang.*;
import java.math.*;


class Temple
{
	public static void main (String args[])
	{
	    	Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the value =>");
	    	int tcase=xyz.nextInt();
	    	while(tcase-->0){
	    	    int n=xyz.nextInt();
	    	    boolean b=true;
	    	    int a[]=new int[n];
	    	    for(int i=0;i<n;i++){
	    	        a[i]=xyz.nextInt();
	    	    }
	    	    if(a[0]==1 && n%2!=0){
	    	        for(int i=0;i<n/2;i++){
	    	            if(a[i]!=a[n-1-i] || a[i+1]!=a[i]+1 || a[n-2-i]!=a[n-1-i]+1){
	    	                b=false;
	    	                break;
	    	            }
	    	        }
	    	    }else{
	    	        b=false;
	    	    }
	    	    System.out.println(b? "yes":"no");
	    	}
	}
}