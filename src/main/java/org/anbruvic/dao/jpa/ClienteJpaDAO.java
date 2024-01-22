package org.anbruvic.dao.jpa;

import org.anbruvic.dao.jpa.generic.GenericJpaDAO;
import org.anbruvic.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }
}
