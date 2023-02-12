package sowmya.basics;
import java.lang.Math;

import java.util.Scanner;
class MortCal{

   public static void main(String args[]){
     
       byte n;
       float roi;
       int p;
       double m;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principal - ");
        p = in.nextInt();
        System.out.println("Enter Rate of Interest- ");
        roi = ((in.nextFloat())/100)/12;
        System.out.println("Enter no of months - ");
        n = in.nextByte();
        double temp = (Math.pow((1+roi),n));
        m=(p*roi*temp)/(temp-1);
        System.out.println("Mortgage = "+m);
        in.close();

 }
}
