/*
Colleen is turning n years old! She has n candles of various heights on her cake, and candle i has height i. 
Because the taller candles tower over the shorter ones, Colleen can only blow out the tallest candles.

Given the heighti for each individual candle, find and print the number of candles she can successfully blow out.

Input Format

The first line contains a single integer, n, denoting the number of candles on the cake. 
The second line contains n space-separated integers, where each integer i describes the height of candle i.

Constraints

* 1 <= n <= 1^5
* 1 <= heighti <= 10^7

Output Format

Print the number of candles Colleen blows out on a new line.

Sample Input

4
3 2 1 3
Sample Output

2

Explanation

We have one candle of height 1, one candle of height 2, and two candles of height 3. Colleen only blows out the 
tallest candles, meaning the candles where height = 3. Because there are 2 such candles, we print 2 on a new line.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        
        int numeroMayor = height[0];
        for(int i = 0; i < height.length; i++){
            if(numeroMayor <= height[i]){
                numeroMayor = height[i];
            }
        }
        
        int contador = 0;
        for(int i = 0; i < height.length; i++){
            if(height[i]==numeroMayor){
                contador++;
            }
        }
        
        System.out.println(contador);
    }
}