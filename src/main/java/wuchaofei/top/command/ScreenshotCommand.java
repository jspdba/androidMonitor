package wuchaofei.top.command;

import wuchaofei.top.executor.AdbExecutor;

/**
 * Created by cofco on 2018/1/18.
 */

public class ScreenshotCommand implements Command {
    AdbExecutor executor;
    public ScreenshotCommand(AdbExecutor executor){
        this.executor= executor;
    }

    @Override
    public void execute() {
        executor.screenshot();
    }
}
