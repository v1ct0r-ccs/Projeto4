/**
 * 
 */
package org.anbruvic.services;


import org.anbruvic.dao.IProdutoDAO;
import org.anbruvic.domain.Produto;
import org.anbruvic.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
