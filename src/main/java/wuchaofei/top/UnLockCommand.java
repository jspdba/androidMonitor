package wuchaofei.top;

/**
 * 点击命令对象
 * Created by cofco on 2018/1/18.
 */

public class UnLockCommand implements Command {
    AdbExecutor executor;

    public UnLockCommand(AdbExecutor executor){
        this.executor = executor;
    }

    @Override
    public void execute() {
        executor.unLock();
    }
}
