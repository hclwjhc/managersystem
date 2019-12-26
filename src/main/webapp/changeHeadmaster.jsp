<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>评职页面</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css">
</head>
<body>

	<div id="container" style="margin-top: 30px" class="container">
		<form class="form-horizontal" action="headmasterPosition.action"
			method="post">

			<div class="form-group">
				<label class="col-md-5 col-sm-5 control-label">班主任：</label>
				<div class="col-md-3 ">
					<%-- <select name="${h.hid }"> --%>
					<select name="">
						<c:forEach items="${headmasters }" var="h">
							<option>${ h.hname}</option>
						</c:forEach>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-5 col-sm-5"></label>
				<div class="col-md-3">
					<input type="hidden" name="hid" value="${hid }"> <input
						type="submit" class="btn btn-info btn-block" value="保存">
				</div>

			</div>
		</form>
	</div>

	<script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>

</body>
</html>