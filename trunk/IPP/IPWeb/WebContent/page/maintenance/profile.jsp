<jsp:include page="../common/top.jsp" ></jsp:include>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<title>Register</title>
<style>

</style>
<script type="text/javascript">
	
	function fnDone(){
		var form = document.myForm;
		form.action = "profile";
		form.submit();
	}
	 
</script>
</head>
<body>
<form action="register" name="myForm" method="post" class="form-horizontal"> 
<div class="wrap">
    <div class="container">
        <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-8">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-3 control-label">Email</label>
					<div class="col-sm-9">
						<input type="mail" class="form-control" id="mail" name="mail" value="<s:property value='ipEmployee.mail'/>" placeholder="Mail">
					</div>
				</div>
				<div class="form-group">
                    <label for="inputEmail3" class="col-sm-3 control-label">Password</label>
					<div class="col-sm-9">
						<input type="password" class="form-control" id="password" name="password" value="<s:property value='ipEmployee.password'/>" placeholder="Password">
					</div>
                </div>
				<div class="form-group">
                	<label for="inputEmail3" class="col-sm-3 control-label">Confirm Password</label>
					<div class="col-sm-9">
						<input type="password" class="form-control" id="confirmPassword" name="confirmPassword" value="<s:property value='ipEmployee.password'/>" placeholder="Confirm Password">
					</div>
                   </div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-3 control-label">Name</label>
					<div class="col-sm-9">
						<input type="input" class="form-control" id="employeeName" name="employeeName" value="<s:property value='ipEmployee.employeeName'/>" placeholder="Name">
					</div>
				</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-3 control-label">English Name</label>
					<div class="col-sm-9">
						<input type="input" class="form-control" id="englishName" name="englishName" value="<s:property value='ipEmployee.englishName'/>" placeholder="English Name">
					</div>
				</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-3 control-label">Gender</label>
					<div class="col-sm-9">
						<input type="input" class="form-control" id="gender" name="gender" value="<s:property value='ipEmployee.gender'/>" placeholder="Gender">
					</div>
				</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-3 control-label">Address</label>
					<div class="col-sm-9">
						<input type="input" class="form-control" id="address" name="address" value="<s:property value='ipEmployee.address'/>" placeholder="Address">
					</div>
				</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-3 control-label">Mobile Number</label>
					<div class="col-sm-9">
						<input type="input" class="form-control" id="mobileNumber" name="mobileNumber" value="<s:property value='ipEmployee.mobileNumber'/>" placeholder="Mobile Number">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-3 col-sm-10">
						<button type="button" class="btn btn-default" onclick="fnDone()">Done</button>
					</div>
				</div>
            </div>
            <div class="col-md-2"></div>
        </div>
    </div>
    <jsp:include page="../common/footer.jsp" ></jsp:include>
</div>
</form>
</body>
</html>