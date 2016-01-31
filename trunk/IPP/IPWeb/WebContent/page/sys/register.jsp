<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:include page="../common/top.jsp" ></jsp:include>
<jsp:include page="../common/top.jsp" ></jsp:include>
<title>Register</title>

<script type="text/javascript">

	 
</script>
</head>
<body>
<div class="wrap">
    <jsp:include page="../common/header.jsp" ></jsp:include>
    <div class="container">
        <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-8">
                <img class="rig-image" src="etc/css/img/rig-icon-1.0.png"></img>
                <h1>welcome</h1>
                <p class="error"></p>
                <form action="Home.html" method="post">
                    <div class="form-group">
                        <label for="inputEmail">Email</label>
                        <input type="email" class="form-control" id="inputEmail" name="username" placeholder="Email">
                    </div>
                    <div class="form-group">
                        <label for="inputPassword">Password</label>
                        <input type="password" class="form-control" id="inputPassword" name="password" placeholder="Password">
                    </div>
                    <button type="submit" class="btn btn-primary">Login</button>
                    <button type="button" class="btn btn-link" onclick="fnRegister()">Register</button>
                </form>
            </div>
            <div class="col-md-2"></div>
        </div>
    </div>
    <jsp:include page="../common/footer.jsp" ></jsp:include>
</div>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<div class="header">
				<ul class="nav nav-pills pull-right">
					<li>
						<a href="#">Contact Us</a>
					</li>
					<li>
						<a href="Login.html">Login</a>
					</li>
				</ul>
				<h3 class="text-muted">
					Welcome to IBDMS!
				</h3>
			</div>
		</div>
	</div>
	<div class="row-fluid">
		<div class="span12">
		</div>
	</div>
	<div class="row-fluid" style="height:411px">
		<form class="form-horizontal" action="Home.html" method="post">
			<div class="control-group">
				<label class="control-label" contenteditable="true" for="inputEmail">Email</label>
				<div class="controls"><input id="inputEmail" placeholder="Email" type="text" /></div>
			</div>
			<div class="control-group">
				<label class="control-label" contenteditable="true" for="inputPassword">Password</label>
				<div class="controls"><input id="inputPassword" placeholder="Password" type="password" /></div>
			</div>
			<div class="control-group">
				<label class="control-label" contenteditable="true" for="inputPassword">Confirm Password</label>
				<div class="controls"><input id="inputPassword" placeholder="Confirm Password" type="password" /></div>
			</div>
			<div class="control-group">
				<div class="controls"><button class="btn" type="submit">Done</button></div>
			</div>
		</form>
	</div>
	<div class="row-fluid">
		<div class="span12">
		</div>
	</div>
</div>
</body>
</html>