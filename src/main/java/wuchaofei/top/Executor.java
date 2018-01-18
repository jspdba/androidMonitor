package wuchaofei.top;

/**
 * 命令调用者
 * Created by cofco on 2018/1/18.
 */

public abstract class Executor {
    protected void callCmd(String ...cmd) throws Exception{
        Process process;
        for (int i=0;i<cmd.length;i++){
            System.out.println(cmd[i]);
            process = Runtime.getRuntime().exec(cmd[i]);
            process.waitFor();
        }
    }
}
