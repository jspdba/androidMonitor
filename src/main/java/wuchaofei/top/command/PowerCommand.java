package wuchaofei.top.command;

import wuchaofei.top.executor.AdbExecutor;

/**
 * 点击命令对象
 * Created by cofco on 2018/1/18.
 */

public class PowerCommand implements Command, Cloneable{
    AdbExecutor executor;

    public PowerCommand(AdbExecutor executor){
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
