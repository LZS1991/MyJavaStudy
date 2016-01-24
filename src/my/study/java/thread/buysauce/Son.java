package my.study.java.thread.buysauce;

/**
 * Created by LZS2851 on 2016/1/24.
 */
public class Son implements Runnable{
    @Override
    public void run() {
        System.out.println("The son go out to buy juice!");
        System.out.println("It needs the son 5 mintues to finish!");

        try {
            for (int i = 1; i <= 5; i ++) {
                Thread.sleep(1000);
                System.out.println(i + "mintues");
            }
        } catch (InterruptedException e) {
            System.out.println("Something happens to the son!");
        }

        System.out.println("\nThe son comes back!");
    }
}
