package sowmya.basics;

import java.util.Scanner;

class FizzBuzz{

   public static void main(String args[]){
	 
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter a number - ");
      
      int a=in.nextInt();
      
      if(a%5==0 && a%3==0)
        System.out.println("FizzBuzz");
      
      else if(a%5==0)
        System.out.println("Fizz");
      
      else if(a%3==0)
        System.out.println("Buzz");
      
      else
        System.out.println(a);             
      
      in.close();
    } 
}

   