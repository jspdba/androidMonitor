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
>https://www.jianshu.com/p/72f32fd571c0

240 1020
540 1020
540 1320
840 1320

adb shell getevent /dev/input/event5
