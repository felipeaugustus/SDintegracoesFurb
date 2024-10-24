package br.furb.dsc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {

	private Connection openConnection() {

		try {
			String url = "jdbc:mysql://127.0.0.1:3306/aula2410";
	        String user = "root";
	        String pass = "aluno";
	        
			return DriverManager.getConnection(url, user, pass);

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public PedidoBean insert(PedidoBean pedido) {

		Connection conn = null;

		PreparedStatement stmt = null;

		try {
			conn = openConnection();
			System.out.println("Conectou");


			stmt = conn.prepareStatement("INSERT INTO pedidos (CODIGO, CLIENTE, ENDERECO, ESTADO, ITENS, TOTAL) VALUES (?, ?, ?, ?, ?, ? )", //
					Statement.RETURN_GENERATED_KEYS);

			stmt.setInt(1, pedido.getCodigo());
			stmt.setString(2, pedido.getCliente());
			stmt.setString(3, pedido.getEndereco());
			stmt.setString(4, pedido.getEstado());
			stmt.setString(5, pedido.getItensReator());
			stmt.setDouble(6, pedido.getTotal());

			if (stmt.executeUpdate() == 1) {

				// Obtendo o id incremental...
				try (ResultSet rs = stmt.getGeneratedKeys()) {
					if (rs.next()) {
						pedido.setCodigo(rs.getInt(1));
					}
				}

				return pedido;
			} else {
				return null;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
				}

			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
				}
		}

	}
}
