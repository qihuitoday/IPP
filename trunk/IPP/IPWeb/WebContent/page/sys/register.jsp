<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:include page="../common/top.jsp" ></jsp:include>
<title>Register</title>
<style>
    h1 {
        text-align: center;
        padding-bottom: 10px;
    }
    .rig-image {
        padding-top: 16px;
        width: 120px;
        display: block;
        margin: 40px auto 6px;
    }
</style>
<script type="text/javascript">

	function fnRegister(){
		var form = document.myForm;
		var email = document.getElementById("mail").value;
		if(email === ""){
			alert("Please input Email.");
			document.getElementById("mail").focus();
			return;
		}
		var password = document.getElementById("password").value;
		if(password === ""){
			alert("Please input Password.");
			document.getElementById("password").focus();
			return;
		}
		var confirmPassword = document.getElementById("confirmPassword").value;
		if(confirmPassword === ""){
			alert("Please input Confirm Password.");
			document.getElementById("confirmPassword").focus();
			return;
		}
		if(confirmPassword !== password){
			alert("Confirm Password is not the same with Password.");
			document.getElementById("confirmPassword").focus();
			return;
		}
	    //setAllDisabled(form);
		form.submit();
	}
	
	function fnLogin(){
		var form = document.myForm;
		form.action = "loginUI";
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
                <img class="rig-image" src="etc/css/img/rig-icon-1.0.png"></img>
                <h1>Welcome to register.</h1>
                <p class="error"></p>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-3 control-label">Email</label>
					<div class="col-sm-9">
						<input type="email" class="form-control" id="mail" name="mail" placeholder="Email">
					</div>
				</div>
				<div class="form-group">
                    <label for="inputEmail3" class="col-sm-3 control-label">Password</label>
					<div class="col-sm-9">
						<input type="password" class="form-control" id="password" name="password" placeholder="Password">
					</div>
                </div>
				<div class="form-group">
                	<label for="inputEmail3" class="col-sm-3 control-label">Confirm Password</label>
					<div class="col-sm-9">
						<input type="password" class="form-control" id="confirmPassword" name="confirmPassword" placeholder="Confirm Password">
					</div>
                   </div>
				<div class="form-group">
					<div class="col-sm-offset-3 col-sm-10">
						<button type="button" class="btn btn-default" onclick="fnRegister()">Register</button>
						<button type="button" class="btn btn-link" onclick="fnLogin()">Login</button>
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