<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="../../../importacoes.jsp"></jsp:include>

<title>Cliente</title>
</head>
<body>

	<div class="container">

		<h2>Listagem de Filmes</h2>

		<table>
			<thead>
				<tr>
					<th>Titulo</th>
					<th>Ano</th>
				<tr>
			</thead>
			<tbody>
				<c:forEach items="${filmes}" var="f">
					<tr>
						<td>${f.titulo}</td>
						<td>${f.ano}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<a class="btn btn-sm btn-primary" href="cadastrar"><span
			class="glyphicon glyphicon-plus"></span> Adicionar</a>

	</div>


</body>
</html>