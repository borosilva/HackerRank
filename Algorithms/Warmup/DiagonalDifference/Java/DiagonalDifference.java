/* Given a square matrix of size N x N, calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing N 
space-separated integers describing the columns.

Constraints

-100 <= Elements in the matrix <= 100

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12

Sample Output

15

Explanation

The primary diagonal is:

11
   5
     -12

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15

Note: |x| is absolute value (https://www.mathsisfun.com/numbers/absolute-value.html) function */

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