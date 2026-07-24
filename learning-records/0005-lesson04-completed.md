# Lesson 0004 完成:for/while 循环与 break/continue

## 练习 1(FizzBuzz,1~20)

用户口头/书面给出的完整序列与正确答案逐项一致(1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz),`for` 循环 + `%` 取余判断整除的逻辑没有问题。

## 练习 2(while + continue + break 口算预测)

正确推导出输出 `1 3 5`:偶数被 `continue` 跳过不打印,`i` 到 7 时触发 `i > 6` 的 `break` 提前结束循环。continue 和 break 的区别(跳过本轮 vs 整体终止)已经分清楚,没有混淆。

## Implications

- `for`/`while`/`break`/`continue` 四个核心循环概念一次性全部验证通过,没有遗留误区,可以正常往下一课推进(集合类型 Array/List 会大量用到循环遍历,是很自然的衔接)。
- 用户现在对"先口算/预测,再验证"这个流程已经很熟练,没有再出现直接跑代码不过脑子的情况,后续预测类练习可以适当加大复杂度。
