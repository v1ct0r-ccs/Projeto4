package org.anbruvic.dao.jpa.generic;

import org.anbruvic.dao.Persistente;
import org.anbruvic.exceptions.DAOException;
import org.anbruvic.exceptions.MaisDeUmRegistroException;
import org.anbruvic.exceptions.TableException;
import org.anbruvic.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

/**
 * Interface genérica para métodos de CRUD(Create, Read, Update and Delete)
 */

public interface IGenericJpaDAO <T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
