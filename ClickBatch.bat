@echo off
set time=0
rem ************begin
:continue
set /a time+=1
echo the %time% time
Wscript D:/zhongliang/androidMonitor/sleep.vbs
echo %1% %2%
adb shell input tap "%1" "%2"
if %time% lss 5 goto continue
rem ************end
echo over