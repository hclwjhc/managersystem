<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1" width="1200" align="center">
		<caption style="font-size: xx-large;">学生信息</caption>
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
			<th>操作</th>
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
				<th><a href="findCheckRecord.action?crid=${checkrecord.crid}">查看考勤</a>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
					href="findOneExam.action?erid=${examrecord.erid}">查看考试成绩</a>
				</th>
			</tr>
		</s:iterator>
	</table>


</body>
</html>