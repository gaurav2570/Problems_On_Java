class Multi4
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Current thread is : "+Thread.currentThread().getName());

        Demo obj1 = new Demo();

        obj1.start();
        obj1.join();
        System.out.println("End of main thread");
    }
}
class Demo extends Thread
{
    public void run()
    {
       for(int i = 1; i < 1000; i++)
       {}
       System.out.println("End of thread");
    }
}