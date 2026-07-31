# Lesson 0010 完成:异常处理 try-catch

## 练习 1

`SafeDivider.java` 全部正确:用 `Integer.parseInt(args[0]+args[1])` 从命令行参数读取两个数做除法,
用多重 catch 区分 `NumberFormatException`（输入不是数字）和 `ArithmeticException`（除数不能为0）,
finally 打印"计算结束"。三种输入 (`100 5` / `100 abc` / `100 0`) 均编译运行通过,finally 在所有路径下都执行了。

## 练习 2（找错题）

用户准确指出了空 catch 的两个问题:
1. 技术层面 — `null.length()` 抛 NPE 被吞掉,最后 println 假装"用户名长度获取完毕"
2. 工程层面 — catch Exception 太宽泛 + 空块体 = 所有异常悄然无声地被吃掉,线上出问题无法排查

## 课堂互动

- 用户对 `catch (ArithmeticException e)` 语法不理解,拆解为"异常类型 + 变量名",类比方法参数声明
- 用户对 `main(String[] args)` 的 args 来源不理解,解释了命令行传参和 IDEA Program arguments 的关系,并确认 main 签名是 JVM 规定的不需要修改
- 用户询问 `Integer.parseInt` 是否是唯一的字符串转数字方式,确认了各包装类的 parseXxx 方法
- 用户询问 Program arguments 的实际使用场景,说明了主要用于练习调试和 Spring Boot 启动参数,大部分时候 args 是空的

## Implications

- try-catch-finally 基本用法掌握,多重 catch 的顺序规则理解了(具体在前,宽泛在后)
- "空 catch 块是坏习惯"这个意识已建立——后续 Spring Boot 全局异常处理时会再次碰到这个主题
- 命令行 args 的用法已验证,后续讲 Maven/Spring Boot 时还会接触到运行参数
- 现在已覆盖:数组、ArrayList、包装类/拆箱、String 不可变性、HashMap、异常处理——Java 语法基础阶段接近尾声
- 下一课可以转向 OOP 核心:自定义类、构造方法、this——这是从"用 Java 的类型"到"定义自己的类型"的关键一步,也是 Spring Boot 中 Service/Controller/Entity 的概念基础
