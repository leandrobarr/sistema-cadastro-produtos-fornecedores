package br.com.farmacia.test;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import br.com.farmacia.DAO.ProdutoDAO;
import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.domain.Produtos;

public class ProdutoDAOTeste {

	@Test
	@Ignore
	public void salvar() throws SQLException {
		Produtos p = new Produtos();
		p.setDescricao("CATAFLAN");
		p.setQuantidade(4900);
		p.setPreco(38.50);

		Fornecedores f = new Fornecedores();
		f.setCodigo(69);
		p.setFonecedores(f);

		ProdutoDAO pdao = new ProdutoDAO();

		pdao.salvar(p);

	}

	@Test
	@Ignore
	public void listar() throws SQLException {

		ProdutoDAO pdao = new ProdutoDAO();
		ArrayList<Produtos> lista = pdao.listar();

		for (Produtos p : lista) {
			System.out.println("Código do Produto: " + p.getCodigo());
			System.out.println("Descrição do Produto: " + p.getDescricao());
			System.out.println("Quantidade do Produto: " + p.getQuantidade());
			System.out.println("Preço do Produto: " + p.getPreco());
			System.out.println("Código do Fornecedor: " + p.getFornecedores().getCodigo());
			System.out.println("Descrição do Fornecedor: " + p.getFornecedores().getDescricao());
			System.out.println("");
		}

	}

	@Test
	@Ignore
	public void excluir() throws SQLException {

		Produtos p = new Produtos();
		p.setCodigo(6);

		ProdutoDAO pdao = new ProdutoDAO();
		pdao.excluir(p);
	}

	@Test

	public void editar() throws SQLException {

		Produtos p = new Produtos();
		p.setCodigo(9);
		p.setDescricao("CATA");
		p.setQuantidade(50);
		p.setPreco(34.0);

		Fornecedores f = new Fornecedores();
		f.setCodigo(45);
		p.setFonecedores(f);

		ProdutoDAO pdao = new ProdutoDAO();
		pdao.editar(p);

	}
}
