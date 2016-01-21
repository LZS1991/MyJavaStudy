package my.study.java.thread.queue;

/**
 * Created by LZS2851 on 2016/1/19.
 * 学生并发接水的形式
 */
public class TestWater {
    public static void main(String[] args){
        Water2 water = new Water2();
        Student XC = new Student("XC", water);
        Student XS = new Student("XS", water);
        Student XW = new Student("XW", water);

        XC.start();
        XS.start();
        XW.start();
    }
}
