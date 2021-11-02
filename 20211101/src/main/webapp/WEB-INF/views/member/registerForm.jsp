<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="utf-8">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>회원가입</title>

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">
<script type="text/javascript">
	function CheckPassword(){
		var password = frm.password.value;
		var repeatPassword = frm.repeatPassword.value;
		
		if(password != "" && password == repeatPassword){
			frm.submit();
		}else{
			alert("패스워드가 일치하지 않습니다.")
			frm.password.value ="";
			frm.repeatPassword.value="";
			frm.password.focus();
			return false;
		}
	}
</script>
</head>

<body class="bg-gradient-primary">
	<div class="container">
		<div class="card o-hidden border-0 shadow-lg my-5">
			<div class="card-body p-0">
				<!-- Nested Row within Card Body -->
				<div class="row">
					<div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
					<div class="col-lg-7">
						<div class="p-5">
							<div class="text-center">
								<h1 class="h4 text-gray-900 mb-4">회원가입</h1>
							</div>
							<form id="frm" class="user" action="registerMember.do" method="post">
								<div class="form-group row">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input type="text" class="form-control form-control-user"
											id="id" name="id" placeholder="user Id">
									</div>
									<div class="col-sm-6">
										<input type="text" class="form-control form-control-user"
											id="name" name="name" placeholder="user Name">
									</div>
								</div>
								<div class="form-group row">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input type="password" class="form-control form-control-user"
											id="password" name="password" placeholder="Password">
									</div>
									<div class="col-sm-6">
										<input type="password" class="form-control form-control-user"
											id="repeatPassword" placeholder="Repeat Password">
									</div>
								</div>
								<div class="form-group">
									<input type="tel" class="form-control form-control-user"
										id="tel" name="tel" placeholder="Telephone Number">
								</div>
								<div class="form-group">
									<input type="text" class="form-control form-control-user"
										id="address" name="address" placeholder="Your address">
								</div>
								<div class="form-group">
									<input type="hidden" class="form-control form-control-user"
										id="author" name="author" value="USER">
								</div>
								
								<input type="button" class="btn btn-primary btn-user btn-block" onclick="CheckPassword()" value="회원가입">
								<hr>
								<a href="index.html" class="btn btn-google btn-user btn-block">
									<i class="fab fa-google fa-fw"></i> Register with Google
								</a> <a href="index.html"
									class="btn btn-facebook btn-user btn-block"> <i
									class="fab fa-facebook-f fa-fw"></i> Register with Facebook
								</a>
							</form>
							<hr>
							<div class="text-center">
								<a class="small" href="forgot-password.html">Forgot
									Password?</a>
							</div>
							<div class="text-center">
								<a class="small" href="memberLoginForm.do">Already have an account?
									Login!</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="js/sb-admin-2.min.js"></script>
</body>

</html>