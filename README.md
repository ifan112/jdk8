为了在运行测试类时使用并且可调试当前项目中的 jdk 源码，需要做如下处理：


1️⃣

运行测试类时添加虚拟机参数 `-Xbootclasspath/p:"target/classes"`，即告诉 JVM 从编译后的 `target/classses` 目录加载类。

![](https://tva1.sinaimg.cn/large/007S8ZIlgy1ghi747yjnmj315b0u078s.jpg)


2️⃣

修改 SDK 的 **Sourcepath**，删除默认的源码包文件 src.zip，添加当前项目的 **src** 目录，这样在 Debug 时就可以进入项目中的源码文件了。

![](https://tva1.sinaimg.cn/large/007S8ZIlgy1ghi787nce5j310p0u0jul.jpg)




