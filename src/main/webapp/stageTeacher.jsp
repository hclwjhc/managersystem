<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>阶段教师</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css">
</head>
<body>

	<div id="container" style="margin-top: 30px" class="container">
		<form class="form-horizontal" action="stageTeacherFindOne.action"
			method="post">

			<div class="form-group">
				<label class="col-md-7 col-sm-6 control-label">阶段教师：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${teacher.tname}</label>
			</div>

			<div class="form-group">
				<label class="col-md-5 col-sm-5"></label>
				<div class="col-md-3">
					<input type="hidden" name="stage.sid" value="${stage.sid }"> <input
						type="submit" class="btn btn-info btn-block" value="end">
				</div>
			</div>
		</form>
	</div>

	<script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>

</body>
</html>
