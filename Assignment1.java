import java.io.*;
import java.util.*;
public class Assignment1{
    static int fib(int n){
        int a = 0, b = 1, c;
        if(n == 0){
            return a;
        }
        else{
            for(int i = 2; i <= n; i++){
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }
    static int fibo(int no)
    {
        if (no <= 1)
            return no;
        return fib(no - 1) + fib(no - 2);
    }
    public static void main(String[] args) {
        while(true){
            Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for iterative or 2 for recursive:");
        int number = in.nextInt();
        switch(number){
            case 1:
                System.out.println("Enter a number for iterative fibonacci series:");
                int n = in.nextInt();
                System.out.println(fib(n));
            break;
            case 2:
                System.out.println("Enter a number for recursive fibonacci series:");
                int no = in.nextInt();
                System.out.println(fib(no));
            break;
            default:
                System.out.println("Wrong Case. Try Later");
            break;
        }
        }
    }
}