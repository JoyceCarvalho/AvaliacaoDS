<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="../../../importacoes.jsp"></jsp:include>
<script type="text/javascript">
	$(function() {
		$('table').dataTable({
			"language" : {
				"lengthMenu" : "Mostrando _MENU_ registros por pagina",
				"zeroRecords" : "Nenhuma ocorrencia",
				"info" : "Mostrando _PAGE_ de _PAGES_",
				"infoEmpty" : "Sem registros",
				"infoFiltered" : "(buscando de  _MAX_ registros)",
				"search" : "Buscar:",
				"processing" : "Processando...",
				"paginate" : {
					"first" : "Primeira",
					"last" : "Ultima",
					"next" : "Proxima",
					"previous" : "Anterior"
				}
			}
		});
	})
</script>
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
						<td>${f.anoLancamento}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<a class="btn btn-sm btn-primary" href="cadastrar"> <span
			class="fa fa-plus-circle"></span> Adicionar
		</a> 
		<a class="btn btn-sm btn-warning" href="http://localhost:8080/AvaliacaoDS.visao.web/"> <span
			class="fa fa-reply"></span> Voltar
		</a>

	</div>


</body>
</html>