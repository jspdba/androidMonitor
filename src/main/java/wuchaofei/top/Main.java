package wuchaofei.top;

/**
 * Created by cofco on 2018/1/18.
 */

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        // 执行命令
//        invoker.execute();

        /**
         * 定时执行任务
         */
        invoker.timerExecute();
    }
}
