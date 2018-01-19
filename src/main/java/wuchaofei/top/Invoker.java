package wuchaofei.top;

import java.util.*;

/**
 * 控制器
 * Created by cofco on 2018/1/18.
 */

public class Invoker {
    final Map<String, Command> commandMap = new HashMap<String, Command>();
    AdbExecutor executor;
    ClickCommand clickCommand;
    SwipeCommand swipeCommand;
    PowerCommand powerCommand;

    /**
     * // 1小时的毫秒设定
     * time 毫秒点击一次
     */
    private int timeInterval = 50;
    private int x=820;
    private int y=820;
    private int instance = 362;
    /**
     * 单线程不考虑同步问题
     */
    private boolean stop = true;

    public Invoker(){
        // 点击的位置坐标
        executor = new AdbExecutor();
        clickCommand =  new ClickCommand(x,y, executor);
        swipeCommand =  new SwipeCommand(x,y+instance*2,x, y-2*instance, executor);
        powerCommand =  new PowerCommand(executor);
        this.commandMap.put("click command", clickCommand);
        this.commandMap.put("click command", swipeCommand);
        this.commandMap.put("click command", powerCommand);
//        Command screenshotCommand =  new ScreenshotCommand(executor);
//        commandMap.put("screenshot command", screenshotCommand);
    }

    public void setCommand(String name, Command command){
        commandMap.put(name, command);
    }

    public void execute(){
        for (Map.Entry<String, Command> commands : commandMap.entrySet()) {
            commands.getValue().execute();
        }
    }

    public void timerExecute(int hour, int min, int sec){
        Calendar startDate = Calendar.getInstance();

        //设置开始执行的时间为 某年-某月-某月 00:00:00
        startDate.set(startDate.get(Calendar.YEAR), startDate.get(Calendar.MONTH), startDate.get(Calendar.DATE), hour, min, sec);
        startDate.set(Calendar.MILLISECOND, 0);
        // 定时器实例
        Timer t = new Timer();

        t.schedule(new TimerTask() {

            @Override
            public void run() {
//                clickCommand =  new ClickCommand(x,y + 2*instance, executor);
//                clickCommand.execute();
//                swipeCommand.execute();
                powerCommand.execute();
            }

        }, startDate.getTime(), timeInterval);
    }

    public void execute(String key){
        commandMap.get(key).execute();
    }

    public void pressePowerKey(){
        powerCommand.execute();
    }

    public void powerOff(){
        powerCommand.execute();
    }

    public void unLockScreen(){
        powerCommand.execute();
        swipeCommand =  new SwipeCommand(300,1000,300, 100, executor);
        swipeCommand.execute();

//        240 1020
//        540 1020
//        540 1320
//        840 1320
    }
}
