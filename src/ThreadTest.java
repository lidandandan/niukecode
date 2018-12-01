/**
 * Created by yixinf-q on 2018/9/11.
 */
public class ThreadTest {
    public synchronized void test1()
    {

            int i=5;
            while (i-->0)
            {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }

    }
    public synchronized void test2()
    {

            int i=5;
            while (i-->0)
            {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    public static void main(String[] args) {
        ThreadTest tt=new ThreadTest();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                tt.test1();

            }
        },"test1");

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                tt.test2();

            }
        },"test2");
        t1.start();
        t2.start();

    }

}



