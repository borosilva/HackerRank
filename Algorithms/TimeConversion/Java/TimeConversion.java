/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-
hour clock, and 12:00:00 on a 24-hour clock.

Input Format

A single string containing a time in -hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 
01 <= hh <= 12 and 00 <= mm,ss < 59.

Output Format

Convert and print the given time in 24-hour format, where 00 <= hh <= 23.

Sample Input

07:05:45PM

Sample Output

19:05:45*/

import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        
        try{
            Scanner in          = new Scanner(System.in);
            SimpleDateFormat dt = new SimpleDateFormat("hh:mm:ssaa");

            String fecha    = in.next();
            Date fechaParse = dt.parse(fecha);
            
            SimpleDateFormat fechaFinal = new SimpleDateFormat("HH:mm:ss");
            System.out.println(fechaFinal.format(fechaParse));
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
}