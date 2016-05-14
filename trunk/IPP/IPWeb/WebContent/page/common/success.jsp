<jsp:include page="../common/top.jsp" ></jsp:include>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<title>Home</title>
<style>

</style>
<script type="text/javascript">
	
	$(document).ready(function(){
		$("#maintianFund").addClass("active");
	});
	
	function fnDone(){
		var form = document.myForm;
		form.action = "fundUI";
		form.submit();
	}
	 
</script>
</head>
<body>
<form action="home" name="myForm" method="post" class="form-horizontal"> 
<div class="container">
	<jsp:include page="../common/header.jsp" ></jsp:include>
	<div class="row">
		<div class="col-md-12">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title" id="myModalLabel">Notice:</h4>
					</div>
					<div class="modal-body">
						<p>
							Successfully.
						</p>
					</div>
					<div class="modal-footer">
						<button class="btn btn-default" type="button" onclick="fnDone();">Done</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</form>
</body>
</html>