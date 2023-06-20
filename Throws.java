class Throws 
{
static void divide() throws ArithmeticException 
{
int x=33,y=0;
int z=x/y;
}
public static void main(String args[])
{
try 
{
divide();
}
catch(ArithmeticException e)
{
System.out.println("Caught the Expression"+e);
}
}
}
