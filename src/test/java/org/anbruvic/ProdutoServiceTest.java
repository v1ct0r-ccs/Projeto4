/**
 * 
 */
package org.anbruvic;

import java.math.BigDecimal;

import org.anbruvic.dao.IProdutoDAO;
import org.anbruvic.dao.ProdutoDaoMock;
import org.anbruvic.domain.Produto;
import org.anbruvic.exceptions.DAOException;
import org.anbruvic.exceptions.TipoChaveNaoEncontradaException;
import org.anbruvic.services.IProdutoService;
import org.anbruvic.services.ProdutoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



/**
 * @author rodrigo.pires
 *
 */
public class ProdutoServiceTest {

	private IProdutoService produtoService;
	
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDaoMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
		produto.setModelo("Modelo1");
		produto.setCor("Aquela");
		//produto.setQuantidade_estoque(50);
	}
	
	@Test
	public void pesquisar() throws DAOException {
		Produto produtor = this.produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtor);
	}
	
	@Test
	public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluir() throws DAOException {
		produtoService.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		produto.setNome("Rodrigo Pires");
		produtoService.alterar(produto);
		
		Assert.assertEquals("Rodrigo Pires", produto.getNome());
	}
}
