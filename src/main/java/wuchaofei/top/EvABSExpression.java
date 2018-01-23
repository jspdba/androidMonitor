package wuchaofei.top;

/**
 * Created by cofco on 2018/1/23.
 */

public class EvABSExpression extends Expression {
    @Override
    public String interpret(String context) {
        context = context.trim();
        String s="";
        if(context.startsWith("EV_ABS")){
            context = context.trim().substring("EV_ABS".length()).trim();
            s += (EV_ABS + " ");
            if(context.startsWith("ABS_MT_TRACKING_ID")){
                context = context.substring("ABS_MT_TRACKING_ID".length()).trim();
                s += (ABS_MT_TRACKING_ID + " ");
            }else if(context.startsWith("ABS_MT_PRESSURE")){
                context = context.substring("ABS_MT_PRESSURE".length()).trim();
                s += (ABS_MT_PRESSURE + " ");
            }else if(context.startsWith("ABS_MT_TOUCH_MAJOR")){
                context = context.substring("ABS_MT_TOUCH_MAJOR".length()).trim();
                s += (ABS_MT_TOUCH_MAJOR + " ");
            }else if(context.startsWith("ABS_MT_POSITION_X")){
                context = context.substring("ABS_MT_POSITION_X".length()).trim();
                s += (ABS_MT_POSITION_X + " ");
            }else if(context.startsWith("ABS_MT_POSITION_Y")){
                context = context.substring("ABS_MT_POSITION_Y".length()).trim();
                s += (ABS_MT_POSITION_Y + " ");
            }else{
                return null;
            }
            if(context.equalsIgnoreCase("ffffffff")){
                s += "-1";
            }else{
                s += (Integer.parseInt(context,16));
            }
            return s;
        }
        return null;
    }
}
