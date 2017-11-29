package com.company;

import java.util.Scanner;

public class Main {



    public static void simpleStar()
    {
        System.out.println("*");
    }

    public static void horizontalLine()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            System.out.print("*");
    }


    public static void verticalLine()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            System.out.println("*");
    }


    public static void rightTriangle()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");

            System.out.println();
        }
    }

    public static void isoscelesTriangle()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int space=n-1-i;space>0;space--)
                System.out.print(" ");
            for(int stars=1;stars<=2*i+1;stars++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void diamond()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int spaces=n-1;
        int stars=1;
        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=0;j<spaces;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<stars*2;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            if(i<n)
            {
                spaces--;
                stars++;
            }
            else
            {
                spaces++;
                stars--;
            }
        }
    }

    public static void diamondWithName()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int spaces=n-1;
        int stars=1;
        String name="Bill";
        for(int i=1;i<=2*n-1;i++)
        {
            if(i==n)
            {
                for(int x=1;x<=(2*n-1)/2-name.length()/2;x++)
                    System.out.print(" ");
                System.out.println(name);
                spaces++;
                stars--;
            }
            else {
                    for (int j = 0; j < spaces; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k < stars * 2; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    if (i < n) {
                        spaces--;
                        stars++;
                    } else {
                        spaces++;
                        stars--;
                    }
                }
        }
    }

    public static void fizzBuzz()
    {
        for(int i=1;i<=100;i++)
            if(i%15==0)
                System.out.println("FizzBuzz");
        else
            if(i%3==0)
                System.out.println("Fizz");
        else
            if(i%5==0)
                System.out.println("Buzz");
        else
                System.out.println(i);
    }

    public static void primeFactors()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n/2];
        for(int i=0;i<nums.length;i++)
            nums[i]=0;
        nums[0]=1;
        for(int i=2;i<=n/2;i++)
            if(nums[i-1]==1)
                continue;
        else
            for(int p=2*i;p<=n/2;p+=i)
                nums[p-1]=1;

        for(int i=1;i<nums.length;i++)
            if(nums[i]==0)
                if(n%(i+1)==0)
                    System.out.println(i+1);
    }

    public static void main(String[] args) {
	// write your code here

      fizzBuzz();
    }
}
