import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        
        int largo   = in.nextInt();
        int arr[][] = new int[largo][largo];
        int sum1    = 0;
        int sum2    = 0;
        
        for(int x=0; x < largo; x++){
            for(int y=0; y < largo; y++){
                arr[x][y] = in.nextInt();
                
                if(x == y){
                    sum1 += arr[x][y];
                }
                
                if(x+1+y+1 == largo+1){
                    sum2 += arr[x][y];
                }                
            }
        }
        
        int resta = sum1 - sum2;
        System.out.println(Math.abs(resta));
    }
}