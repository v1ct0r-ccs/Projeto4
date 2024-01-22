package org.anbruvic.jpa.dao;

import org.anbruvic.dao.jpa.IVendaJpaDAO;
import org.anbruvic.dao.jpa.generic.GenericJpaDAO;
import org.anbruvic.domain.jpa.VendaJpa;
import org.anbruvic.exceptions.DAOException;
import org.anbruvic.exceptions.TipoChaveNaoEncontradaException;
import org.junit.platform.commons.util.PackageUtils;

public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

    public VendaExclusaoJpaDAO() {
        super(VendaJpa.class);
    }

    @Override
    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public VendaJpa consultarComCollection(Long id) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }
}
