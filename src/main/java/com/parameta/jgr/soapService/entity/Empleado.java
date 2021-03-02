package com.parameta.jgr.soapService.entity;



import java.util.Date;



/**
 * Entidad de Empleado
 * @author Julian
 *
 */
//@Entity
//@Table(name="empleado",schema="developer")
public class Empleado {
	
	
	private static final long serialVersionUID = 1L;

//	@Id
//	@Column(name="id_empleado")
	// @GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEmpleado;
	
	//@Column(name="nombres")
	private String nombres;
	
	//@Column(name="apellidos")
	private String apellidos;
	
	//@Column(name="tipo_documento")
	private String tipoDocumento;
	
//	@Column(name="fecha_nacimiento")
//	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
//	@Column(name="fecha_vinculacion")
//	@Temporal(TemporalType.DATE)
	private Date fechaVinculacion;
	
	//@Column(name="cargo")
	private String cargo;
	
	//@Column(name="salario")
	private Double salario;
	
	//@Column(name="tiempo_vinculacion")	
	private String tiempoVinculacion;
	
	//@Column(name="edad_actual")
	private String edadActual;

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaVinculacion() {
		return fechaVinculacion;
	}

	public void setFechaVinculacion(Date fechaVinculacion) {
		this.fechaVinculacion = fechaVinculacion;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getTiempoVinculacion() {
		return tiempoVinculacion;
	}

	public void setTiempoVinculacion(String tiempoVinculacion) {
		this.tiempoVinculacion = tiempoVinculacion;
	}

	public String getEdadActual() {
		return edadActual;
	}

	public void setEdadActual(String edadActual) {
		this.edadActual = edadActual;
	}

}
