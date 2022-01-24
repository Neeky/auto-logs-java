## 背景

这是一个 spring-aop 的 hello world 项目，主要完成的一个功能是在调用接口的时候打印执行前、执行后的日志。

---
## 调用
```bash
curl http://127.0.0.1:8080/hello
```
---

## 效果
```bash
2022-01-24 11:47:44.210  INFO 34993 --- [nio-8080-exec-1] com.example.demo.aspects.LogAspect       : com.example.demo.controllers.HelloController.hello 开始执行
2022-01-24 11:47:44.219  INFO 34993 --- [nio-8080-exec-1] c.e.demo.controllers.HelloController     : /hello 中的业务逻辑执行中
2022-01-24 11:47:44.220  INFO 34993 --- [nio-8080-exec-1] com.example.demo.aspects.LogAspect       : com.example.demo.controllers.HelloController.hello 执行完成
```

---

