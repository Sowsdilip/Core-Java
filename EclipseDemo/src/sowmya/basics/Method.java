package sowmya.basics;

import java.util.Scanner;
   class Calculator{
      int add(int i,int j){
         return i+j;
        }
       static int multiply(int i,int j){
        return i*j;   
      }
      static int divisibility(int i,int j){
        return i%j;
      }
    }
    class Method{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
        System.out.println("Enter first number - ");
        int a=in.nextInt();
        System.out.println("Enter first number - ");
        int b=in.nextInt();
        int sum;
        int product;
        Calculator cal = new Calculator();
        sum=cal.add(a,b);
        System.out.println("sum = "+sum);
        product=Calculator.multiply(a,b);
        System.out.println("Product = "+product);
        in.close();
    }

}