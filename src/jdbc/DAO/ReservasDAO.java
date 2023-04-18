package jdbc.DAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.Modelo.Huespedes;
import jdbc.Modelo.Reservas;

public class ReservasDAO {
	private static Connection con ;

	public ReservasDAO(Connection con) {
		this.con = con;
	}
	
	public static List<Reservas> buscarReserva(String valor) {
		List<Reservas> resultado = new ArrayList<>();
		try {
			final PreparedStatement statement = con.prepareStatement("SELECT idReserva,fechaSalida,fechaEntrada,valor,formaPago FROM reservas " + "where idReserva = ?");
			statement.setString(1, valor);
			try (statement) {
				final ResultSet resultSet = statement.executeQuery();
				try (resultSet) {
					while (resultSet.next()) {
						var reserva = new Reservas(resultSet.getInt("idReserva"),resultSet.getDate("fechaSalida"), resultSet.getDate("fechaEntrada"), resultSet.getString("valor"),resultSet.getString("formaPago"));
						resultado.add(reserva);
					}
				}
				;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return resultado;
	}
	
	public void guardar(Reservas reserva) {

		try {
			final PreparedStatement statement = con.prepareStatement(
					"INSERT INTO reservas (idReserva,fechaEntrada,fechaSalida,valor,formaPago)"
							+ " VALUES(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			Date fechaEntrada = reserva.getFechaEntrada();
			Date fechaSalida = reserva.getFechaSalida();
			String valor = reserva.getValor();
			String formaPago = reserva.getFormaPago();

			try (statement) {
				ejecutaRegistro(statement, reserva);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		}

	}

	private void ejecutaRegistro(PreparedStatement statement, Reservas reserva) throws SQLException {
		statement.setInt(1, reserva.getId());
		statement.setDate(2, reserva.getFechaEntrada());
		statement.setDate(3, reserva.getFechaSalida());
		statement.setString(4, reserva.getValor());
		statement.setString(5, reserva.getFormaPago());
		statement.execute();

		final ResultSet resultSet = statement.getGeneratedKeys();
		try (resultSet)

		{
			while (resultSet.next()) {
				reserva.setId(resultSet.getInt(1));
			
			}
		}
		con.close();
	}
	
//	//***********************EJERCICIO NUMERO 3, ELIMINAR DATOS **********************************

	public int eliminar(Integer id) {
		try {
			final PreparedStatement statement = con.prepareStatement("DELETE FROM reservas WHERE idReserva=?");
			try (statement) {
				statement.setInt(1, id);
				statement.execute();
				return statement.getUpdateCount();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

//	//***********************EJERCICIO NUMERO 4, MODIFICAR DATOS **********************************
	public int modificar(Date fechaE, Date fechaS,String valor, String pago,Integer id) {
		try {
			final PreparedStatement statement = con
					.prepareStatement("UPDATE reservas SET fechaEntrada = ? , fechaSalida =? , valor =? , formaPago = ? WHERE idReserva = ?");
			try (statement) {
				statement.setDate(1, fechaE);
				statement.setDate(2, fechaS);
				statement.setString(3, valor);
				statement.setString(4, pago);
				statement.setInt(5, id);
				statement.execute();
				return statement.getUpdateCount();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
