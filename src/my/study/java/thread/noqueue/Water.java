package my.study.java.thread.noqueue;

/**
 * Created by LZS2851 on 2016/1/19.
 */
public class Water {
    public void flowWater(String studentName){
        System.out.println("开始为" + studentName + "流水");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束为" + studentName + "流水");
    }
}
