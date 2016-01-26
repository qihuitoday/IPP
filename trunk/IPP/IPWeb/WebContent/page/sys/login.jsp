<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:include page="../common/top.jsp" ></jsp:include>
<title>Login</title>
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
</head>
<body>
<form action="login" method="post">
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
                    <input type="hidden" name="redirect_dest" value="%2F"/>
                </form>
            </div>
            <div class="col-md-2"></div>
        </div>
    </div>
    <jsp:include page="../common/footer.jsp" ></jsp:include>
</div>
</form>
</body>
</html>