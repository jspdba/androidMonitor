package wuchaofei.top;

/**
 * Created by cofco on 2018/1/18.
 */

public class ScreenshotCommand implements Command {
    CommandExecutor executor;
    public ScreenshotCommand(CommandExecutor executor){
        this.executor= executor;
    }

    @Override
    public void execute() {
        executor.screenshot();
    }
}
