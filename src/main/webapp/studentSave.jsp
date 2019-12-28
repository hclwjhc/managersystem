<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
</head>
<body>
	<form class="form-horizontal" role="form" style="width: 550px;margin: 10px auto;" action="studentSave.action" method="post" >
	  
	  <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">学生姓名</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" id="name" placeholder="请输入学生姓名" name="student.stuname">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">学生性别</label>
	    <div class="col-sm-2">
	     	<select class="form-control" name="student.sex">
			  <option>男</option>
			  <option>女</option>
      		</select>
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">身份证号</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" id="manuFacturer" placeholder="请输入学生身份证号" name="student.idcard">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">入学日期</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" id="date" placeholder="请输入入学时间" name="student.intime">
	    </div>
	  </div>
	   <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">电话</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" id="price" placeholder="请输入学生电话" name="student.phone">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">地址</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" id="price" placeholder="请输入学生住址" name="student.address">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">毕业时间</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" id="quality" placeholder="请输入毕业时间" name="student.edutime">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">毕业学校</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" id="model" placeholder="请输入毕业学校" name="student.school">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">专业</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" id="remark" placeholder="请输入所学专业" name="student.domain">
	    </div>
	  </div>

	  <div class="form-group">
	    <div class="col-sm-offset-2 col-sm-10">
	     <input type="submit" class="btn btn-info col-sm-12" value="保存" />
	    </div>
	  </div>
	  <input type="hidden" name="checkrecord.crid" value="1">
	  <input type="hidden" name="classes.cid" value="1">
	  <input type="hidden" name="examrecord.erid" value="1">
	  <input type="hidden" name="headmaster.hid" value="1">
	  <input type="hidden" name="stage.sid" value="1">
	  <input type="hidden" name="teacher.tid" value="1">
	</form>
<script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>			
</body>
</html>