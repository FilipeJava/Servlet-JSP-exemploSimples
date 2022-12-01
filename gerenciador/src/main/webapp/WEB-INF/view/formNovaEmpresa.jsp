<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkServletUnico"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



 <form action="${linkServletUnico}" method="post" >
	<fieldset>
	<legend>Cadastrando Empresa</legend>
	<div>
		<label for="nmId">Nome:</label>
		<input type="text" name="nome" id="nmId"/>
	</div>
	
	<div>
		<label for="dtId">Data:</label>
		<input type="text" name="data" id="dtId"/>
		
		<input type="hidden" name="acao" value="NovaEmpresa" >
	</div>
	
	
	
	<input type="submit"/>
	
	</fieldset>
	</form>

</body>
</html>