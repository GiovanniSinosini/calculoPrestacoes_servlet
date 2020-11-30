<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Resultado</title>
<link rel="stylesheet" type="text/css" href="index.css" media="screen" />
<script type="text/javascript" src="javaScript.js"></script>
</head>
<body>
	<h1>Resultado</h1>
	<form action="CalculoServlet" method="get" onsubmit="return aviso()">
	
		<input type="hidden" name="id" value="2">
	
		<Label>Valor do Veículo</Label><br>
		<input name="valorVeiculo" type="text" readonly value="<%= request.getAttribute("valorVeiculo")%>" class="caixa"><br><br>
		
		<Label>Tipo Financiamento</Label><br>
		<input name="tipoFinanc" type="text" readonly value="<%= request.getAttribute("tipoEscolhido")%>" class="caixa"><br><br>
		
		<Label>Número de Prestações</Label><br>
		<input name="numPrest" type="text" readonly value="<%= request.getAttribute("numPrest")%>" class="caixa"><br><br>
		
		<Label>Valor da Prestação</Label><br>
		<input name="valorPrest" type="text" readonly value="<%= request.getAttribute("resultadoFinal")%>" class="caixa"><br><br>
		
		<input type="button" value="NOVO CÁLCULO"  onclick="location.href='index.jsp'" class="botao"><br><br>
		<input type="button" value="GRAVAR"  onclick="mostrarDiv3()" class="botao">
		
		<div id="contacto">
			
			<label>Insira seu nome:</label><br>
			<input name="nomeContacto" type="text" required="required" class="caixa"><br><br>
		
			<label>Insira seu contacto:</label><br>
			<input name="contacto" type="text" required="required"  class="caixa"><br>
			
			<input type="submit" value="ENVIAR" class="botao">
		
		</div>
	</form>
	
</body>
</html>