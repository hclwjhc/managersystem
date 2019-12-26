<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>教育主管页面</title>
</head>
<body>
	<form action="supervisorClassesFindAll.action" method="post"
		style="margin-left: 260px">
		<table border="1" width="800">
			<caption>
				<font size="10">班级管理</font>
			</caption>
			<tr>
				<th>序号</th>
				<th>班级名称</th>
				<th>班级类型</th>
				<th>班主任</th>
				<th>阶段</th>
				<th>教师</th>
				<th>主管</th>
				<th>评职变动</th>
			</tr>

			<s:iterator value="classes" status="i">
				<tr>
					<th><s:property value="#i.count" /></th>
					<th><s:property value="cname" /></th>
					<th><s:property value="ctype" /></th>
					<th><s:property value="headmaster.hid==1?'朱敏':'郭采洁' " /></th>

					<s:if test="stage.sid==1">
						<th><s:property value="stage.sid==1?'第一阶段':'1' " /></th>
					</s:if>
					<s:if test="stage.sid==2">
						<th><s:property value="stage.sid==2?'第二阶段':'2' " /></th>
					</s:if>
					<s:if test="stage.sid==3">
						<th><s:property value="stage.sid==3?'第三阶段':'3' " /></th>
					</s:if>
					<s:if test="stage.sid==4">
						<th><s:property value="stage.sid==4?'第四阶段':'4' " /></th>
					</s:if>

					<th><s:property value="teacher.tid==1?'潘峰讲师':'郭琳瑛讲师' " /></th>
					<th><s:property value="supervisor.supid==1?'Boss':'1' " /></th>
					<th>
						<a class="btn btn-info btn-xs" href="teacherFindAll.action?classess.cid=<s:property value="cid" />">教师调动</a>
						<a class="btn btn-info btn-xs" href="headmasterFindAll.action?classess.cid=<s:property value="cid" />">班主任调动</a>
					</th>
				</tr>
			</s:iterator>
		</table>
		<a href="supervisorClassesAdd.jsp">创立班级</a> <a> <select
			name="classess.stage.sid" class="form-control">
				<option>阶段负责老师信息</option>
				<option value="1">第一阶段</option>
				<option value="2">第二阶段</option>
				<option value="3">第三阶段</option>
				<option value="4">第四阶段</option>
		</select>
		</a>
	</form>
</body>
</html>



<%-- <c:forEach items="${classes }" var="c" varStatus="i">
			<tr>
				<th>${i.count }</th>
				<th>${c.cname }</th>
				<th>${c.ctype }</th>
				<th>${c.headmaster.hid }</th>
				<th>${c.stage.sid }</th>
				<th>${c.teacher.tname }</th>
				<th>${c.supervisor.supid }</th>
			</tr>
		</c:forEach> --%>