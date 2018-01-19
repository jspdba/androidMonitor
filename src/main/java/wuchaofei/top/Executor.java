package wuchaofei.top;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 命令调用者
 * Created by cofco on 2018/1/18.
 */

public abstract class Executor {
    protected static void callCmd(String ...cmd) throws Exception{
        Process process = null;
        for (int i=0;i<cmd.length;i++){
            System.out.println(cmd[i]);
            process = Runtime.getRuntime().exec(cmd[i]);

            InputStream input = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String line;
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
            reader.close();
            process.waitFor();
        }
        if(process!=null){
            process.destroy();
        }
    }
}
