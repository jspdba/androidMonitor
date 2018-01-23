package wuchaofei.top;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 命令调用者
 * Created by cofco on 2018/1/18.
 */

public abstract class Executor {
    public static String ADB_PATH  = "d:/zhongliang/adb/";

    protected void callCmd(String ...cmd) throws Exception{
        Process process = null;
        for (int i=0;i<cmd.length;i++){
            System.out.println(cmd[i]);
            process = Runtime.getRuntime().exec(cmd[i],null, new File(ADB_PATH));
            process.waitFor();
            InputStream input = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String line;
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
            reader.close();
        }
        if(process!=null){
            process.destroy();
        }
    }
    protected void callCmd(String command) throws Exception{
        System.out.println(command);
        Process process = Runtime.getRuntime().exec(new String[]{"cmd", "/C", command},null, new File(ADB_PATH));
        /*InputStream input = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String line;
        while ((line = reader.readLine())!= null) {
            System.out.println(line);
        }
        reader.close();
        process.waitFor();
        if(process!=null){
            process.destroy();
        }*/
        BufferedReader stdoutReader = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
        BufferedReader stderrReader = new BufferedReader(new InputStreamReader(process.getErrorStream(),"GBK"));
        String line;
        while ((line = stdoutReader.readLine()) != null) {
            System.out.println(line);
        }
        while ((line = stderrReader.readLine()) != null) {
            System.out.println(line);
        }
        int exitVal = process.waitFor();
        System.out.println(exitVal);
        process.destroy();
    }
}
