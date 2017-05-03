/*
Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are 
negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a 
new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though 
answers with absolute error of up to 10^-4 are acceptable.

Input Format

The first line contains an integer, N, denoting the size of the array. 
The second line contains N space-separated integers describing an array of numbers (a0,a1,a2,...,an-1).

Output Format

You must print the following 3 lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeroes in the array compared to its size.
Sample Input

6
-4 3 -9 0 4 1

Sample Output

0.500000
0.333333
0.166667

Explanation

There are 3 positive numbers, 2 negative numbers, and 1 zero in the array. 
The respective fractions of positive numbers, negative numbers and zeroes are 3/6 = 0.500000, 2/6 = 0.333333 and 
1/6 = 0.166667, respectively.*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in      = new Scanner(System.in);
        int largo       = in.nextInt();
        
        double cantCeros     = 0;
        double cantNegativos = 0;
        double cantPositivos = 0;
        
        double totalCeros     = 0;
        double totalNegativos = 0;
        double totalPositivos = 0;   

        for(int i = 0; i < largo; i++){
            int numero = in.nextInt();
            
            if(Math.signum(numero) == 0.0){
                cantCeros++;
            }else if(Math.signum(numero) == -1.0){
                cantNegativos++;
            }else if(Math.signum(numero) == 1.0){
                cantPositivos++;
            }   
        }
        
        totalCeros      = (cantCeros>0)? cantCeros/largo : 0;
        totalNegativos  = (cantNegativos>0)? cantNegativos/largo : 0;
        totalPositivos  = (cantPositivos>0)? cantPositivos/largo : 0;
        
        System.out.println(totalPositivos);
        System.out.println(totalNegativos);
        System.out.println(totalCeros);
    }

}