package br.ucdb.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucdb.util.Cliente;

public class ClienteServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String nome = req.getParameter("name");
		String rg = req.getParameter("rg");
		String cpf = req.getParameter("cpf");
		String email = req.getParameter("email"); 
		String sexo = req.getParameter("sexo");
		String id= req.getParameter("id");
		
		int id1 = Integer.parseInt(id);
		
		Cliente c = new Cliente();
		c.cadastrar(nome, rg, cpf, email, sexo, id);
		
		req.setAttribute("nome", c.getNome());
		
		//
	}
	
}
