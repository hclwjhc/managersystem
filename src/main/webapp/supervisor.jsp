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

	<h1 align="center">班级管理</h1>
	<form action="StageFindOne.action" method="post"
		style="margin-left: 260px">

		<a href="supervisorClassesAdd.jsp">创立班级</a>
		<table border="1" width="800" height="30">
			<tr>
				<th><a>阶段教师</a></th>
				<th><a
					href="stageTeacherFindOne.action?stage.sid=1">第一阶段</a></th>
				<th><a
					href="stageTeacherFindOne.action?stage.sid=2">第二阶段</a></th>
				<th><a
					href="stageTeacherFindOne.action?stage.sid=3">第三阶段</a></th>
				<th><a
					href="stageTeacherFindOne.action?stage.sid=4">第四阶段</a></th>
			</tr>
		</table>
		<table border="1" width="800" height="30">
			<tr>
				<th><a>阶段班主任</a></th>
				<th><a
					href="stageHeadmasterFindOne.action?stage.sid=1">第一阶段</a></th>
				<th><a
					href="stageHeadmasterFindOne.action?stage.sid=2">第二阶段</a></th>
				<th><a
					href="stageHeadmasterFindOne.action?stage.sid=3">第三阶段</a></th>
				<th><a
					href="stageHeadmasterFindOne.action?stage.sid=4">第四阶段</a></th>
			</tr>
		</table>

		<table border="1" width="800">
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
					<%-- <th><s:property value="headmaster.hid==1?'朱敏':'郭采洁' " /></th> --%>

					<s:if test="headmaster.hid==1">
						<th><s:property value="headmaster.hid==1?'朱敏':'1' " /></th>
					</s:if>
					<s:if test="headmaster.hid==2">
						<th><s:property value="headmaster.hid==2?'郭采洁':'2' " /></th>
					</s:if>
					<s:if test="headmaster.hid==3">
						<th><s:property value="headmaster.hid==3?'韩立':'3' " /></th>
					</s:if>
					<s:if test="headmaster.hid==4">
						<th><s:property value="headmaster.hid==4?'苏铭':'4' " /></th>
					</s:if>


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

					<%-- <th><s:property value="teacher.tid==1?'潘老师':'郭老师' " /></th> --%>

					<s:if test="teacher.tid==1">
						<th><s:property value="teacher.tid==1?'张老师':'1' " /></th>
					</s:if>
					<s:if test="teacher.tid==2">
						<th><s:property value="teacher.tid==2?'郭老师':'2' " /></th>
					</s:if>
					<s:if test="teacher.tid==3">
						<th><s:property value="teacher.tid==3?'潘老师':'3' " /></th>
					</s:if>
					<s:if test="teacher.tid==4">
						<th><s:property value="teacher.tid==4?'高老师':'4' " /></th>
					</s:if>


					<th><s:property value="supervisor.supid==1?'Boss':'1' " /></th>
					<th><a class="btn btn-info btn-xs"
						href="teacherFindAll.action?classess.cid=<s:property value="cid" />">教师调动</a>
						<a class="btn btn-info btn-xs"
						href="headmasterFindAll.action?classess.cid=<s:property value="cid" />">班主任调动</a>
					</th>
				</tr>
			</s:iterator>
		</table>

	</form>


</body>
</html>
