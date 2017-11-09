# WebTemplate
![](/image/build-passing-brightgreen.svg)

这是一个用于快速构建网站的模板。使用技术如下：
1. spring框架：
	1. spring mvc
	2. spring boot
2. mybatis，轻量级ORM框架。
3. druid，数据库连接池。
## 包结构
包结构如下：<br>
![](/image/resttemplate-package.PNG)

包结构解释如下：
- aop spring aop切面
	- ExceptionAdice 拦截HTTP请求异常（未测试）
- common 通用枚举类型、常量等
- conf 配置文件类
- controller controller层转发类
- dao 数据库访问类(CRUD)
	- mapper mybatis映射类
- domain Java POJO对象（数据库访问ORM，映射类）
	- properties application.properties中自定义配置映射类
	- vo 页面映射类，防止数据库模型直接展示在页面上，做一层数据转换
	- service 业务逻辑类
- utils 工具包类
- resources 资源包
	- application.properties 包含spring统一配置文件
	- mapper mybatis数据映射对应的xml配置文件
	- public 静态资源文件（html、css、js）
	- sql 数据库脚本
	- yaml 与application.properties对应的yaml格式配置文件
- test 测试类，与src包底下一一对应

## 使用
1. 导入maven包(已经配置pom文件，maven install)；
1. 运行sql包下的数据库脚本，配置对应访问的数据库；
2. 修改application.properties中的数据库信息和服务器端口等信息；
3. 运行spring boot run。

> 建议使用IDEA将项目导入