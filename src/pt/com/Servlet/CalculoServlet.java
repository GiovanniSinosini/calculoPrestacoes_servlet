package pt.com.Servlet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pt.com.Model.ContactoInfo;

@WebServlet("/CalculoServlet")
public class CalculoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalculoServlet() {
		super();
	}

	private void gravarEmFicheiro(String path, ContactoInfo contacto1) {

		try {
			Files.write(Paths.get(path), contacto1.toString().getBytes(), StandardOpenOption.APPEND);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));

		if (id == 1) {

			// dados da url
			double dValorVeiculo = Double.parseDouble(request.getParameter("valorVeiculo"));
			String tipoFinanciamentoI = request.getParameter("tipoInterno");
			String tipoFinanciamentoE = request.getParameter("tipoExterno");

			int numPrestIntern = Integer.parseInt(request.getParameter("numPrestIntern"));
			int numPrestExtern = Integer.parseInt(request.getParameter("numPrestExtern"));

			double resultado = 0;

			// regras do cálculo da prestação
			if (tipoFinanciamentoI != null) {
				resultado = (dValorVeiculo * 1.04) / numPrestIntern;
			} else {
				resultado = (dValorVeiculo * 1.065) / numPrestExtern;
			};

			// formato em decimal de 2 casas
			DecimalFormat formato = new DecimalFormat("#.##");
			double resultadoFinal = Double.valueOf(formato.format(resultado));

			// preparar os dados para subir na url
			if (tipoFinanciamentoI == null) {
				request.setAttribute("tipoEscolhido", tipoFinanciamentoE);
				request.setAttribute("numPrest", numPrestExtern);

			} else {
				request.setAttribute("tipoEscolhido", tipoFinanciamentoI);
				request.setAttribute("numPrest", numPrestIntern);
			}

			request.setAttribute("valorVeiculo", dValorVeiculo);
			request.setAttribute("resultadoFinal", resultadoFinal);

			// enviar ao cliente
			request.getRequestDispatcher("resultado.jsp").forward(request, response);

		}

		else if (id == 2) {
			String valorVeiculo = request.getParameter("valorVeiculo");
			String tipoFinanc = request.getParameter("tipoFinanc");
			String numPrest = request.getParameter("numPrest");
			String valorPrest = request.getParameter("valorPrest");
			String nomeContacto = request.getParameter("nomeContacto");
			String contacto = request.getParameter("contacto");

			ContactoInfo contacto1 = new ContactoInfo(nomeContacto, contacto, valorVeiculo, tipoFinanc, numPrest,
					valorPrest);
			
			String local = "C:\\ws\\ws_java\\form.txt";
			gravarEmFicheiro(local, contacto1);
			
			response.sendRedirect("index.jsp");
		}
	}
}
