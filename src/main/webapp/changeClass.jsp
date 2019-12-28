<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
</head>
<body>

	<form class="form-horizontal" role="form" style="width: 550px;margin: 10px auto;" action="changeC.action" method="post" >	
		<div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">选择班级</label>
	    <div class="col-sm-4">
	     	<select class="form-control" name="classes.cid">
			  <option value="1">开发班</option>
	      		<option value="2">测试班</option>
      		</select>
	    </div>
	  </div>
	   <input type="hidden" name="stuid" value="${stuid}">
		 <div class="form-group">
	    <div class="col-sm-offset-2 col-sm-4">
	     <input type="submit" class="btn btn-info col-sm-12" value="保存" />
	    </div>
	  </div>
	   
		
	</form>
<script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>