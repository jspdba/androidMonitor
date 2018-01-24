package wuchaofei.top.template;

import org.apache.commons.lang3.StringUtils;
import wuchaofei.top.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取解锁命令模板类
 * Created by cofco on 2018/1/23.
 */

public class CommandTemplate extends AbstractCommandTemplate {
    private static CommandTemplate commandTemplate = new CommandTemplate();
    private CommandTemplate(){}
    private boolean ifOpenPower = true;

    public static CommandTemplate getInstance(){
        return commandTemplate;
    }
    @Override
    List<Point> setPoints() {
        List<Point> pointList=new ArrayList<Point>();
        pointList.add(new Point(240,1020));
        pointList.add(new Point(540,1020));
        pointList.add(new Point(540,1320));
        pointList.add(new Point(840,1320));
        return pointList;
    }

    @Override
    protected boolean ifOpenPower() {
        return ifOpenPower;
    }

    @Override
    protected String setPreffix() {
        return super.setPreffix();
    }

    public void setIfOpenPower(boolean ifOpenPower) {
        this.ifOpenPower = ifOpenPower;
    }

    /**
     * 执行批处理命令
     * @param args
     * @return
     */
    public String runBatch(String ...args){
        return StringUtils.join(args, " ");
    }
}
