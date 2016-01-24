package my.study.java.thread.buysauce;

/**
 * Created by LZS2851 on 2016/1/24.
 */
public class Monther2 implements Runnable {
    @Override
    public void run() {
        System.out.println("The mother parpare for the food!");
        System.out.println("the juice has been used up!");
        System.out.println("let the son to buy it!");
        Thread son = new Thread(new Son());
        son.start();

        System.out.println("wait for the son to buy the juice!");

        try {
            son.join();
        } catch (InterruptedException e) {
            System.err.println("Exception happened!");
            System.out.println("The mother stops cooking!");
            System.exit(1);
        }

        System.out.println("the mother start to cook!");
        System.out.println("the food has been done!");
    }
}
