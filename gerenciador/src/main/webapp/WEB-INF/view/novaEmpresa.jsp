<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		<c:if test="${not empty nomeEmpresa}">
		
			<h1>Empresa ${nomeEmpresa} Cadastrada com sucesso!</h1>	
		
		</c:if>

	    <c:if test="${empty nomeEmpresa}">
		
			<h1>Nenhuma empresa cadastrada</h1>	
		
		</c:if>


</body>
</html>