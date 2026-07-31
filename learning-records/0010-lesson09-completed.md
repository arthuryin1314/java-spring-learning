# Lesson 0009 完成:Map / HashMap

## 练习 1

`GradeBook.java` 全部正确:put 三个学生、覆盖更新 Alice(90→100)、containsKey 检查不存在的 Jack 打印 false、entrySet for-each 遍历打印、getOrDefault 查不存在的 David 返回默认值 0。编译运行通过。

## 练习 2(找错/预测题)

用户最初回答"返回 null 所以打印出 null",遗漏了关键一步:null 赋值给 `int` 变量会触发自动拆箱 `null.intValue()`,直接 NullPointerException,走不到 println。

经提示后用户正确归因:Map 的值类型是 `Integer`,get 返回 null,赋值给 int 拆箱就炸——主动关联到第 7 课 ArrayList 里同样的 null 拆箱 NPE 陷阱。

## 课堂互动

- 用户对 `Map.Entry<String, Integer>` 的遍历语法不熟悉,解释了三个层次:for-each 通用语法 → entrySet() 返回值是键值对集合 → Map.Entry 作为嵌套类型的 getKey()/getValue() 用法,同时类比对 Python `for k,v in d.items()` 和 TS 的解构,强调 Java 没有语法层解构所以需要 Entry 对象。

## Implications

- Map 基本操作(put/get/containsKey/remove/getOrDefault/entrySet)已掌握
- 包装类 null 拆箱的坑在 Map 场景下再次验证,链接到了第 7 课的知识点——这个坑已经两次碰到了,后续 Spring Boot 里从数据库/Redis 读数据时的 null 处理会继续碰到
- HashMap 不保证顺序这一点提到了但没有在练习里验证——后续讲 TreeMap/LinkedHashMap 时可以回来对比
- 下一课可以进入更综合的内容:可能是 foreach 遍历集合修改(ConcurrentModificationException)、异常处理(try-catch)、或者 MISSION 方向下的 Stream/流式处理基础
