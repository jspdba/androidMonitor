```
    模拟滑动轨迹（开始于[100,200]，止于[108,300]）
    adb shell sendevent /dev/input/event0 3 0 100 //鼠标移到x坐标100
    adb shell sendevent /dev/input/event0 3 1 200 //鼠标移到y坐标200
　　
    adb shell sendevent /dev/input/event0 1 330 1 //鼠标按下
    adb shell sendevent /dev/input/event0 0 0 0    //同步
　　
    adb shell sendevent /dev/input/event0 3 0 101 //鼠标移到x坐标101
    adb shell sendevent /dev/input/event0 0 0 0    //同步

    ……………………     //需一点一点移动，这里省略

    adb shell sendevent /dev/input/event0 3 0 108 //鼠标移到x坐标108
    adb shell sendevent /dev/input/event0 0 0 0   //同步
　　
    adb shell sendevent /dev/input/event0 1 330 0 //鼠标抬起
    adb shell sendevent /dev/input/event0 0 0 0   //同步

```
adb命令
    查看设备事件定义
    adb shell cat /proc/bus/input/devices
    查看某设备实时事件
    adb shell getevent -l /dev/input/event5
    
>https://www.jianshu.com/p/72f32fd571c0
参考
[adb shell 模拟发送按键](http://blog.sina.com.cn/s/blog_8acf1be10102w01x.html)
[Android跨进程模拟触屏事件(sendevent)](http://azard.me/blog/2015/06/13/android-cross-app-touch-event-injection/)
[android测试之getevent/sendevent](http://blog.51cto.com/sunzeduo/1294839)
[Android 内核 MT 笔记 测试数据](https://www.hongweipeng.com/index.php/archives/972/)
[Android 屏幕操作原理](http://blog.csdn.net/crasheye/article/details/51321096)


cmd.exe /C start /b D:\\test.bat
