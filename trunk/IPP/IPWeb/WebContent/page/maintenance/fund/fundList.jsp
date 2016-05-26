<jsp:include page="../../common/top.jsp" ></jsp:include>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<title>Maintain Fund</title>
<style>

</style>
<script type="text/javascript">

	$(document).ready(function(){
		$("#maintianFund").addClass("active");
	});
	
	function fnSearch(){
		var form = document.myForm;
		form.action = "fund";
		form.submit();
	}
	
	function fnClear(){
		var form = document.myForm;
		form.action = "fundUI";
		form.submit();
	}
	
	function fnAdd(){
		var form = document.myForm;
		form.action = "fundUI";
		$("#actionFlag").val("add");
		form.submit();
	}
	
	function fnView(id){
		var form = document.myForm;
		form.action = "fund";
		$("#id").val(id);
		$("#actionFlag").val("view");
		form.submit();
	}
	
</script>
</head>
<body>
<form action="fund" name="myForm" method="post" class="form-horizontal"> 
<div class="container">
	<jsp:include page="../../common/header.jsp" ></jsp:include>
	<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li><a href="#" onclick="fnFund()">Maintain Fund</a></li>
				<li class="active">List Fund</li>
			</ol>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="row">
				<label for="fundCode" class="col-md-2 control-label">Fund Code</label>
				<div class="col-md-2">
					<input type="text" class="form-control" id="fundCode" name="fundCode" value="<s:property value='fundCode'/>">
				</div>
				<label for="fundName" class="col-md-2 control-label">Fund Name</label>
				<div class="col-md-2">
					<input type="text" class="form-control" id="fundName" name="fundName" value="<s:property value='fundName'/>">
				</div>
				<label for="status" class="col-md-1 control-label">Status</label>
				<div class="col-md-2">
					<select class="form-control" id="status" name="status">
					  	<option value="">-Select-</option>
					  	<option value="Active" <s:if test="status == 'Active'">selected</s:if>>Active</option>
					  	<option value="Closed" <s:if test="status == 'Closed'">selected</s:if>>Closed</option>
					</select>
				</div>
				<div class="col-md-1">
					<button type="button" class="btn btn-default" onclick="fnSearch()">Search</button>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="spaceLine"></div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<table id="table"
           data-toggle="table"
           data-show-columns="true"
           data-height="300">
				<thead>
					<tr>
						<th>ID</th>
						<th>Fund Code</th>
						<th>Fund Name</th>
						<th>Status</th>
						<th>Maker ID</th>
						<th>Maker Date</th>
					</tr>
				</thead>
				<tbody>
					<s:if test="fundList.size() == 0">
						<tr height="185px">
							<td colspan="6" style="text-align: center; vertical-align: middle;">No record is found!</td>
						</tr>
					</s:if>
					<s:else>
						<s:iterator value="fundList" var="nl">  
							<tr>
								<td><a href="#" onclick="fnView(<s:property value='#nl.id'/>)"><s:property value="#nl.id"/></a></td>
								<td><s:property value="#nl.fundCode"/></td>
								<td><s:property value="#nl.fundName"/></td>
								<td><s:property value="#nl.status"/></td>
								<td><s:property value="#nl.makerID"/></td>
								<td><s:date name='#nl.makerTS' format='yyyy-MM-dd HH:mm:ss'/></td>
							</tr>
						</s:iterator>
					</s:else>
				</tbody>
			</table>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12" align="right">
			<button class="btn btn-default" type="button" onclick="javascript:fnClear();">Clear</button>
			<button class="btn btn-default" type="button" onclick="javascript:fnAdd();">Add</button>
		</div>
	</div>
</div>
<input type="hidden" id="id" name="id">
<input type="hidden" id="actionFlag" name="actionFlag">
</form>
</body>
</html>