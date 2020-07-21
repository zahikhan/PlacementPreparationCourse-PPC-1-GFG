// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Solution
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            long arr[] = new long[(int)n];
            
            for(int i = 0; i < n; i++)
                arr[(int)i]  =Integer.parseInt(st[(int)i]);
                
           new rearrange().arrange(arr, n);
           for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends

class rearrange
{
    static void arrange(long arr[], int n)
    {
        for(int i = 0 ; i < n ; i++) arr[i] = arr[i] + (arr[(int)arr[i]]%n) * n;
        for(int i = 0 ; i < n ; i++) arr[i] /= n;
    }
}