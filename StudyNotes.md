##Java学习笔记
---
##001.HelloWorld
###编码规范
* Java中package规范是首字母小写
* .net中名称空间命名规范是首字母大写
* 类名命名规范一致
* 方法命名规范是Java首字母小写，.NET首字母大写
* Java中main方法必须是小写，方法和类都必须是public
* .net中Main方法必须为大写，public和private无所谓
###开发工具项目相关文件
####eclipse
* .classpath 定义依赖文件的位置
* 源文件的具体位置（kind="src"）
* 运行的系统环境（kind="con"）
* 工程的library的具体位置信息(kind="lib") 
* .project 保存项目名称等信息
* eclipse添加引用编译路径Properties->Java Build Path,也可以修改源代码路径，默认在（appClientModule）

可以参考文献
[eclipse的工程配置（.classpath和.project）文件的作用 http://swiftlet.net/archives/1214](http://swiftlet.net/archives/1214)
## 002.Type
默认情况下，类型转换和运算溢出都不抛异常
.net可以通过checked和unchecked检测
Java好像没有类似的检测
http://stackoverflow.com/questions/3001836/how-does-java-handle-integer-underflows-and-overflows-and-how-would-you-check-fo





