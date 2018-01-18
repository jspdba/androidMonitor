package wuchaofei.top;

/**
 * 点击命令对象
 * Created by cofco on 2018/1/18.
 */

public class SwipeCommand implements Command, Cloneable{
    int x=0, y=0, x1=0, y1=0;
    CommandExecutor executor;
    public SwipeCommand(int x, int y, int x1,int y1,CommandExecutor executor){
        this.x=x;
        this.y=y;
        this.x1=x1;
        this.y1 = y1;
        this.executor = executor;
    }

    @Override
    public SwipeCommand clone() {
        SwipeCommand clickCommand = null;
        try {
            clickCommand = (SwipeCommand)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clickCommand;
    }

    @Override
    public void execute() {
        executor.swipe(x,y,x1,y1);
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
