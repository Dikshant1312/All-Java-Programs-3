public class th_ths
{
public static void main(String args[])
{
try
{
method();
}
catch(ArithmeticException e)
{
System.out.println("caught in main() method\n");
}
}
static void method() throws ArithmeticException
{
System.out.println("\nInside the method()");
throw new ArithmeticException("throwing ArithmeticException");
}
}