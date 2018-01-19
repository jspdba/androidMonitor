package wuchaofei.top;

/**
 * 点击命令对象
 * Created by cofco on 2018/1/18.
 */

public class PowerCommand implements Command, Cloneable{
    CommandExecutor executor;

    public PowerCommand(CommandExecutor executor){
        this.executor = executor;
    }

    @Override
    public PowerCommand clone() {
        PowerCommand powerCommand = null;
        try {
            powerCommand = (PowerCommand)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return powerCommand;
    }

    @Override
    public void execute() {
        executor.pressKey("KEYCODE_POWER");
    }
}
