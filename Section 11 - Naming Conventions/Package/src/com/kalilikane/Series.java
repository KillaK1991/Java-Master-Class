package com.kalilikane;

public class Series {



    public static int nSum(int n){
        int total = 0;
        while(n >= 0){
            total = total + n;
            n--;
        }
        return total;
    }

    public static int factorial(int n){
        int total = 1;
        if(n == 0){
            return 1;
        }
        while(n >= 1){
            total = total * n;
            n--;
        }
        return total;
    }

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }

        int nMinus1 = 1;
        int nMinus2 = 0;
        int fib = 0;
        for(int i = 1; i < n; i++){
            fib = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        return fib;
    }

}
