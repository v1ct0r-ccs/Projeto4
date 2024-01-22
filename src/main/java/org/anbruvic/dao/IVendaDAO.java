/**
 * 
 */
package org.anbruvic.dao;


import org.anbruvic.dao.generic.IGenericDAO;
import org.anbruvic.domain.Venda;
import org.anbruvic.exceptions.DAOException;
import org.anbruvic.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
