<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkAlteraEmpresa"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



 <form action="${linkAlteraEmpresa}" method="post" >
	<fieldset>
	<legend>Alterando Empresa</legend>
	<div>
		<label for="nmId">Nome:</label>
		<input type="text" name="nome" id="nmId" value="${empresa.nome}"/>
	</div>
	
	<div>
		<label for="dtId">Data:</label>
		<input type="text" name="data" id="dtId" value="<fmt:formatDate	value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />"/>
		<input type="hidden" name="id" value="${empresa.id}"/>
		<input type="hidden" name="acao" value="AlteraEmpresa">
	</div>
	
	<input type="submit"/>
	
	</fieldset>
	</form>

</body>
</html>