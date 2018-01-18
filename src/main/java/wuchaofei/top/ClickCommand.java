package wuchaofei.top;

/**
 * 点击命令对象
 * Created by cofco on 2018/1/18.
 */

public class ClickCommand implements wuchaofei.top.Command, Cloneable{
    int x=0, y=0;
    wuchaofei.top.CommandExecutor executor;

    public ClickCommand(int x,int y, wuchaofei.top.CommandExecutor executor){
        this.x=x;
        this.y=y;
        this.executor = executor;
    }

    @Override
    public ClickCommand clone() {
        ClickCommand clickCommand = null;
        try {
            clickCommand = (ClickCommand)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clickCommand;
    }

    @Override
    public void execute() {
        executor.click(x,y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
