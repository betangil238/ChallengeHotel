package jdbc.Modelo;
import java.sql.Date;

public class Reservas {

	private Integer idReserva;
	private Date fechaEntrada;
	private Date fechaSalida;
	private String valor;
	private String formaPago;
	
	
	public Reservas(Date fechaEntrada, Date fechaSalida, String valor, String formaPago) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.valor = valor;
		this.formaPago = formaPago;
	}

	public Reservas(Integer idReserva, Date fechaEntrada, Date fechaSalida, String valor, String formaPago) {
		this.idReserva = idReserva;
		this.fechaSalida = fechaSalida;
		this.fechaEntrada = fechaEntrada;
		this.valor = valor;
		this.formaPago = formaPago;
	}
	
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	public Integer getId() {
		return idReserva;
	}

	public void setId(Integer id) {
		this.idReserva = id;
	}

//	PENDIENTE IMPLEMENTAR
//	@Override

//	public String toString() {
//		return String.format("{id: %s, nombre: %s, descripcion: %s, cantidad: %d} "
//				, this.id, this.nombre,this.descripcion, this.cantidad );
//	}
	
}
