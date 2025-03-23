public class Fibonocci_sequence {
    static int[] memo = new int[100];
    
    static int fib(int n){
        if (n <= 1) return n;
        if (memo[n] != 0 ) return memo[n];
    
        memo[n] = fib (n-1) + fib(n-2);
        return memo[n];
    }
    public static void main(String[]args){
        System.out.println(fib(8));
    }
}

