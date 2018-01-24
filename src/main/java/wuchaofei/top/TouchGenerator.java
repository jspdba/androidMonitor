package wuchaofei.top;

import wuchaofei.top.expression.EvABSExpression;
import wuchaofei.top.expression.EvKEYExpression;
import wuchaofei.top.expression.EvSYNExpression;
import wuchaofei.top.expression.Expression;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 产生touch 事件
 * Created by cofco on 2018/1/23.
 */
public class TouchGenerator extends Expression {
    private static final List<Expression> expressionList = new ArrayList<Expression>();
    static {
        expressionList.add(new EvABSExpression());
        expressionList.add(new EvKEYExpression());
        expressionList.add(new EvSYNExpression());
    }
    private TouchGenerator(){}
    public static final TouchGenerator touchGenerator = new TouchGenerator();
    public static List<String> commands;

    public static String command =
          "EV_ABS       ABS_MT_TRACKING_ID   00008853\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000049\n" +
//          "EV_ABS       ABS_MT_TOUCH_MAJOR   00000004\n" +
          "EV_ABS       ABS_MT_POSITION_X    000000f8\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000419\n" +
          "EV_KEY       BTN_TOUCH            DOWN\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000004a\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000004b\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000004c\n" +
//          "EV_ABS       ABS_MT_TOUCH_MAJOR   00000005\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000004d\n" +
//          "EV_ABS       ABS_MT_TOUCH_MAJOR   00000006\n" +
          "EV_ABS       ABS_MT_POSITION_X    00000100\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000412\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000004e\n" +
//          "EV_ABS       ABS_MT_POSITION_X    0000010b\n" +
//          "EV_ABS       ABS_MT_POSITION_Y    0000040a\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000004f\n" +
//          "EV_ABS       ABS_MT_TOUCH_MAJOR   00000007\n" +
          "EV_ABS       ABS_MT_POSITION_X    0000011e\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000400\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000050\n" +
//          "EV_ABS       ABS_MT_POSITION_X    00000137\n" +
//          "EV_ABS       ABS_MT_POSITION_Y    000003f6\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000051\n" +
          "EV_ABS       ABS_MT_POSITION_X    00000157\n" +
          "EV_ABS       ABS_MT_POSITION_Y    000003ea\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000052\n" +
          "EV_ABS       ABS_MT_POSITION_X    0000017b\n" +
          "EV_ABS       ABS_MT_POSITION_Y    000003e0\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000053\n" +
//          "EV_ABS       ABS_MT_POSITION_X    000001a0\n" +
//          "EV_ABS       ABS_MT_POSITION_Y    000003d9\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000054\n" +
          "EV_ABS       ABS_MT_POSITION_X    000001c3\n" +
          "EV_ABS       ABS_MT_POSITION_Y    000003d4\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000055\n" +
          "EV_ABS       ABS_MT_POSITION_X    000001e2\n" +
          "EV_ABS       ABS_MT_POSITION_Y    000003cf\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000056\n" +
          "EV_ABS       ABS_MT_POSITION_X    000001fe\n" +
          "EV_ABS       ABS_MT_POSITION_Y    000003cc\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000057\n" +
//          "EV_ABS       ABS_MT_POSITION_X    00000217\n" +
//          "EV_ABS       ABS_MT_POSITION_Y    000003cb\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000058\n" +
          "EV_ABS       ABS_MT_POSITION_X    0000022a\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000059\n" +
          "EV_ABS       ABS_MT_POSITION_X    0000023d\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000005a\n" +
          "EV_ABS       ABS_MT_POSITION_X    0000024b\n" +
          "EV_ABS       ABS_MT_POSITION_Y    000003cc\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000005b\n" +
//          "EV_ABS       ABS_MT_POSITION_X    00000258\n" +
//          "EV_ABS       ABS_MT_POSITION_Y    000003cf\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000005c\n" +
          "EV_ABS       ABS_MT_POSITION_X    0000025f\n" +
          "EV_ABS       ABS_MT_POSITION_Y    000003d4\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000005d\n" +
//          "EV_ABS       ABS_MT_POSITION_X    00000264\n" +
//          "EV_ABS       ABS_MT_POSITION_Y    000003db\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000005e\n" +
          "EV_ABS       ABS_MT_POSITION_X    00000265\n" +
          "EV_ABS       ABS_MT_POSITION_Y    000003e2\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000005f\n" +
          "EV_ABS       ABS_MT_POSITION_Y    000003e8\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000060\n" +
          "EV_ABS       ABS_MT_POSITION_X    00000264\n" +
          "EV_ABS       ABS_MT_POSITION_Y    000003f1\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000061\n" +
          "EV_ABS       ABS_MT_POSITION_X    0000025f\n" +
          "EV_ABS       ABS_MT_POSITION_Y    000003ff\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000062\n" +
//          "EV_ABS       ABS_MT_POSITION_X    00000258\n" +
//          "EV_ABS       ABS_MT_POSITION_Y    00000410\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000063\n" +
          "EV_ABS       ABS_MT_POSITION_X    0000024f\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000424\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000064\n" +
          "EV_ABS       ABS_MT_POSITION_X    00000247\n" +
          "EV_ABS       ABS_MT_POSITION_Y    0000043a\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000065\n" +
//          "EV_ABS       ABS_MT_POSITION_X    0000023d\n" +
//          "EV_ABS       ABS_MT_POSITION_Y    00000451\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000066\n" +
//          "EV_ABS       ABS_MT_POSITION_X    00000232\n" +
//          "EV_ABS       ABS_MT_POSITION_Y    00000469\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000067\n" +
          "EV_ABS       ABS_MT_POSITION_X    00000227\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000482\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000068\n" +
          "EV_ABS       ABS_MT_POSITION_X    0000021b\n" +
          "EV_ABS       ABS_MT_POSITION_Y    0000049c\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000069\n" +
//          "EV_ABS       ABS_MT_POSITION_X    0000020e\n" +
//          "EV_ABS       ABS_MT_POSITION_Y    000004b6\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000006a\n" +
          "EV_ABS       ABS_MT_POSITION_X    00000202\n" +
          "EV_ABS       ABS_MT_POSITION_Y    000004ce\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000006b\n" +
          "EV_ABS       ABS_MT_POSITION_X    000001f6\n" +
          "EV_ABS       ABS_MT_POSITION_Y    000004e4\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000006c\n" +
          "EV_ABS       ABS_MT_POSITION_X    000001ea\n" +
          "EV_ABS       ABS_MT_POSITION_Y    000004fa\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000006d\n" +
//          "EV_ABS       ABS_MT_POSITION_X    000001df\n" +
//          "EV_ABS       ABS_MT_POSITION_Y    0000050d\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000006e\n" +
//          "EV_ABS       ABS_MT_POSITION_X    000001d6\n" +
//          "EV_ABS       ABS_MT_POSITION_Y    0000051e\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000006f\n" +
          "EV_ABS       ABS_MT_POSITION_X    000001d0\n" +
          "EV_ABS       ABS_MT_POSITION_Y    0000052c\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      00000070\n" +
          /*"EV_ABS       ABS_MT_POSITION_X    000001cb\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000537\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    000001c9\n" +
          "EV_ABS       ABS_MT_POSITION_Y    0000053f\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    000001c8\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000545\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000548\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000549\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    000001cb\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    000001d5\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000548\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    000001e7\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000544\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    00000203\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000540\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    00000223\n" +
          "EV_ABS       ABS_MT_POSITION_Y    0000053b\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    00000248\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000537\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    0000026f\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000534\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    00000299\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000530\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    000002c4\n" +
          "EV_ABS       ABS_MT_POSITION_Y    0000052d\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    000002ee\n" +
          "EV_ABS       ABS_MT_POSITION_Y    0000052c\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    00000319\n" +
          "EV_ABS       ABS_MT_POSITION_Y    0000052a\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    00000342\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000527\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    00000369\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000523\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    0000038e\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000521\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    000003ae\n" +
          "EV_ABS       ABS_MT_POSITION_Y    0000051d\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    000003c8\n" +
          "EV_ABS       ABS_MT_POSITION_Y    0000051a\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    000003db\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000519\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    000003ea\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000518\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    000003f2\n" +
          "EV_ABS       ABS_MT_POSITION_Y    00000517\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_POSITION_X    000003f8\n" +
          "EV_SYN       SYN_REPORT           00000000\n" +*/
//          "EV_ABS       ABS_MT_POSITION_X    000003fc\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_POSITION_X    00000400\n" +
//          "EV_ABS       ABS_MT_POSITION_Y    00000515\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
//          "EV_ABS       ABS_MT_PRESSURE      0000006f\n" +
//          "EV_ABS       ABS_MT_TOUCH_MAJOR   00000006\n" +
//          "EV_ABS       ABS_MT_POSITION_X    00000402\n" +
//          "EV_SYN       SYN_REPORT           00000000\n" +
          "EV_ABS       ABS_MT_TRACKING_ID   ffffffff\n" +
          "EV_KEY       BTN_TOUCH            UP\n" +
          "EV_SYN       SYN_REPORT           00000000";

    @Override
    public String interpret(String context) {
        context = context.trim();
        String[] lines = context.split("\n");
        StringBuilder sb = new StringBuilder();
        commands = new ArrayList<String>();
        for (int i = 0; i < lines.length; i++) {
            boolean explained = false;
            for (Expression expression : expressionList) {
                String result = expression.interpret(lines[i]);
                if(result != null){
                    explained = true;
                    commands.add("adb shell sendevent /dev/input/event5 " + result);
                    break;
                }
            }
            if(!explained){
                System.out.println(lines[i] + " is not explained!");
            }
        }
        return sb.toString();
    }
    public static TouchGenerator getInstance(){
        return touchGenerator;
    }

    /**
     * 生产解锁屏幕命令
     * @return
     */
    public List<String> genorate() {
        interpret(command);
        return commands;
    }
}
