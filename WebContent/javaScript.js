function ocultarDiv() {
	
	if (document.getElementById("tipoInterno").checked) {
		document.getElementById("prestExterno").style.display = "none";
		document.getElementById("prestInterno").style.display = "block";
		document.getElementById("tipoExterno").checked = false;
	}
}

function ocultarDiv1() {

	if (document.getElementById("tipoExterno").checked) {
		document.getElementById("prestExterno").style.display = "block";
		document.getElementById("prestInterno").style.display = "none";
		document.getElementById("tipoInterno").checked = false;
		
	}
}

function mostrarDiv3(){
	
	document.getElementById("contacto").style.display = "block";
	
}

function aviso(){
	alert("Nossa equipe entrará em contacto. Obrigado.");
}