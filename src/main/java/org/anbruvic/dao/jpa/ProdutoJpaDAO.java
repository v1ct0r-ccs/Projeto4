package org.anbruvic.dao.jpa;

import org.anbruvic.dao.jpa.generic.GenericJpaDAO;
import org.anbruvic.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }
}
