<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng Nhập</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.js"></script>
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.js"></script>

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.17.0/jquery.validate.js"></script>
<link href="<%=request.getContextPath()%>/css/main.css">
</head>
<style>
.error{
	color: red;
}
</style>
<body>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<div class = "container">
		<div class="wrapper">
		
			<form:form name="Login_Form" action="<c:url value="login"></c:url>" modelAttribute="login" method="post" class="form-signin">       
			    <h3 class="form-signin-heading"><spring:message code="hello" text="default text" /></h3>
				  <hr class="colorgraph"><br>
				  <!-- <spring:message code="password" text="default text" /> -->
				  <p><spring:message code="username" text="default text" /></p>
				  <form:input type="text" path="username" name="username"  class="form-control" name="username"  required="" />
				  
				  <p><spring:message code="password" text="default text" /></p>
				  <form:input type="password" path="password" name="password" class="form-control" name="password"  required=""/>
				  <span class="error">${message }</span>     		  
				  
				  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				  <form:button  class="btn btn-lg btn-primary btn-block"   name="Submit"  type="submit">Login	</form:button>
			</form:form>
			<a href="?language=en">English</a>|
  			<a href="?language=vi">Việt Nam</a>|			
		</div>
	</div>
</body>