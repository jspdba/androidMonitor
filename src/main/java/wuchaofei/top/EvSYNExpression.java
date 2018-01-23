package wuchaofei.top;

/**
 *
 * Created by cofco on 2018/1/23.
 */

public class EvSYNExpression extends Expression {
    @Override
    public String interpret(String context) {
        context = context.trim();
        String s="";
        if(context.startsWith("EV_SYN")){
            context = context.trim().substring("EV_SYN".length()).trim();
            s += (EV_SYN + " ");
            if(context.startsWith("SYN_REPORT")){
                context = context.substring("SYN_REPORT".length()).trim();
                s += (SYN_REPORT + " ");
            }else{
                return null;
            }
            if(context.equalsIgnoreCase("00000000")){
                s += "0";
            }else{
                return null;
            }
            return s;
        }
        return null;
    }
}
