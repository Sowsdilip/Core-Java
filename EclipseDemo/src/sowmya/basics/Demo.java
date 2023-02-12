package sowmya.basics;
//import java.util.Scanner;
/*class NewVarArgs{
      static int sum(int ...args){
      int add=0;
      System.out.println("No of arguments passed "+args.length);
      for(int i:args){
        add = add+i;
      }
      System.out.println("Sum is "+add);
      return add;
    }
}*/
class X{
   static int i=5;
  static void print(){
    System.out.println("Method i :"+i);
  }
  static {
    System.out.println("Static Initializer Class X:"+i);
    i = i++ + ++i;
    System.out.println("class X Line 1 :"+i);
    
  }
  {
    i=200;
    System.out.println("Instane Initializer X:"+i);
    i = i-- - --i;
    System.out.println("class X Line 2 :"+i);
  }
}
class Y extends X{
  static {
    System.out.println("Static Initializer Class Y:"+i);
    i = --i - i--;
    System.out.println("class Y Line 1 :"+i);
  }
  {
    i=400;
    System.out.println("Instane Initializer Y:"+i);
    i = ++i + i++;
    System.out.println("class Y Line 2 :"+i);
  }
}

class Demo{
  public static void main(String args[]){
   // int a = NewVarArgs.sum(1,2,3,4,5);
     X.print();
     //Y y = new Y();
     //X x = new X();
     //System.out.println("y.i :"+y.i);
     //System.out.println("x.i :"+x.i);
     Y.print();
  }
}
