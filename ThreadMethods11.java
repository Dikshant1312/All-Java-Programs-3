class A extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{

System.out.println("\t From Thread A: i+ "+i);
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
System.out.println("\t From Thread B: i+ "+i);
if(i==3) stop();
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
System.out.println("\t From Thread C: i+ "+i);
if(i==1)
try
{	sleep(1000);
}
catch(Exception e)
{}
}
System.out.println("Exit from C");
}
}
class ThreadMethods11
{
public static void main(String args[])
{
A thA =new A();
B thB = new B();
C thC = new C();
thC.set
System.out.println("Start thread A");
thA.start();
System.out.println("Start thread B");
thB.start();
System.out.println("Start thread C");
thC.start();
System.out.println(" End of main thread");
}
}