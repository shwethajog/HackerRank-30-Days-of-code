import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
         int sum=-999999999,temp=0;
        
        for(int i=0;i<4;i++){
        	
        	for(int j=0;j<4;j++){
        		temp=0;
        		for(int k=1;k<4;k++){
        			if(k==1){
        				temp=temp+arr[i][j]+arr[i][j+1]+arr[i][j+2];
        				//System.out.println(arr[i][j] + " " + arr[i][j+1] + " " + arr[i][j+2]);
        			}if(k==2){
        				temp=temp+arr[i+1][j+1];
        				//System.out.println(arr[i+1][j+1]);
        			}if(k==3){
        				temp=temp+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        				//System.out.println(arr[i+2][j] + " " + arr[i+2][j+1] + " " + arr[i+2][j+2]);
        			}
        		}
        		if(temp>sum) {
            		//System.out.println("temp : " + temp);
            		sum=temp;
            	}
        	}
        }
        System.out.println(sum);
    }
    
}
