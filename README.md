# TV_FocusView TV焦点移动处理

实现原理：再当前窗口新建View（伪焦点），负责展示焦点移动，当某一组件获取到焦点时，该view便移动到该view上

1.兼容按键和空鼠模式
2.焦点移动流畅，不卡顿
3，API提取，便于使用
