/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing 
exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-
separated long integers.

Input Format

A single line of five space-separated integers.

Constraints

Each integer is in the inclusive range [1,10^9].

Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be 
calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

Our initial numbers are 1, 2, 3, 4, and 5. We can calculate the following sums using four of the five integers:

If we sum everything except 1, our sum is 2+3+4+5=14.
If we sum everything except 2, our sum is 1+3+4+5=13.
If we sum everything except 3, our sum is 1+2+4+5=12.
If we sum everything except 4, our sum is 1+2+3+5=11.
If we sum everything except 5, our sum is 1+2+3+4=10.

As you can see, the minimal sum is 1+2+3+4=10 and the maximal sum is 2+3+4+5=14. Thus, we print 
these minimal and maximal sums as two space-separated integers on a new line.

Hints: Beware of integer overflow! Use 64-bit Integer.*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        long[] mayorMenor = obtenerMayorMenor(arr);
        System.out.println(mayorMenor[0]+" "+mayorMenor[1]);
    }
    
    public static long[] obtenerMayorMenor(long[] arrNumeros){
        long[] resultado = new long[2];
        long[] arrSuma   = new long[arrNumeros.length];  
        
        for(int i = 0; i < arrNumeros.length; i++){
            long numero     = arrNumeros[i];
            long suma       = 0;
            
            for(int x = 0; x < arrNumeros.length; x++){
                if(x != i){
                    suma += arrNumeros[x];   
                }
            }
            
            arrSuma[i] = suma;
        }
        
        resultado[0] = calcularMenor(arrSuma);
        resultado[1] = calcularMayor(arrSuma);
        
        return resultado;
    }
    
    public static long calcularMenor(long[] arrNumeros){
        long resultado = arrNumeros[0]; 
        for(int i=0; i<arrNumeros.length; i++) { 
            if(arrNumeros[i] < resultado) { 
                resultado = arrNumeros[i]; 
            } 
        } 
        return resultado; 
    }
    
    public static long calcularMayor(long[] arrNumeros) { 
        long resultado = arrNumeros[0];
        for(int i=0; i<arrNumeros.length; i++){ 
            if(arrNumeros[i] > resultado) { 
                resultado = arrNumeros[i]; 
            } 
        } 
        return resultado; 
    }
}