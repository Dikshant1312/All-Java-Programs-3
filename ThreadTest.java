class A extends Thread 
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("\t From Thread A:i"+i);
}
System.out.println("Exit from A");
}
}
class B extends Thread 
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("\t From Thread B:i"+i);
}
System.out.println("Exit from B");
}
}
class C extends Thread 
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("\t From Thread C:i"+i);
}
System.out.println("Exit from C");
}
}
class ThreadTest
{
public static void main(String args[])
{
new A().run();
new B().run();
new C().run();
}}