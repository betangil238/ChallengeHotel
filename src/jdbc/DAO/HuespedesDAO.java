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
import jdbc.factory.ConnectionFactory;

public class HuespedesDAO {

	final private Connection con;

	public HuespedesDAO(Connection con) {
		this.con = con;
	}

	public static List<Huespedes> buscarHuesped(String valor, String id) {
		List<Huespedes> resultado = new ArrayList<>();
		final Connection con = new ConnectionFactory().recuperaConexion();

		try (con) {
			final PreparedStatement statement = con.prepareStatement(
					"SELECT id,nombre,apellido,fechaNac,nacionalidad,telefono,idReserva FROM huespedes " + " where apellido = ? or idReserva = ?");
			statement.setString(1, valor);
			statement.setString(2, id);
			try (statement) {
				statement.execute();
				final ResultSet resultSet = statement.getResultSet();
				try (resultSet) {
					while (resultSet.next()) {
						Huespedes fila = new Huespedes(resultSet.getInt("id"), resultSet.getString("nombre"),
								resultSet.getString("apellido"), resultSet.getDate("fechaNac"),
								resultSet.getString("nacionalidad"), resultSet.getString("telefono"),
								resultSet.getInt("idReserva"));
						resultado.add(fila);
					}
				}
			}
			return resultado;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// **************EJERCICIO NUMERO 2, INGRESAR DATOS POR INTERFAZ Y ALMACENARLOS


	public void guardar(Huespedes huesped) {

		try (con) {
			final PreparedStatement statement = con.prepareStatement(
					"INSERT INTO huespedes (nombre,apellido,fechaNac,nacionalidad,telefono,idReserva)"
							+ " VALUES(?,?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			
			String nombre = huesped.getNombre();
			String apellido = huesped.getApellido();
			Date fechaNac = (Date) huesped.getFechaNac();
			String nacionalidad = huesped.getNacionalidad();
			String telefono = huesped.getTelefono();
			long idReserva = huesped.getIdReserva();

			try (statement) {
				ejecutaRegistro(statement, huesped);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	private void ejecutaRegistro(PreparedStatement statement, Huespedes huesped) throws SQLException {

		statement.setString(1, huesped.getNombre());
		statement.setString(2, huesped.getApellido());
		statement.setDate(3, huesped.getFechaNac());
		statement.setString(4, huesped.getNacionalidad());
		statement.setString(5, huesped.getTelefono());
		statement.setLong(6, huesped.getIdReserva());
		statement.execute();
		final ResultSet resultSet = statement.getGeneratedKeys();
		try (resultSet)

		{
			while (resultSet.next()) {
				huesped.setId(resultSet.getInt(1));
				System.out.println(String.format("Fue insertado el huesped %s", huesped));
				
			}
		}
		con.close();
	}
	


	public int eliminar(Integer id) {
		try {
			final PreparedStatement statement = con.prepareStatement("DELETE FROM huespedes WHERE idReserva=?");
			try (statement) {
				statement.setInt(1, id);
				statement.execute();
				return statement.getUpdateCount();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public int modificar(String nombre, String apellido, Date fechaNac, String nacion, String tel, Integer idR,Integer id) {
		try {
			final PreparedStatement statement = con
					.prepareStatement("UPDATE huespedes SET " + " nombre = ?" + ", apellido = ?" + ", fechaNac =? "
							+ ", nacionalidad =? " + ", telefono =? " + " WHERE idReserva = ?");
			try (statement) {
				statement.setString(1, nombre);
				statement.setString(2, apellido);
				statement.setDate(3, fechaNac);
				statement.setString(4, nacion);
				statement.setString(5, tel);
				statement.setInt(6, idR);
				statement.execute();
				return statement.getUpdateCount();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
