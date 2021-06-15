package ar.edu.unju.fi.tpfinal.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "OFFICES")
public class Oficina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "officeCode")
	private Long ofi_codigo_oficina;
	
	@Column(name = "city")
	private String ofi_ciudad;
	
	@Column(name = "phone")
	private String ofi_telefono;
	
	@Column(name = "addressLine1")
	private String ofi_direccion;
	
	@Column(name = "addressLine2")
	private String ofi_direccion2;
	
	@Column(name = "state")
	private String ofi_provincia;
	
	@Column(name = "country")
	private String ofi_pais;
	
	@Column(name = "postalCode")	
	private String ofi_codigo_postal;
	
	@Column(name = "territory")
	private String ofi_zona_territorial;
	
	//@OneToMany(mappedBy="office")
	//private List<Oficina> oficinas;

public Oficina() {
	// TODO Auto-generated constructor stub
}

public Long getOfi_codigo_oficina() {
	return ofi_codigo_oficina;
}

public void setOfi_codigo_oficina(Long ofi_codigo_oficina) {
	this.ofi_codigo_oficina = ofi_codigo_oficina;
}

public String getOfi_ciudad() {
	return ofi_ciudad;
}

public void setOfi_ciudad(String ofi_ciudad) {
	this.ofi_ciudad = ofi_ciudad;
}

public String getOfi_telefono() {
	return ofi_telefono;
}

public void setOfi_telefono(String ofi_telefono) {
	this.ofi_telefono = ofi_telefono;
}

public String getOfi_direccion() {
	return ofi_direccion;
}

public void setOfi_direccion(String ofi_direccion) {
	this.ofi_direccion = ofi_direccion;
}

public String getOfi_direccion2() {
	return ofi_direccion2;
}

public void setOfi_direccion2(String ofi_direccion2) {
	this.ofi_direccion2 = ofi_direccion2;
}

public String getOfi_provincia() {
	return ofi_provincia;
}

public void setOfi_provincia(String ofi_provincia) {
	this.ofi_provincia = ofi_provincia;
}

public String getOfi_pais() {
	return ofi_pais;
}

public void setOfi_pais(String ofi_pais) {
	this.ofi_pais = ofi_pais;
}

public String getOfi_codigo_postal() {
	return ofi_codigo_postal;
}

public void setOfi_codigo_postal(String ofi_codigo_postal) {
	this.ofi_codigo_postal = ofi_codigo_postal;
}

public String getOfi_zona_territorial() {
	return ofi_zona_territorial;
}

public void setOfi_zona_territorial(String ofi_zona_territorial) {
	this.ofi_zona_territorial = ofi_zona_territorial;
}
}
