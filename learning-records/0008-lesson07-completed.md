# Lesson 0007 完成:包装类与自动装箱/拆箱

## 练习 1

`ScoreSheet.java` 经过三轮迭代:
1. 初版用 for-each 但拿元素值当下标 → `IndexOutOfBoundsException`,用户自己定位了问题
2. 修正为普通 for,但循环条件写成了 `<=`(多跑一轮)+ 平均分用整数除法 + `avg_score` 缺少类型声明
3. 最终版:循环条件修正为 `<`,平均分改为 `(double) total / scores.size()`,类型声明补全,故意在列表末尾加 `null` 触发空指针异常并用注释说明原因

编译通过,运行到 null 拆箱时正确抛出 `NullPointerException`。用户对 `(double)` 强制转换 vs 整数除法的理解关键问题("为什么左边声明了 double 右边还要加 double")自己追问并搞懂了——Java 不看左边来决定右边怎么算。

过程中还学到了 IDEA 断点调试:红色断点只在 Debug 模式(虫子图标)生效,Run 模式不给停。

## 练习 2(找错:遍历含 null 的 List 做拆箱累加)

用户正确判断:编译通过,运行到 `sum += scores.get(i)` 时 null 拆箱炸 `NullPointerException`。

## Implications

- 包装类与基本类型的核心区别(int vs Integer)已建立,装箱/拆箱的编译期本质("编译器插代码,不是运行时慢慢变")已讲清楚
- `==` vs `equals` 的 Integer 缓存陷阱(-128~127)课件里讲过了,但本课练习没有覆盖到——后续复习时可以出这类的预测题
- IDEA Debug 模式的基本操作(断点、Step Over)首次使用,用户已会用虫子图标启动调试,后续练习可以更多利用断点而不是 print 排查
- 数值类型转换 + 包装类搞完后,整数除法和强制类型转换的规则需要多次练习才能成为肌肉记忆——后续练习中持续出现
- 可以进入下一课:String 方法与不变性,和包装类形成对比(都是引用类型,但 String 在 Java 里是不可变对象)
