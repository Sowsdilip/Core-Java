package sowmya.basics;

class Array
{
    public static void main(String a[])
    {
        int i[]=new int[5];
        int c=1;
        for(int b:i)
        {
            i[b]=c;
           c++;
           System.out.println(i[b]);
        }
    }
}