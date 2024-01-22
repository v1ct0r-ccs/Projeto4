package org.anbruvic.jpa;

import org.anbruvic.dao.jpa.ClienteJpaDAO;
import org.anbruvic.dao.jpa.IClienteJpaDAO;
import org.anbruvic.domain.jpa.ClienteJpa;
import org.anbruvic.exceptions.DAOException;
import org.anbruvic.exceptions.MaisDeUmRegistroException;
import org.anbruvic.exceptions.TableException;
import org.anbruvic.exceptions.TipoChaveNaoEncontradaException;
import org.junit.After;
import org.junit.Test;

import java.util.Collection;
import java.util.Random;

import static org.junit.Assert.assertNotNull;

public class ClienteJpaDAOTest {

    private IClienteJpaDAO clienteDAO;
    private Random rd;

    public ClienteJpaDAOTest() {
        this.clienteDAO = new ClienteJpaDAO();
        rd = new Random();
    }

    @After
    public void end() throws DAOException {
        Collection<ClienteJpa> list = clienteDAO.buscarTodos();
        list.forEach(cli -> {
            try {
                clienteDAO.excluir(cli);
            } catch (DAOException e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    public void pesquisarCliente() throws TipoChaveNaoEncontradaException, DAOException, MaisDeUmRegistroException, TableException {
        ClienteJpa cliente = criarCliente();
        clienteDAO.cadastrar(cliente);

        ClienteJpa clienteBD = clienteDAO.consultar(cliente.getId());
        assertNotNull(clienteBD);
    }



    private ClienteJpa criarCliente() {
        ClienteJpa cliente = new ClienteJpa();
        cliente.setCpf(rd.nextLong());
        cliente.setNome("Victor");
        cliente.setCidade("São Paulo");
        cliente.setEnd("end");
        cliente.setEstado("SP");
        cliente.setNumero(156);
        cliente.setTel(11999999999L);
        return cliente;
    }
}
