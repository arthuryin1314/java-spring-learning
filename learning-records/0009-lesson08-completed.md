# Lesson 0008 完成:String 方法与不可变性

## 练习 1

`StringWorkshop.java` 正确完成五项操作:trim、toLowerCase、contains("@")判断、indexOf("@")打印下标、substring 截取用户名。初始版本遗漏了打印 indexOf 的 index 值(只有截取),补上后输出 `合法邮箱 / 4 / user` 全部正确。

## 练习 2(概念解释)

用户正确回答 String 用 `.equals()` 比较内容、int 用 `==` 比较值。在追问"为什么"时,初始归因偏向"String 不可变所以不能 ==",被纠正为根本原因是**基本类型 vs 引用类型**的差异——基本类型变量直接存值,引用类型变量存的是对象地址,== 对引用类型比对象地址而非内容。

更深层的问题还没覆盖:String 和 Integer 都覆写了 `equals()` 来做内容比较,但 ArrayList 的 `equals()` 也在比元素内容——这套"equals 契约"会在后续学到自定义类时自然展开。

## 三道课堂小测

1. `s.toUpperCase()` 没赋值就丢弃,`s = s + "!"` 是重新赋值不是修改原对象——用户理解了"不可变 = 对象不能改,变量可以重新指向新对象"
2. `trim()` 只管首尾空格,中间空格保留——用户漏掉 `substring(2,7)` 中的中间空格,选了 `hello`(正确答案是 `llo w`),已指出 trim 的范围
3. `==` 对比 String 字面量——用户选了 `false,false`,实际是 `true,false`(字面量常量池复用),对常量池机制印象不深

## Implications

- `length()` vs `.length`、`charAt()` 无 `[]` 语法、`trim()` 语义均已通过练习验证
- `==` vs `equals()` 的区分在概念层面已建立,但常量池细节容易忘——后续带自定义类的 equals/hashCode 会再次碰到,可以不急于在本课完全掌握
- for-each 赋值给当前值的坑(拿值当下标用)已在练习过程中遇到并纠正——后续讲 Map 之类需要区分键和值的场景可能会再次触发,届时顺带提醒
- 可以进入下一课:多重结构——`List<List<Integer>>` 或 `Map<String, List<String>>` 等嵌套集合,结合已经学过的 ArrayList、for-each、包装类做综合性应用
