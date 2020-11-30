<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Calculadora Salvador Caetano</title>
<link rel="stylesheet" type="text/css" href="index.css" media="screen" />
<script type="text/javascript" src="javaScript.js"></script>
</head>

<body>
	<h1>Financiamento</h1>

	<form  action="CalculoServlet" method="get">
		
		<input type="hidden" name="id" value="1">
		<label>Valor do Carro</label><br>
		<input name="valorVeiculo" type="number" step = "any" placeholder="apenas números" required="required" pattern="[0-9]+([\.,][0-9]+)?" ><br><br>
		
		<label>Tipo de Financiamento</label><br>
		
		<input id="tipoInterno" name="tipoInterno" type="checkbox" value="interno" onclick="ocultarDiv()">
		<label for="tipoInterno">Interno</label><br>
		
		<input id="tipoExterno" name="tipoExterno" type="checkbox" value="externo" onclick="ocultarDiv1()">
		<label for="tipoExterno">Externo</label><br><br>
		
		<div id="prestInterno">	
		<label>Número de prestações</label><br>
		<select name="numPrestIntern" >
			<option value="0">0</option>
			<option value="12">12</option>
			<option value="24">24</option>
			<option value="36">36</option>
			<option value="48">48</option>
		</select>
		<br><br>
		</div>
		
		<div id="prestExterno">	
		<label>Número de prestações</label><br>
		<select name="numPrestExtern">
			<option value="0">0</option>
			<option value="12">12</option>
			<option value="24">24</option>
			<option value="36">36</option>
			<option value="48">48</option>
			<option value="60">60</option>
		</select>
		<br><br>
		</div>
	
	<input type="submit" value="CALCULAR" class="botao">
	</form>
</body>
</html>