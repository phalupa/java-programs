public class BinaryOperator
{
    public static void main()
    {
        int a=50;
        int b;
        b=++a+a++;
        System.out.println("the output is "+b);
        
        a = 50;
        System.out.println("++a = "+ (++a));
        System.out.println(" a after ++a operation = "+ a);

        System.out.println("a++ = "+ (a++));
        System.out.println(" a after a++ operation = "+ a);
    }
}