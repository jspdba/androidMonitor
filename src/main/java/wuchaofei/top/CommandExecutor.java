package wuchaofei.top;

/**
 * 命令执行者对象
 * Created by cofco on 2018/1/18.
 */

public class CommandExecutor extends wuchaofei.top.Executor {
    /**
     * 模拟点击
     */
    public static final String ADB_PATH  = "d:/adb/";
    String inputCommand = ADB_PATH + "adb shell input tap ";
    public static final String SAVE_PATH = "d:/photo/m.png";

    public void click(int x, int y) {
        StringBuilder sb = new StringBuilder(inputCommand);
        sb.append(x);
        sb.append(" ");
        sb.append(y);

        try {
            super.callCmd(sb.toString());
            System.out.println("屏幕被点击了！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void click(int key) {
        try {
            super.callCmd(ADB_PATH + "adb input keyevent " + key);
            System.out.println("屏幕被点击了！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void screenshot(){
        try {
            super.callCmd(ADB_PATH + "adb shell /system/bin/screencap -p /sdcard/screenshot.png", ADB_PATH+"adb pull /sdcard/screenshot.png " + SAVE_PATH);
            System.out.println("截图成功！"+SAVE_PATH);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void swipe(int x, int y,int x1, int y1){
        try {
            super.callCmd(ADB_PATH + "adb shell input swipe "+x+" "+y+" "+x1+" "+y1);
            System.out.println("滑动...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
