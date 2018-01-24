package wuchaofei.top;

import wuchaofei.top.command.*;
import wuchaofei.top.executor.AdbExecutor;

import java.util.*;

/**
 * 控制器
 * Created by cofco on 2018/1/18.
 */

public class Invoker {
    AdbExecutor executor;

    /**
     * // 1小时的毫秒设定
     * time 毫秒点击一次
     */
    private int timeInterval = 1000*60;
    private int x=820;
    private int y=820;
    private int instance = 362;

    public Invoker(){
        // 点击的位置坐标
        executor = new AdbExecutor();
    }

    /**
     * 定时执行
     * @param hour
     * @param min
     * @param sec
     */
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
                runBatch();
            }

        }, startDate.getTime(), timeInterval);
    }

    /**
     * 点亮屏幕
     */
    public void powerOn(){
        PowerCommand powerCommand=new PowerCommand(executor);
        powerCommand.execute();
    }

    /**
     * 关掉屏幕
     */
    public void powerOff(){
        PowerCommand powerCommand=new PowerCommand(executor);
        powerCommand.execute();
    }

    /**
     * 解锁屏幕
     */
    public void unLockScreen(){
        UnLockCommand unLockCommand = new UnLockCommand(executor);
        unLockCommand.execute();
    }

    /**
     * 获取屏幕亮度
     * @return
     */
    public String catLcdBackLight(){
        return executor.catLcdBackLight();
    }

    /**
     * 执行批处理命令
     * @return
     */
    public String runBatch(){
        return executor.runBatch(new String[]{"D:/zhongliang/androidMonitor/ClickBatch.bat",""+x,""+(y+instance)});
    }

    /**
     * 执行截图命令
     */
    public void screenShot(){
        ScreenshotCommand screenshotCommand=new ScreenshotCommand(executor);
        screenshotCommand.execute();
    }
}
