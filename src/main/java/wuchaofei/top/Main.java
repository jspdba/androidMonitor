package wuchaofei.top;

/**
 * Created by cofco on 2018/1/18.
 */

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.timerExecute(15,59,59);
//        invoker.timerExecute(14,39,59);
    }
}
