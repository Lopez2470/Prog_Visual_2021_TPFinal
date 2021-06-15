package ar.edu.unju.fi.tpfinal.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "EMPLOYEES")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employeeNumber")
	private int emp_codigo;
	
	@Column(name="firstName")
	private String emp_nombres;
	
	@Column(name="lastName")
	private String emp_apellido;
		
	@Column(name="extension")
	private String emp_codigo_extension;
	
	@Column(name="email")
	private String emp_email;
	
	@Column(name="jobTitle")
	private String emp_titulo;
	
	@Column(name = "reportsTo")
	private int emp_dependiente;
	
	
	//@ManyToOne(fetch = FetchType.LAZY)
	@ManyToOne
	//@Autowired
	@JoinColumn(name="emp_dependiente")
	private Empleado empleado;
	
	
	//@Autowired
	@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "codigo")
	private Oficina oficina;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="usu_Id")
	private Usuario usuario;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}



	public int getEmp_codigo() {
		return emp_codigo;
	}



	public void setEmp_codigo(int emp_codigo) {
		this.emp_codigo = emp_codigo;
	}



	/*
	 * public Empleado getEmp_dependiente() { return emp_dependiente; }
	 * 
	 * 
	 * 
	 * public void setEmp_dependiente(Empleado emp_dependiente) {
	 * this.emp_dependiente = emp_dependiente; }
	 */



	public Empleado getEmpleado() {
		return empleado;
	}



	public int getEmp_dependiente() {
		return emp_dependiente;
	}



	public void setEmp_dependiente(int emp_dependiente) {
		this.emp_dependiente = emp_dependiente;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}



	public String getEmp_nombres() {
		return emp_nombres;
	}

	public void setEmp_nombres(String emp_nombres) {
		this.emp_nombres = emp_nombres;
	}

	public String getEmp_apellido() {
		return emp_apellido;
	}

	public void setEmp_apellido(String emp_apellido) {
		this.emp_apellido = emp_apellido;
	}

	public String getEmp_codigo_extension() {
		return emp_codigo_extension;
	}

	public void setEmp_codigo_extension(String emp_codigo_extension) {
		this.emp_codigo_extension = emp_codigo_extension;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getEmp_titulo() {
		return emp_titulo;
	}

	public void setEmp_titulo(String emp_titulo) {
		this.emp_titulo = emp_titulo;
	}

	/*
	 * public List<Empleado> getEmpleado() { return empleado; }
	 * 
	 * public void setEmpleado(List<Empleado> empleado) { this.empleado = empleado;
	 * }
	 */

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}
	

	@Override
	public String toString() {
		return "Empleado [emp_codigo=" + emp_codigo + ", emp_nombres=" + emp_nombres + ", emp_apellido=" + emp_apellido
				+ ", emp_codigo_extension=" + emp_codigo_extension + ", emp_email=" + emp_email + ", emp_titulo="
				+ emp_titulo + ", emp_dependiente=" + emp_dependiente + ", empleado=" + empleado + ", oficina="
				+ oficina + "]";
	}
}
