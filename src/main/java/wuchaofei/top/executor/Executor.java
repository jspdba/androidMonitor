package wuchaofei.top.executor;

import java.io.*;

/**
 * 命令调用者
 * Created by cofco on 2018/1/18.
 */

abstract class Executor {
    public static String ADB_PATH  = "d:/zhongliang/adb/";
    private OutputStream os;

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
    protected String callCmd(String command) throws Exception{
        System.out.println(command);
        /*if(os==null){
            Process process = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/C", "su"}, null, new File(ADB_PATH));
            os=process.getOutputStream();
        }
        os.write(command.getBytes());
        os.flush();*/
        final Process process = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/C", command},null, new File(ADB_PATH));
        BufferedReader stdoutReader = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
        String line, result = "";

        while ((line = stdoutReader.readLine()) != null) {
            System.out.println(line);
            result += line;
        }

        /*为"错误输出流"单独开一个线程读取之,否则会造成标准输出流的阻塞*/
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                BufferedReader stderrReader = null;
                try {
                    String line;
                    stderrReader = new BufferedReader(new InputStreamReader(process.getErrorStream(),"GBK"));
                    while ((line = stderrReader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        process.waitFor();
        process.destroy();
        return result;
    }
}
