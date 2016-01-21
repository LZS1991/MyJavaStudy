package my.study.java.thread.queue;

/**
 * Created by LZS2851 on 2016/1/19.
 * 不排队形式学生并发接水
 */
public class Student extends Thread{
    private String studentName;
    private Water2 water;

    public Student(String studentName, Water2 water){
        super();
        this.studentName = studentName;
        this.water = water;
    }

    public void receiveWater(){
        System.out.println(studentName + "从教室跑向饮水机");
        water.flowWater(studentName);
        System.out.println(studentName + "跑回教室");
    }

    public void run(){
        receiveWater();
    }
}
