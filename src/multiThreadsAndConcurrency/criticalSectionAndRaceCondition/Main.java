package src.multiThreadsAndConcurrency.criticalSectionAndRaceCondition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic oMatic = new OrderMatic();
        List<Thread> islemler = new ArrayList<>();
        for (int i=0;i<100;i++){
            Thread t = new Thread(oMatic);
            islemler.add(t);
            t.start();
        }
        for (Thread t : islemler){
            t.join();
        }

        System.out.println(oMatic.getOrderNo());
    }
}
