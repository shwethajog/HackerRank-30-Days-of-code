import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        //System.out.println(n);
        int[] s=new int[n];
        for(int i=0;i<=n;i++){
        	String a=scan.next();
        	for(int j=0;j<a.length();j++){
        		if(j%2==0){
        			System.out.print(a.charAt(j));
        		}
        	}
            //if(i>0)
        	   System.out.print(" ");
        	for(int j=0;j<a.length();j++){
        		if(j%2!=0){
        			System.out.print(a.charAt(j));
        		}
        	}
            //if(i>0)
                System.out.println();
        }
     }
}
