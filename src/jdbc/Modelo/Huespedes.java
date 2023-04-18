package jdbc.Modelo;
import java.sql.Date;


public class Huespedes {

	private Integer id;
	private String nombre;
	private String apellido;
	private Date fechaNac;
	private String nacionalidad;
	private String telefono;
	private Integer idReserva;
	

	public Huespedes(String nombre, String apellido, Date fechaNac, String nacionalidad, String telefono,
			Integer idReserva) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.idReserva = idReserva;
	}
	public Huespedes(Integer id, String nombre, String apellido, Date fechaNac, String nacionalidad, String telefono,
			Integer idReserva) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.idReserva = idReserva;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public long getIdReserva() {
		return idReserva;
	}
	
//	PENDIENTE IMPLEMENTAR
//	@Override

//	public String toString() {
//		return String.format("{id: %s, nombre: %s, descripcion: %s, cantidad: %d} "
//				, this.id, this.nombre,this.descripcion, this.cantidad );
//	}
	
	
}
