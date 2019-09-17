<%--
  Created by IntelliJ IDEA.
  User: 刘环
  Date: 2019/9/17
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登陆页面</title>

  </head>
  <body>
  <h3>这里是response的跳转用户名<%=session.getAttribute("username")%></h3>
  <a href="login.html" target="_blank">点击返回登陆</a>
 </form>
  </body>
</html>
