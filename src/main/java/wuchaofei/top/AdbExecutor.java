package wuchaofei.top;

/**
 * 命令执行者对象
 * Created by cofco on 2018/1/18.
 */

public class AdbExecutor extends wuchaofei.top.Executor {
    /**
     * 模拟点击
     */
    public static final String ADB_PATH  = "d:/zhongliang/adb/";
    public static final String SAVE_PATH = "d:/photo/m.png";

    public void click(int x, int y) {
        try {
            callCmd(ADB_PATH + "adb shell input tap "+x+" "+y);
            System.out.println("屏幕被点击了！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void click(int key) {
        try {
            callCmd(ADB_PATH + "adb input keyevent " + key);
            System.out.println("屏幕被点击了！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void screenshot(){
        try {
            callCmd(ADB_PATH + "adb shell /system/bin/screencap -p /sdcard/screenshot.png", ADB_PATH+"adb pull /sdcard/screenshot.png " + SAVE_PATH);
            System.out.println("截图成功！"+SAVE_PATH);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void swipe(int x, int y,int x1, int y1){
        try {
            callCmd(ADB_PATH + "adb shell input swipe "+x+" "+y+" "+x1+" "+y1);
            System.out.println("滑动...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void pressKey(String key){
        try {
//            callCmd(ADB_PATH + "adb shell input keyevent --longpress " + key);
            callCmd(ADB_PATH + "adb shell input keyevent " + key);
            System.out.println("长按系统按键...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void longPressKey(String key){
        try {
            callCmd(ADB_PATH + "adb shell input keyevent --longpress " + key);
            System.out.println("长按系统按键...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
