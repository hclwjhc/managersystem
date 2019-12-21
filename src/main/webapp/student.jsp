<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="800">
		<caption>照片管理</caption>
		<tr>
			<th>序号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>身份证</th>
			<th>入学时间</th>
			<th>联系电话</th>
			<th>地址</th>
			<th>毕业时间</th>
			<th>毕业学校</th>
			<th>所学专业</th>
			<th>考勤记录</th>
			<th>考试记录</th>
			<th>班主任</th>
			<th>教师</th>
			<th>班级</th>
			<th>阶段</th>
		</tr>
		<s:iterator value="stus" status="i">
		<tr>
			<th><s:property value="#i.count" /></th>
			<th><s:property value="stuname" /></th>
			<th><s:property value="sex" /></th>
			<th><s:property value="idcard" /></th>
			<th><s:property value="intime" /></th>
			<th><s:property value="phone" /></th>
			<th><s:property value="address" /></th>
			<th><s:property value="edutime" /></th>
			<th><s:property value="school" /></th>
			<th><s:property value="domain" /></th>
			<th><s:property value="crid" /></th>
			<th><s:property value="erid" /></th>
			<th><s:property value="hid" /></th>
			<th><s:property value="tid" /></th>
			<th><s:property value="cid" /></th>
			<th><s:property value="sid" /></th>
		</tr>
		</s:iterator>
	</table>
	
</body>
</html>