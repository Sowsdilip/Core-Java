package sowmya.basics;

class StringToStringBuilder{ 
  
   StringToStringBuilder(){  
      
        String strs[] = {"Dilip", "Sowmya", "Pranav", "Akshara"};
        StringBuilder sb = new StringBuilder();
        sb.append(strs[0]);
        sb.append(" "+strs[1]);
        sb.append(" "+strs[2]);
        sb.append(" "+strs[3]);
       // sb.append(" "+strs[4]);
       // sb.append(" "+strs[5]);
         System.out.println(sb.toString());
         strs[1]=sb.substring(0);
         System.out.println(strs[1]);
    }
}


class StringDemo{
    public static void main(String args[]){
        
       // String s1 = "hello!"+"world"+125+25.5;

        //String s5 = 125+25.5+"hello!"+"world";

        /*String s6 = "hello! Java";

        System.out.println("s1 == s5 " + (s1==s5) );

        s1 = s1+" Java";

        System.out.println("s1 == s6 " + (s1==s6) );

        System.out.println("s1 == s5 " + (s1==s5) );

        System.out.println("s1 : " + s1);

        System.out.println("s6 : " + s6);*/

       // System.out.println("s1 :"+s1);

       // System.out.println("s5 :"+s5);

        StringToStringBuilder sb = new StringToStringBuilder();

    }
}