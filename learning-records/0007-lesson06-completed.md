# Lesson 0006 完成:集合类型 ArrayList

## 练习 1

`CourseRoster.java` 第一版遗漏了 `add(0, ...)` 和 `println(students.size())` 两个要求,被指出后自行补上。最终版编译运行正确:输出 `Mike / Alice / Charlie / 3`。

## 练习 2(找错/设计题: Integer→int 赋值)

用户的核心判断正确——代码编译通过、运行正常。但对机制的描述不精确:用户说"中间执行的时候会变成 int",实际是 `scores.get(0)` 返回 `Integer` 对象,赋值给 `int first` 时 Java 编译器自动插入拆箱代码(`Integer.intValue()`),这不是"执行过程中慢慢变的",而是编译器在生成字节码时就处理好了。

用户对约束的直觉是对的:ArrayList 只能装对象类型所以要用 `Integer`,但取出来赋值给 `int` 也能正常工作。

这机制叫**自动装箱(autoboxing)/自动拆箱(unboxing)**,和 Lesson 02 学的数值类型拓宽转换(int→double)是两回事——装箱/拆箱是在基本类型和其包装类之间转换,不是数值类型之间。

## Implications

- ArrayList 基本 API(add/get/remove/size/contains)和 for-each 遍历一次性验证通过,可以进入下一课。
- 用户对"自动拆箱"只有直觉、没有准确命名和机制理解——这是正常的,下一课(包装类)会正式展开 Integer/Double/Boolean 这些包装类型和自动装箱/拆箱的完整规则。本课只需要知道"有这回事、能跑通"即可。
- 用户习惯先跑代码再确认答案(而不是先推理再验证),练习 2 的描述偏模糊("不能咬定正确答案但觉得没问题"),后续可以继续强化"先预测再验证"的习惯,遇到不确定的规则时多问一句"Java 具体在干什么"而不是停留在"能不能跑"。
