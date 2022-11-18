<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
   <%
      request.setCharacterEncoding("utf-8");
      String msg=request.getParameter("msg");
      System.out.println("msg:"+msg);
   %>
   <p>ㅇ</p>
</body>
</html>