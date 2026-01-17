# LeetCode-Java

基于 IntelliJ IDEA + LeetCode Editor 插件的算法练习仓库。

## 📁 目录说明

* **`src/main/java/leetcode/editor/cn/`**: 存放 Java 题解源码，支持本地 `main` 方法调试。
* **`src/main/java/leetcode/editor/cn/doc/`**: 自动生成的题目描述文档 (Markdown)。
* **`src/main/java/leetcode/editor/common/`**: 存放 `ListNode`、`TreeNode` 等公共数据结构。

## 💡 Java 核心笔记

在刷题与项目实践中，重点验证并记录了以下 Java 特性：

* **包装类缓存 (Wrapper Cache)**：验证了 `Integer` 在 `-128~127` 范围内的对象复用机制，理解了为什么在该范围内 `==` 返回 true 而范围外返回 false。
* **类型检查与格式化**：记录了 Java `printf` 严格的类型校验，例如 `%d` 强制要求整数类型，传入 `char` 会触发 `Runtime error`。
* **配置安全解耦**：在项目配置中实践了 `${OSS_AK:default}` 占位符配合环境变量注入的写法，确保敏感密钥（如阿里云 OSS）不被上传至 GitHub。

## 🛠️ 环境要求
* JDK 17+
* Maven
* IntelliJ IDEA