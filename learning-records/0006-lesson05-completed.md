# Lesson 0005 完成:数组(Array)

## 练习 1

`ScoreAnalyzer.java` 三小问全部正确:数组长度 7、平均分整数除法结果 72、for-each 遍历打印及格分数(85/92/63/78/90)。用户闭卷手写并跑通验证。

## 练习 2(找错:`arr[3]` 越界,数组长度为 3)

用户最初的表述是"排序是 0,1,2 没有 3 所以报错",只覆盖了越界的事实,没有直接回答题目问的"编译期还是运行期"。追问后用户正确选择"编译通过,运行时才报错"。

实际验证:
```
编译通过
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
```

## Implications

- 数组越界检查是运行期行为(`ArrayIndexOutOfBoundsException`),不是编译期——因为下标合法性依赖运行时才知道的数组长度,编译器无法静态分析。这和 Python(`IndexError`,同样运行期)、TS/JS(越界访问返回 `undefined`,不报错不崩溃)的语义都不同,Java 是三者中最严格的(直接终止程序)。
- 用户描述错误现象时容易只说"哪里错了"而不主动区分"什么阶段报错"——这是本课程反复强调的编译期/运行期区分的具体应用场景,后续遇到类似"这段代码会怎样"的问题时可以主动追问阶段。
- 数组核心概念(声明、固定长度、下标越界、for-each vs 普通 for)一次性验证通过,可以进入下一课(集合类型 ArrayList,和数组做直接对比:可变长度 vs 固定长度)。
