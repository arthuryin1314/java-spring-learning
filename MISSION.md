# Mission: Java + Spring Boot 后端开发

## Why
用户目前维护一个 Vue + TypeScript + FastAPI 的项目，后端代码基本由 AI 代写，自己看得懂但写不出来。目标是真正掌握 Java 和 Spring Boot，让自己能够独立编写和维护后端核心业务逻辑，并逐步把现有 FastAPI 项目中的常规业务迁移到 Spring Boot，最终形成 Spring Boot（核心业务）+ FastAPI（Agent / RAG / 模型调用）的双后端架构。

## Success looks like
- 能不借助 AI，独立读写 Java 面向对象代码（类、接口、继承、多态、封装）
- 熟练使用集合、泛型、Stream、异常处理，写出符合 Java 习惯（idiomatic）的代码
- 会用 Maven 管理依赖和项目结构，理解常见生命周期命令
- 会写并运行 JUnit 测试，把测试作为验证手段而不是可选项
- 理解基本并发（线程、线程池、常见线程安全问题）和 JVM 基础（内存模型、GC 概念），足以排查真实问题
- 能独立搭建 Spring Boot 项目，实现 REST API、数据库访问（Spring Data JPA）、参数校验、异常处理、简单的鉴权
- 能把现有 FastAPI 项目里的一个真实业务模块（例如课程/用户/权限/学习记录相关）迁移到 Spring Boot，并跑起来、通过测试

## Constraints
- 已完成/在学 TypeScript，会 Python、Vue，有数据库和前后端项目经验，但从未系统学过 Java —— 通用编程概念（变量、函数、控制流、面向对象基本概念）可以快速过，不必从零讲
- 学习方式沿用 TypeScript 阶段的 `/teach` 规则：手动敲代码、闭卷编写、先给报错解释再给最小提示、不主动给完整代码、检测方式多样（读代码/预测结果/改错/闭卷编码/小设计题）
- 每节课只讲一个范围明确的知识点，配合可自动验证的练习（编译通过 / 运行结果 / 单元测试）
- 需要间隔复习和交错练习，且根据实际表现动态调整难度
- 练习场景优先贴近后端真实业务：课程、用户、权限、学习记录等，避免大量无关算法题
- 优先使用现代 Java 官方文档和高可信资料，不用过时或来源不明的教程
- 环境：Windows 11 + Git Bash，本次会话另外安装了 Eclipse Temurin JDK 21（LTS）和 Apache Maven

## Out of scope
- 暂不深入 JVM 调优、GC 算法细节等高级性能主题（先建立基础用法和概念性理解即可）
- 暂不学习其他 JVM 语言（Kotlin、Scala）
- Spring Boot 生态中与当前迁移目标无关的模块（如 Spring Cloud 微服务全家桶、消息队列等）暂不安排，等核心业务迁移稳定后再评估
- Agent / RAG / 模型调用相关内容继续留在 FastAPI 侧，不在本 mission 范围内
