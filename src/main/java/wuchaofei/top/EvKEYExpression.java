package wuchaofei.top;

/**
 * Created by cofco on 2018/1/23.
 */

public class EvKEYExpression extends Expression {
    @Override
    public String interpret(String context) {
        context = context.trim();
        String s="";
        if(context.startsWith("EV_KEY")){
            context = context.trim().substring("EV_KEY".length()).trim();
            s += (EV_KEY + " ");
            if(context.startsWith("BTN_TOUCH")){
                context = context.substring("BTN_TOUCH".length()).trim();
                s += (BTN_TOUCH + " ");
            }else{
                return null;
            }

            if(context.equalsIgnoreCase("UP")){
                s += "0";
            }else{
                s += "1";
            }

            return s;
        }
        return null;
    }
}
