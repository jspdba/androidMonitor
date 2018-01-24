package wuchaofei.top.template;

import wuchaofei.top.Point;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 定义解锁命令的模板方法模式抽象类
 * Created by cofco on 2018/1/23.
 */
abstract class AbstractCommandTemplate {
    static List<String> unLockCommands = new ArrayList<String>();
    private List<Point> points;
    // 默认需要先点亮屏幕
    private boolean openPower = true;

    static String preffix = "adb shell sendevent /dev/input/event5 ";

    public static final int EV_SYN = 0;
    public static final int EV_KEY = 1;
    public static final int EV_ABS = 3;
    public static final int SYN_REPORT = 0;
    public static final int ABS_MT_SLOT = 47;
    public static final int ABS_MT_TOUCH_MAJOR = 48;
    public static final int ABS_MT_POSITION_X = 53;
    public static final int ABS_MT_POSITION_Y = 54;
    public static final int ABS_MT_TRACKING_ID = 57;
    public static final int ABS_MT_PRESSURE = 58;
    public static final int BTN_TOUCH = 330;
    private static final int UP = 0;
    private static final int DOWN = 1;

    public final List<String> unlock(){
        if(unLockCommands.size()==0){
            List<String> result;
            // 点亮屏幕
            openPower = ifOpenPower();
            if(openPower){
                result = stepPowerOn();
                if(result!=null&& result.size()>0){
                    unLockCommands.addAll(result);
                }
                // 显示解锁图案
                result = stepShowLockScreen();
                if(result!=null&& result.size()>0){
                    unLockCommands.addAll(result);
                }
            }
            // 滑动解锁
            result = stepUnLockScreen();
            if(result!=null&& result.size()>0){
                unLockCommands.addAll(result);
            }
        }
        return unLockCommands;
    }

    // 开始解锁
    private List<String> stepUnLockScreen() {
        List<String> commands = new ArrayList<String>();

        // 设置待解锁的点
        points = setPoints();
        // 定义事件开始
        commands.add(preffix + EV_ABS + " " + ABS_MT_TRACKING_ID + " " + "34899");
        // 定义起始坐标
        commands.add(preffix + EV_ABS + " " + ABS_MT_POSITION_X + " " + points.get(0).getX());
        commands.add(preffix + EV_ABS + " " + ABS_MT_POSITION_Y + " " + points.get(0).getY());
        // 鼠标按下
        commands.add(preffix + EV_KEY + " " + BTN_TOUCH + " " + DOWN);
        // 同步
        commands.add(preffix + EV_SYN + " " + SYN_REPORT + " " + "0");

        // 渐进且同步
        commands.addAll(stepByStep());

        // 定义事件结束
        commands.add(preffix + EV_ABS + ABS_MT_TRACKING_ID + "-1");
        // 鼠标抬起
        commands.add(preffix + EV_KEY + " " + BTN_TOUCH + " " + UP);
        // 同步
        commands.add(preffix + EV_SYN + " " + SYN_REPORT + " " + 0);
        return commands;
    }

    // 渐进且同步
    private List<String> stepByStep() {
        List<String> commands = new ArrayList<String>();
        if(points.size()>0){
            for (Point point : points) {
                commands.add(preffix + EV_ABS + " " + ABS_MT_POSITION_X + " " + point.getX());
                commands.add(preffix + EV_ABS + " " + ABS_MT_POSITION_Y + " " + point.getY());
                commands.add(preffix + EV_SYN + " " + SYN_REPORT + " " + "0");
            }
        }
        return commands;
    }

    // 设置待解锁的点
    abstract List<Point> setPoints();
    // 点亮屏幕
    protected List<String> stepPowerOn(){
        List<String> commands=new ArrayList<String>();
        commands.add("adb shell input keyevent KEYCODE_POWER");
        return commands;
    }

    // 显示解锁图案
    protected List<String> stepShowLockScreen(){
        List<String> commands=new ArrayList<String>();
        commands.add("adb shell input swipe 300 1000 300 100");
        return commands;
    }

    /**
     * 模拟点击
     * @param x
     * @param y
     * @return
     */
    public final String click(int x, int y){
        return "adb shell input tap " + x + " " + y;
    }

    /**
     * 模拟按键
     * @param key
     * @return
     */
    public final String keyPress(String key){
        return "adb shell input keyevent " + key;
    }

    /**
     * 模拟按键
     * @param key 按键
     * @return
     */
    public final String keyPressLong(String key){
        return "adb shell input keyevent --longpress" + key;
    }

    /**
     * 解锁前是否先点亮屏幕
     * @return
     */
    protected boolean ifOpenPower(){
        return openPower;
    }

    protected String setPreffix(){
        return preffix;
    }

    /**
     * 截图
     * @param savePath 图片保存位置
     * @return
     */
    public final String screenshot(String savePath){
        return "adb shell /system/bin/screencap -p /sdcard/screenshot.png && adb pull /sdcard/screenshot.png " + savePath;
    }

    public final String swipe(int x, int y, int x1, int y1){
        return "adb shell input swipe "+x+" "+y+" "+x1+" "+y1;
    }

    /**
     * 查看屏幕是否是亮屏，亮屏>0
     * @return
     */
    public final String catLcdBackLight(){
        return "adb shell cat sys/class/leds/lcd-backlight/brightness";
    }
}
