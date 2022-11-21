<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h3>Join us form</h3>
		<form action="signup.jsp" method="post">
			<div>
				<label class="control.label" for="id">id</label>
				<input class="form-control" type="text" name="name" id="name" />
			</div>
	
			<div>
				<label class="control.label" for="pwd">password</label>
				<input class="form-control" type="password" name="pwd" id="pwd" />
			</div>
	
			<div>
				<label class="control.label" for="email">e-mail</label>
				<input class="form-control" type="text" name="email" id="email" />
			</div>
		<button class="btn btn-outline-primary" type="submit">가입</button>
		</form>
	
	</div>
</body>
</html>