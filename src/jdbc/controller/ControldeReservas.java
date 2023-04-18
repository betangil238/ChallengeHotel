package jdbc.controller;
import java.sql.Date;
import java.util.List;
import jdbc.DAO.ReservasDAO;
import jdbc.Modelo.Huespedes;
import jdbc.Modelo.Reservas;
import jdbc.factory.ConnectionFactory;

public class ControldeReservas {
	private ReservasDAO reservasDAO;
    public ControldeReservas() {
	var factory= new ConnectionFactory();
	this.reservasDAO= new ReservasDAO(factory.recuperaConexion());
	}

	public List<Reservas> buscarReserva(String valor) {
		return ReservasDAO.buscarReserva(valor);
	}
	
	public void guardar(Reservas reserva) {
		this.reservasDAO.guardar(reserva);
	}
	public int eliminar(Integer id){
		return reservasDAO.eliminar(id);
	}

	public int modificar(Date fechaE, Date fechaS,String valor, String pago,Integer id) {
		return reservasDAO.modificar(fechaE,fechaS,valor,pago,id);
	}
}
