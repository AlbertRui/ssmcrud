# SSM-CRUD
## 案例简介
### 意义
* ssm:SpringMVC+Spring+MyBatis
* CRUD：Create（创建）、Retrieve（查询）、Update（更新）、Delete（删除）
### 功能点
* 分页
* 数据校验
* jquery前端校验+JSR303后端校验
* ajax
* Rest风格的URI；使用HTTP协议请求方式的动词，来表示对资源的操作（GET（查询），POST（新增），PUT（修改），DELETE（删除））
### 技术点
* 基础框架-ssm（SpringMVC+Spring+MyBatis）
* 数据库-MySQL
* 前端框架-bootstrap快速搭建简洁美观的界面
* 项目的依赖管理-Maven
* 分页-pagehelper
* 逆向工程-MyBatis Generator
### 基础环境搭建
* 创建一个maven工程
* 引入项目依赖的jar包
    * spring
    * springmvc
    * mybatis
    * 数据库连接池，驱动包
    * 其他（jstl，servlet-api，junit）
* 引入bootstrap前端框架
* 编写ssm整合的关键配置文件
    * web.xml，spring,springmvc,mybatis，使用mybatis的逆向工程生成对应的bean以及mapper
* 测试mapper
### 最终页面效果
![image](/images/001.PNG)
## 案例开发过程
### 查询
#### 查询分析
* 访问index.jsp页面
* index.jsp页面发送出查询员工列表请求
* EmployeeController来接受请求，查出员工数据
* 来到list.jsp页面进行展示
* pageHelper分页插件完成分页查询功能
* URI：/emps
#### 查询-ajax
* index.jsp页面直接发送ajax请求进行员工分页数据的查询
* 服务器将查出的数据，以json字符串的形式返回给浏览器
* 浏览器收到js字符串。可以使用js对json进行解析，使用js通过dom增删改改变页面。
* 返回json。实现客户端的无关性。
### 新增
#### 新增页面效果
![image](/images/002.PNG)
#### 新增-逻辑
* 在index.jsp页面点击”新增”
* 弹出新增对话框
* 去数据库查询部门列表，显示在对话框中
* 用户输入数据，并进行校验
    * jquery前端校验，ajax用户名重复校验，重要数据（后端校验(JSR303)，唯一约束）；
* 完成保存
* URI:
    * /emp/{id}GET 查询员工
    * /emp POST 保存员工
    * /emp/{id} PUT 修改员工
    * /emp/{id} DELETE 删除员工
### 修改
#### 修改页面效果
![image](/images/003.PNG)
#### 修改-逻辑
* 点击编辑
* 弹出用户修改的模态框（显示用户信息）
* 点击更新，完成用户修改
### 删除
#### 删除页面效果
![image](/images/004.PNG)
#### 删除-逻辑
* 单个删除（是批量删除的特例）
    * URI:/emp/{id} DELETE
* 批量删除（根据id批量删除，与单个删除合一）
### 总结
![image](/images/005.png)