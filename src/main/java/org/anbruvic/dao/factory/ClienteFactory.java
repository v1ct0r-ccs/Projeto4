/**
 * 
 */
package org.anbruvic.dao.factory;

import org.anbruvic.domain.Cliente;

import java.sql.ResultSet;
import java.sql.SQLException;



/**
 * @author rodrigo.pires
 *
 */
public class ClienteFactory {

	public static Cliente convert(ResultSet rs) throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setId(rs.getLong("ID_CLIENTE"));
		cliente.setCpf(rs.getLong(("CPF")));
		cliente.setNome(rs.getString(("NOME")));
		cliente.setIdade(rs.getInt(("IDADE")));
		cliente.setSexo(rs.getString(("SEXO")));
		cliente.setTel(rs.getLong(("TEL")));
		cliente.setEnd(rs.getString(("ENDERECO")));
		cliente.setNumero(rs.getInt(("NUMERO")));
		cliente.setCidade(rs.getString(("CIDADE")));
		cliente.setEstado(rs.getString(("ESTADO")));
		return cliente;
	}
}
