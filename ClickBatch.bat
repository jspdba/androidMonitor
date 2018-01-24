@echo off
set time=0
rem ************begin
:continue
set /a time+=1
adb shell input tap "%1" "%2"
echo the %time% time
rem Wscript D:/zhongliang/androidMonitor/sleep.vbs
if %time% lss 120 goto continue
rem ************end
echo over