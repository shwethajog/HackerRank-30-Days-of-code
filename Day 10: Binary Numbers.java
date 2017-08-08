import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s=Integer.toString(n,2);
        int count=0;
        int temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                temp++;
                if(temp>count) count=temp;
            } else{
                temp=0;
            }
        }
        System.out.println(count);
    }
}
