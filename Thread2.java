public class Thread2
{

public static void main(String args[])
{
Thread t=new Thread("My First Thread");
Thread s=new Thread("Second thread is activated");
t.start();
s.start();
String str=t.getName();
String st=s.getName();
System.out.println(str);
System.out.println(st);
}
}