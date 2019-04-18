package vineethpackage;

/*
public class ThreadDemo extends Thread //Using Builtin Thread Class
{

public void run()
{
    System.out.println("Thread is started and running...");
}
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        t1.start();
       t2.start();
    
    }
    
}
*/
public class ThreadDemo implements Runnable //Using Builtin interface
{

public void run()
{
    System.out.println("Name:"+Thread.currentThread().getName());
    System.out.println("ID:"+Thread.currentThread().getId());
    System.out.println("Priority:"+Thread.currentThread().getPriority());
    
}
    public static void main(String[] args)
    {
        ThreadDemo td = new ThreadDemo();
        Thread t1 = new Thread(td);
    t1.setName("Vineeth");
    t1.setPriority(2);
    t1.start(); 
    }
}
    