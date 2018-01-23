package wuchaofei.top;

/**
 * Created by cofco on 2018/1/23.
 */

abstract class Expression {
    static int EV_SYN = 0;
    static int EV_KEY = 1;
    static int EV_ABS = 3;
    static int SYN_REPORT = 0;
    static int ABS_MT_SLOT = 47;
    static int ABS_MT_TOUCH_MAJOR = 48;
    static int ABS_MT_POSITION_X = 53;
    static int ABS_MT_POSITION_Y = 54;
    static int ABS_MT_TRACKING_ID = 57;
    static int ABS_MT_PRESSURE = 58;
    static int BTN_TOUCH = 330;

    abstract String interpret(String context);
}
