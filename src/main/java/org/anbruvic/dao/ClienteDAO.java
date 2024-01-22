/**
 * 
 */
package org.anbruvic.dao;

import org.anbruvic.dao.generic.GenericDAO;
import org.anbruvic.domain.Cliente;

import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 * @author rodrigo.pires
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super();
	}


	@Override
	public Class<Cliente> getTipoClasse() {
		return Cliente.class;
	}

	@Override
	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
		entityCadastrado.setCpf(entity.getCpf());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setIdade(entity.getIdade());
		entityCadastrado.setSexo(entity.getSexo());
		entityCadastrado.setTel(entity.getTel());
		entityCadastrado.setEnd(entity.getEnd());
		entityCadastrado.setNumero(entity.getNumero());
		entityCadastrado.setCidade(entity.getCidade());
		entityCadastrado.setEstado(entity.getEstado());

	}

	@Override
	protected String getQueryInsercao() {
        String sb = "INSERT INTO TB_CLIENTE " +
                "(ID, NOME, CPF, TEL, ENDERECO, NUMERO, CIDADE, ESTADO, IDADE, SEXO)" +
                "VALUES (nextval('sq_cliente'),?,?,?,?,?,?,?,?,?)";
		return sb;
	}

	@Override
	protected void setParametrosQueryInsercao(PreparedStatement stmInsert, Cliente entity) throws SQLException {
		stmInsert.setString(1, entity.getNome());
		stmInsert.setLong(2, entity.getCpf());
		stmInsert.setLong(3, entity.getTel());
		stmInsert.setString(4, entity.getEnd());
		stmInsert.setLong(5, entity.getNumero());
		stmInsert.setString(6, entity.getCidade());
		stmInsert.setString(7, entity.getEstado());
        stmInsert.setLong(8, entity.getIdade());
        stmInsert.setString(9, entity.getSexo());
	}

	@Override
	protected String getQueryExclusao() {
		return "DELETE FROM TB_CLIENTE WHERE CPF = ?";
	}

	@Override
	protected void setParametrosQueryExclusao(PreparedStatement stmExclusao, Long valor) throws SQLException {
		stmExclusao.setLong(1, valor);
	}
	
	@Override
	protected String getQueryAtualizacao() {
		StringBuilder sb = new StringBuilder();
		sb.append("UPDATE TB_CLIENTE ");
		sb.append("SET NOME = ?,");
		sb.append("TEL = ?,");
		sb.append("ENDERECO = ?,");
		sb.append("NUMERO = ?,");
		sb.append("CIDADE = ?,");
		sb.append("ESTADO = ?,");
        sb.append("IDADE = ?,");
        sb.append("SEXO = ?");
        sb.append(" WHERE CPF = ?");
		return sb.toString();
	}

	@Override
	protected void setParametrosQueryAtualizacao(PreparedStatement stmUpdate, Cliente entity) throws SQLException {
		stmUpdate.setString(1, entity.getNome());
		stmUpdate.setLong(2, entity.getTel());
		stmUpdate.setString(3, entity.getEnd());
		stmUpdate.setLong(4, entity.getNumero());
		stmUpdate.setString(5, entity.getCidade());
		stmUpdate.setString(6, entity.getEstado());
        stmUpdate.setLong(7, entity.getIdade());
        stmUpdate.setString(8, entity.getSexo());
		stmUpdate.setLong(9, entity.getCpf());
	}

	@Override
	protected void setParametrosQuerySelect(PreparedStatement stmSelect, Long valor) throws SQLException {
		stmSelect.setLong(1, valor);
	}
}
