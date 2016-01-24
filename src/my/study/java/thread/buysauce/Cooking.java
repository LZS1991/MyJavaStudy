package my.study.java.thread.buysauce;

/**
 * Created by LZS2851 on 2016/1/24.
 */
public class Cooking {
    public static void main(String argv[]) {
        Thread mother = new Thread(new Monther2());
        mother.start();
    }
}
