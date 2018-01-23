package wuchaofei.top;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令执行者对象
 * Created by cofco on 2018/1/18.
 */

public class AdbExecutor extends Executor {
    private CommandTemplate commandTemplate = CommandTemplate.getInstance();
    /**
     * 模拟点击
     */
    public static final String SAVE_PATH = "d:/photo/m.png";

    public void click(int x, int y) {
        try {
            super.callCmd(commandTemplate.click(x,y));
            System.out.println("屏幕被点击了！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void click(int key) {
        pressKey("" + key);
    }

    public  void screenshot(){
        try {
            super.callCmd(commandTemplate.screenshot(SAVE_PATH));
            System.out.println("截图成功！"+SAVE_PATH);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void swipe(int x, int y,int x1, int y1){
        try {
            super.callCmd(commandTemplate.swipe(x,y,x1,y1));
            System.out.println("滑动...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void pressKey(String key){
        try {
//            callCmd("adb shell input keyevent --longpress " + key);
            super.callCmd(commandTemplate.keyPress(key));
            System.out.println("长按系统按键...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void longPressKey(String key){
        try {
            callCmd(commandTemplate.keyPressLong(key));
            System.out.println("长按系统按键...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void unLock(){
        try {
            System.out.println("解锁屏幕...");
            List<String> cmdArray = new ArrayList<String>(commandTemplate.unlock());
            callCmd(StringUtils.join(cmdArray," && "));
            System.out.println("解锁屏幕完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
