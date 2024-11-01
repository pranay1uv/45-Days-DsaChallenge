//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.prime_Sum(n);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends




class Solution
{
    public long prime_Sum(int n)
    {
        // According to sieve of Eratosthenes
        // Omit 0,1
        
        long sum = 0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)) sum += i; 
        }
         return sum;
       
       
    }
    boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n % i == 0) return false;
        }
        return true;
    }   
}
