<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cadastro de Cliente</title>
		<jsp:include page="../../../importacoes.jsp"></jsp:include>	
		
		<script type="text/javascript">
			$(function(){
				$('#txtAno').mask("0000");
			})
		</script>
	</head>
	<body>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h2>Cadastro de Filmes</h2></div>
			<div class="panel-body">
				<form action="gravar">
					<div class="form-group">
						<label for="txtAno">Ano:</label>
						<input class="form-control" type="text" name="filme.anoLancamento" placeholder="2017" id="txtAno"  required>
					</div>
					<div class="form-group">
						<label for="txtTitulo">Título:</label>
						<input class="form-control" type="text" name="filme.titulo" id="txtTitulo" placeholder="Título" required>
					</div>
					
					
					<div class="form-group">
						<button class="btn btn-sm btn-success" type="submit" ><span class="fa fa-save"></span> Gravar</button>
												
						<a class="btn btn-sm btn-danger" href="http://localhost:8080/AvaliacaoDS.visao.web/"> <span
							class="fa fa-home"></span> Home
						</a>
					</div>
				</form>
				
				
			</div>
		</div>
	</body>
</html>