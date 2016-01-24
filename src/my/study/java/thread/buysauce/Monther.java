package my.study.java.thread.buysauce;

/**
 * Created by LZS2851 on 2016/1/24.
 */
public class Monther implements Runnable {
    @Override
    public void run() {
        System.out.println("The mother parpare for the food!");
        System.out.println("the juice has been used up!");
        System.out.println("let the son to buy it!");
        Thread son = new Thread(new Son());
        son.start();
        System.out.println("wait for the son to buy the juice!");
        System.out.println("the mother start to cook!");
        System.out.println("the food has been done!");
    }
}
