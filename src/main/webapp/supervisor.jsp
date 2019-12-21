<%@ page language="java" pageEncoding="utf-8"%>
<%-- <%@ taglib uri="/struts-tags" prefix="s"%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="supervisorClassesFindAll.action" method="post">
	<a href="supervisorClassesAdd.jsp">创立班级</a>
	<table border="1" width="800" >
		<caption>班级管理</caption>
		<tr>
			<th>序号</th>
			<th>班级名称</th>
			<th>班级类型</th>
			<th>班主任</th>
			<th>阶段</th>
			<th>教师</th>
			<th>主管</th>
		</tr>
		
<!-- 		<s:iterator value="classes" status="i">
			<tr>
				<th><s:property value="#i.count" /></th>
				<th><s:property value="cname" /></th>
				<th><s:property value="ctype" /></th>
				<th><s:property value="headmaster.hid" /></th>
				<th><s:property value="stage.sid" /></th>
				<th><s:property value="#teacher.tname" /></th>
				<th><s:property value="supervisor.supid" /></th>
			</tr>
		</s:iterator> -->
		
		<c:forEach items="${classes }" var="c" varStatus="i">
			<tr>
				<th>${i.count }</th>
				<th>${c.cname }</th>
				<th>${c.ctype }</th>
				<th>${c.headmaster.hid }</th>
				<th>${c.stage.sid }</th>
				<th>${c.teacher.tname }</th>
				<th>${c.supervisor.supid }</th>
			</tr>
		</c:forEach>
		
	</table>
</form>
</body>
</html>