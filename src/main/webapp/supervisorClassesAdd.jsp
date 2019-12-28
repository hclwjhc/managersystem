<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创立班级页面</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css">
</head>
<body>

	<div id="container" style="margin-top: 30px" class="container">
		<form class="form-horizontal" action="supervisorClassesSave.action"
			method="post">

			<div class="form-group">
				<label class="col-md-5 col-sm-5 control-label">班级名称：</label>
				<div class="col-md-3 ">
					<input type="text" class="form-control" required="required"
						name="classess.cname">
				</div>
			</div>


			<div class="form-group">
				<label class="col-md-5 col-sm-5 control-label">班级类型：</label>
				<div class="col-md-3 ">
					<select name="classess.ctype" class="form-control">
						<option>请选择</option>
						<option>开发</option>
						<option>测试</option>
						<option>Python</option>
					</select>
				</div>
			</div>


			<div class="form-group">
				<label class="col-md-5 col-sm-5 control-label">班主任：</label>
				<div class="col-md-3 ">
					<select name="classess.headmaster.hid" class="form-control">
						<option>请选择</option>
						<option value="1" >朱敏</option>
						<option value="2">郭采洁</option>
					</select>
				</div>
			</div>


			<div class="form-group">
				<label class="col-md-5 col-sm-5 control-label">阶段：</label>
				<div class="col-md-3 ">
					<select name="classess.stage.sid" class="form-control">
						<option>请选择</option>
						<option value="1">第一阶段</option>
						<option value="2">第二阶段</option>
						<option value="3">第三阶段</option>
						<option value="4">第四阶段</option>
					</select>
				</div>
			</div>


			<div class="form-group">
				<label class="col-md-5 col-sm-5 control-label">教师：</label>
				<div class="col-md-3 ">
					<select name="classess.teacher.tid" class="form-control">
						<option>请选择</option>
						<option value="1">潘老师</option>
						<option value="2">郭老师</option>
					</select>
				</div>
			</div>


			<div class="form-group">
				<label class="col-md-5 col-sm-5 control-label">主管：</label>
				<div class="col-md-3 ">
						<select name="classess.supervisor.supid" class="form-control">
						<option>请选择</option>
						<option value="1">Boss</option>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-5 col-sm-5"></label>
				<div class="col-md-3">
					<input type="submit" class="btn btn-info btn-block" value="保存">
				</div>

			</div>
		</form>
	</div>

	<script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>

</body>
</html>