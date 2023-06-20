class Test1 extends Thread 
{
    public void run()
    {
        System.out.println("Run method executed by child Thread");
    }
    public static void main(String[] args)
    {
        Test1 t = new Test1();
        t.start();
        System.out.println("Main method executed by main thread");
    }
}