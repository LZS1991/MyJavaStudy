package my.study.java.thread.noqueue;

/**
 * Created by LZS2851 on 2016/1/19.
 */
public class TestWater {
    public static void main(String[] args){
        Water water = new Water();
        Student XC = new Student("XC", water);
        Student XS = new Student("XS", water);
        Student XW = new Student("XW", water);

        XC.start();
        XS.start();
        XW.start();
    }
}
