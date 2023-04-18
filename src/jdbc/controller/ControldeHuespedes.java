package jdbc.controller;
import java.sql.Date;
import java.util.List;
import jdbc.DAO.HuespedesDAO;
import jdbc.DAO.ReservasDAO;
import jdbc.Modelo.Huespedes;
import jdbc.Modelo.Reservas;
import jdbc.factory.ConnectionFactory;

public class ControldeHuespedes {
	private HuespedesDAO huespedesDAO;
    public ControldeHuespedes() {
	var factory= new ConnectionFactory();
	this.huespedesDAO= new HuespedesDAO(factory.recuperaConexion());
	}

	public List<Huespedes> buscarHuesped(String valor,String id) {
		return HuespedesDAO.buscarHuesped(valor, id);
	}
	
	public void guardar(Huespedes huesped) {
		this.huespedesDAO.guardar(huesped);
	}

		public int eliminar(Integer id){
	return huespedesDAO.eliminar(id);
		}

		public void modificar(String nombre, String apellido, Date fechaNac, String nacion, String tel, Integer idR,Integer id) {
			huespedesDAO.modificar(nombre,apellido,fechaNac,nacion,tel,idR,id);
		}


}
