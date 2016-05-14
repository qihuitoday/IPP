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

	function fnBack(){
		var form = document.myForm;
		form.action = "fundUI";
		form.submit();
	}
	
	function fnModify(){
		var form = document.myForm;
		form.action = "fund";
		$("#actionFlag").val("modify");
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
				<li class="active">View Fund</li>
			</ol>
		</div>
	</div>
	<div class="row" style="height:411px">
		<div class="col-md-12">
			<div class="row">
				<label for="id" class="col-md-2 control-label">ID</label>
				<div class="col-md-2">
					<input type="text" class="form-control" id="id" name="objIpFund.id" value="<s:property value='objIpFund.id'/>" disabled>
				</div>
			</div>
			<hr/>
			<div class="row">
				<label for="uwCode" class="col-md-2 control-label">Underwriter</label>
				<div class="col-md-2">
					<select class="form-control" id="uwCode" name="objIpFund.uwCode" disabled>
						<option value="">-Select-</option>
					  	<option value="ACE" <s:if test="objIpFund.uwCode == 'ACE'">selected</s:if>>ACE</option>
					  	<option value="AIA" <s:if test="objIpFund.uwCode == 'AIA'">selected</s:if>>AIA</option>
					  	<option value="TAIPING" <s:if test="objIpFund.uwCode == 'TAIPING'">selected</s:if>>TAIPING</option>
					</select>
				</div>
				<label for="productCode" class="col-md-2 control-label">Product Code</label>
				<div class="col-md-2">
					<input type="text" class="form-control" id="productCode" name="objIpFund.productCode" value="<s:property value='objIpFund.productCode'/>" disabled>
				</div>
				<label for="fundCode" class="col-md-2 control-label">Fund Code</label>
				<div class="col-md-2">
					<input type="text" class="form-control" id="fundCode" name="objIpFund.fundCode" value="<s:property value='objIpFund.fundCode'/>" disabled>
				</div>
			</div>
			<hr/>
			<div class="row">
				<label for="fundName" class="col-md-2 control-label">Fund Name</label>
				<div class="col-md-2">
					<input type="text" class="form-control" id="fundName" name="objIpFund.fundName" value="<s:property value='objIpFund.fundName'/>" disabled>
				</div>
				<label for="localName" class="col-md-2 control-label">Local Name</label>
				<div class="col-md-2">
					<input type="text" class="form-control" id="localName" name="objIpFund.localName" value="<s:property value='objIpFund.localName'/>" disabled>
				</div>
				<label for="currencyCode" class="col-md-2 control-label text-left">Currency Code</label>
				<div class="col-md-2">
					<select class="form-control" id="currencyCode" name="objIpFund.currencyCode" disabled>
						<option value="">-Select-</option>
					  	<option value="USD" <s:if test="objIpFund.currencyCode == 'USD'">selected</s:if>>USD</option>
					  	<option value="HKD" <s:if test="objIpFund.currencyCode == 'HKD'">selected</s:if>>HKD</option>
					  	<option value="RMB" <s:if test="objIpFund.currencyCode == 'RMB'">selected</s:if>>RMB</option>
					</select>
				</div>
			</div>
			<hr/>
			<div class="row">
				<label for="riskLevel" class="col-md-2 control-label">Risk Level</label>
				<div class="col-md-2">
					<select class="form-control" id="riskLevel" name="objIpFund.riskLevel" disabled>
						<option value="">-Select-</option>
					  	<option value="1" <s:if test="objIpFund.riskLevel == 1">selected</s:if>>1</option>
					  	<option value="2" <s:if test="objIpFund.riskLevel == 2">selected</s:if>>2</option>
					  	<option value="3" <s:if test="objIpFund.riskLevel == 3">selected</s:if>>3</option>
					</select>
				</div>
				<label for="effectiveDate" class="col-md-2 control-label">Start Date</label>
				<div class="col-md-2">
					<div class='input-group date form_datetime'>
						<input type='text' class="form-control" readonly="readonly" id="effectiveDate" name="objIpFund.startDate" value="<s:date name='objIpFund.startDate' format='yyyy-MM-dd'/>" disabled/>
						<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
					</div>
				</div>
				<label for="endDate" class="col-md-2 control-label">End Date</label>
				<div class="col-md-2">
					<div class='input-group date form_datetime'>
						<input type='text' class="form-control" readonly="readonly" id="endDate" name="objIpFund.endDate" value="<s:date name='objIpFund.endDate' format='yyyy-MM-dd'/>" disabled/>
						<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
					</div>
				</div>
			</div>
			<hr/>
			<div class="row">
				<label for="status" class="col-md-2 control-label">Status</label>
				<div class="col-md-2">
					<select class="form-control" id="status" name="objIpFund.status" disabled>
					  	<option value="Active" <s:if test="objIpFund.status == 'Active'">selected</s:if>>Active</option>
					  	<option value="Closed" <s:if test="objIpFund.status == 'Closed'">selected</s:if>>Closed</option>
					</select>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4" align="left">
			 <button class="btn btn-default" type="button" onclick="fnBack();">Back</button>
		</div>
		<div class="col-md-8" align="right">
			<button class="btn btn-default" type="button" onclick="fnModify();">Modify</button>
		</div>
	</div>
</div>
<input type="hidden" id="id" name="id" value="<s:property value='objIpFund.id'/>">
<input type="hidden" id="actionFlag" name="actionFlag">
</form>
<script type="text/javascript">

	$(function () {
		$(".form_datetime").datetimepicker({
			//viewMode: 'days',
			useCurrent: false,
			format: 'YYYY-MM-DD',
			showTodayButton: true,
			showClear:true
		});
	});
	
</script>
</body>
</html>