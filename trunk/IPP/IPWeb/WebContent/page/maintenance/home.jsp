<jsp:include page="../common/top.jsp" ></jsp:include>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<title>Home</title>
<style>

</style>
<script type="text/javascript">
	
	
	 
</script>
</head>
<body>
<form action="home" name="myForm" method="post" class="form-horizontal"> 
<div class="container">
	<jsp:include page="../common/header.jsp" ></jsp:include>
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
</div>
</form>
</body>
</html>