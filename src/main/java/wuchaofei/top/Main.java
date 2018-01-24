package wuchaofei.top;

/**
 * Created by cofco on 2018/1/18.
 */

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        // 解锁屏幕
//        invoker.unLockScreen();
//        invoker.screenShot();
//        invoker.pressePowerKey();
//        invoker.timerExecute(17,59,59);
//        invoker.pressePowerKey();
//        System.out.println(invoker.catLcdBackLight());

//        invoker.timerExecute(10,04,59);
        invoker.runBatch();
    }
}
