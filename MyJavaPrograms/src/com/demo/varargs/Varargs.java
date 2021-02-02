package com.demo.varargs;

class Varargs
{
   static void sumNumber(int ... args)
    {
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args)
        {
            sum += x;
        }
        System.out.println("sum is: "+sum);
    }

    public static void main( String[] args )
    {
      sumNumber(2, 4);
      sumNumber(1, 3, 5);
      sumNumber(1, 3, 5, 7);
       
    }
}