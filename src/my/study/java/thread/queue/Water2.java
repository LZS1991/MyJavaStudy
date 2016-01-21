package my.study.java.thread.queue;

/**
 * Created by LZS2851 on 2016/1/19.
 */
public class Water2 {
    int studentNumber;
    public synchronized void flowWater(String studentName){

        synchronized (this) {
            ++ studentNumber;
            System.out.println("开始为" + studentName + "接水");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("结束为"+ studentName +"接水");
            if (studentNumber < 3){
                try {
                    wait();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            } else {
                notifyAll();
            }
        }
    }




//    public void flowWater(String studentName){
//        System.out.println("开始为" + studentName + "流水");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("结束为" + studentName + "流水");
//    }
}
