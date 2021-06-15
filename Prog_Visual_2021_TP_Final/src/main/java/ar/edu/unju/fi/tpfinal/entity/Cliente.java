package ar.edu.unju.fi.tpfinal.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "CUSTOMERS")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerNumber")
	private Long cli_codigo;

	@Column(name = "customerName")
	private String cli_nombre;

	@Column(name = "contactLasttName")
	private String cli_apellido_contacto;

	@Column(name = "contactFirstName")
	private String cli_nombre_contacto;

	@Column(name = "phone")
	private String cli_telefono;

	@Column(name = "addressLine1")
	private String cli_direccion;

	@Column(name = "addressLine2")
	private String cli_direccion2;

	@Column(name = "city")
	private String cli_ciudad;

	@Column(name = "state")
	private String cli_provincia;

	@Column(name = "postalCode")
	private String cli_codigo_postal;

	@Column(name = "country")
	private String cli_pais;

	@Column(name = "creditLimit")
	private double cli_credito_limite;

	@Column(name = "salesRepEmployeeNumber")
	private int cli_nro_empleado_ventas;

	@ManyToOne
	@JoinColumn(name = "cli_nro_empleado_ventas", referencedColumnName = "employeeNumber")
	private Empleado empleado;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cliente")
	private Pago pagos;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Long getCli_codigo() {
		return cli_codigo;
	}

	public void setCli_codigo(Long cli_codigo) {
		this.cli_codigo = cli_codigo;
	}

	public String getCli_nombre() {
		return cli_nombre;
	}

	public void setCli_nombre(String cli_nombre) {
		this.cli_nombre = cli_nombre;
	}

	public String getCli_apellido_contacto() {
		return cli_apellido_contacto;
	}

	public void setCli_apellido_contacto(String cli_apellido_contacto) {
		this.cli_apellido_contacto = cli_apellido_contacto;
	}

	public String getCli_nombre_contacto() {
		return cli_nombre_contacto;
	}

	public void setCli_nombre_contacto(String cli_nombre_contacto) {
		this.cli_nombre_contacto = cli_nombre_contacto;
	}

	public String getCli_telefono() {
		return cli_telefono;
	}

	public void setCli_telefono(String cli_telefono) {
		this.cli_telefono = cli_telefono;
	}

	public String getCli_direccion() {
		return cli_direccion;
	}

	public void setCli_direccion(String cli_direccion) {
		this.cli_direccion = cli_direccion;
	}

	public String getCli_direccion2() {
		return cli_direccion2;
	}

	public void setCli_direccion2(String cli_direccion2) {
		this.cli_direccion2 = cli_direccion2;
	}

	public String getCli_ciudad() {
		return cli_ciudad;
	}

	public void setCli_ciudad(String cli_ciudad) {
		this.cli_ciudad = cli_ciudad;
	}

	public String getCli_provincia() {
		return cli_provincia;
	}

	public void setCli_provincia(String cli_provincia) {
		this.cli_provincia = cli_provincia;
	}

	public String getCli_codigo_postal() {
		return cli_codigo_postal;
	}

	public void setCli_codigo_postal(String cli_codigo_postal) {
		this.cli_codigo_postal = cli_codigo_postal;
	}

	public String getCli_pais() {
		return cli_pais;
	}

	public void setCli_pais(String cli_pais) {
		this.cli_pais = cli_pais;
	}

	public double getCli_credito_limite() {
		return cli_credito_limite;
	}

	public void setCli_credito_limite(double cli_credito_limite) {
		this.cli_credito_limite = cli_credito_limite;
	}

	/*
	 * public Empleado getCli_nro_empleado_ventas() { return
	 * cli_nro_empleado_ventas; }
	 * 
	 * public void setCli_nro_empleado_ventas(Empleado cli_nro_empleado_ventas) {
	 * this.cli_nro_empleado_ventas = cli_nro_empleado_ventas; }
	 */

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Pago getPagos() {
		return pagos;
	}

	public void setPagos(Pago pagos) {
		this.pagos = pagos;
	}

	@Override
	public String toString() {
		return "Cliente [cli_codigo=" + cli_codigo + ", cli_nombre=" + cli_nombre + ", cli_apellido_contacto="
				+ cli_apellido_contacto + ", cli_nombre_contacto=" + cli_nombre_contacto + ", cli_telefono="
				+ cli_telefono + ", cli_direccion=" + cli_direccion + ", cli_direccion2=" + cli_direccion2
				+ ", cli_ciudad=" + cli_ciudad + ", cli_provincia=" + cli_provincia + ", cli_codigo_postal="
				+ cli_codigo_postal + ", cli_pais=" + cli_pais + ", cli_credito_limite=" + cli_credito_limite
				+ ", cli_nro_empleado_ventas=" + cli_nro_empleado_ventas + ", empleado=" + empleado + ", pagos=" + pagos
				+ "]";
	}

}
