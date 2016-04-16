<jsp:include page="../common/top.jsp" ></jsp:include>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<title>Home</title>
<style>

</style>
<script type="text/javascript">
	
	function fnHome(){
		var form = document.myForm;
		form.submit();
	}
	
	function fnLogout(){
		var form = document.myForm;
		form.action = "logout";
		form.submit();
	}
	
	function fnProfile(){
		var form = document.myForm;
		form.action = "profile";
		form.submit();
	}
	 
</script>
</head>
<body>
<form action="home" name="myForm" method="post" class="form-horizontal"> 
<div class="container">
	<div class="row">
		<div class="col-md-12">
			<div>
				<ul class="nav nav-pills pull-right" style="margin:5px 0px;">
					<li class="active">
						<a href="#" onclick="fnHome()">Home Page</a>
					</li>
					<li>
						<a href="#">Contact Us</a>
					</li>
					<li>
						<a href="#" onclick="fnLogout()">Log Out</a>
					</li>
				</ul>
				<h3 class="text-muted" style="margin:0px; padding:12px 0px;">
					Welcome: <a href="#" onclick="fnProfile()"><s:property value="ipEmployee.mail"/></a>
				</h3>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar">111</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">IBDMS</a>
					</div>

					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li><a href="IP Fund List.html">Maintain Fund<span class="sr-only">(current)</span></a></li>
							<li><a href="#">Maintain Product</a></li>
							<li><a href="#">Maintain Underwater</a></li>
							<li><a href="#">Maintain Rider</a></li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown<span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="#">Something else here</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="#">Separated link</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="#">One more separated link</a></li>
								</ul>
							</li>
						</ul>
						<!--
						<form class="navbar-form navbar-left" role="search">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Search">
							</div>
							<button type="submit" class="btn btn-default">Submit</button>
						</form>
						-->
						<ul class="nav navbar-nav navbar-right">
							<li><a href="#">Right Link</a></li>
							<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">Separated link</a></li>
							</ul>
							</li>
						</ul>
					</div><!-- /.navbar-collapse -->
				</div><!-- /.container-fluid -->
			</nav>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="jumbotron well">
				<div>
					<h1 style="margin-top: 0px;">Welcome!</h1>
					<h2>Insurance Basic Data Maintain System is used internally only.</h2>
					<h2>You can use it to maintain all insurance basic data.</h2>
					<h2>All the basic data will be used by Transaction modules.</h2>
				</div>
				<p style="padding-top: 80px;">
					Notice: You are authorized to use this System for approved business purposes only.
				</p>
			</div>
		</div>
	</div>
	<input type="hidden" id="uiFlag"  name="uiFlag">
</div>
</form>
</body>
</html>