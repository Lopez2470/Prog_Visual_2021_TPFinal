package ar.edu.unju.fi.tpfinal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "USUARIOS")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "rol")
	private String rol;
	
	@Autowired
	@OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY)
	private Empleado empleado;
	
public Usuario() {
	// TODO Auto-generated constructor stub
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRol() {
	return rol;
}
public void setRol(String rol) {
	this.rol = rol;
}
public Empleado getEmpleado() {
	return empleado;
}
public void setEmpleado(Empleado empleado) {
	this.empleado = empleado;
}

@Override
public String toString() {
	return "Usuario [id=" + id + ", usuario=" + usuario + ", password=" + password + ", rol=" + rol + ", empleado="
			+ empleado + "]";
}

}
