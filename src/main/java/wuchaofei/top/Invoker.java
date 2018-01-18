package wuchaofei.top;

import java.util.HashMap;
import java.util.Map;

/**
 * 控制器
 * Created by cofco on 2018/1/18.
 */

public class Invoker {
    final Map<String, Command> commandMap = new HashMap<String, Command>();
    CommandExecutor executor;
    Command clickCommand;
    Command swipeCommand;
    /**
     * 200ms点击一次
     */
    private int time = 300;
    private int x=820;
    private int y=820;
    private int instance = 362;
    /**
     * 单线程不考虑同步问题
     */
    private boolean stop = true;

    public Invoker(){
        // 点击的位置坐标
        executor = new CommandExecutor();
        clickCommand =  new ClickCommand(x,y + instance*3, executor);
//        swipeCommand =  new SwipeCommand(x,y+instance*2,x, y-2*instance, executor);
        this.commandMap.put("click command", clickCommand);
//        Command screenshotCommand =  new ScreenshotCommand(executor);
//        commandMap.put("screenshot command", screenshotCommand);
    }

    public void setCommand(String name, Command command){
        commandMap.put(name, command);
    }

    public void execute(){
        for (Map.Entry<String, Command> commands : commandMap.entrySet()) {
            commands.getValue().execute();
        }
    }

    public void timerExecute(){
        stop = false;
        for(;;){
            if(!stop){
//                swipeCommand.execute();
                clickCommand.execute();
//                clickCommand = ((ClickCommand)clickCommand).clone();
//                ((ClickCommand) clickCommand).setX(x);
//                ((ClickCommand) clickCommand).setY(y+instance*1);
//                clickCommand.execute();
//                clickCommand = ((ClickCommand)clickCommand).clone();
//                ((ClickCommand) clickCommand).setX(x);
//                ((ClickCommand) clickCommand).setY(y+instance*2);
//                clickCommand.execute();
//                clickCommand = ((ClickCommand)clickCommand).clone();
//                ((ClickCommand) clickCommand).setX(x);
//                ((ClickCommand) clickCommand).setY(y+instance*3);
//                clickCommand.execute();

//                stop = true;
            }else{
                break;
            }

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void execute(String key){
        commandMap.get(key).execute();
    }
}
