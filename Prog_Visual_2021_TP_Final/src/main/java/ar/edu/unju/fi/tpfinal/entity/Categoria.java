package ar.edu.unju.fi.tpfinal.entity;

import java.util.ArrayList;
import java.util.Arrays;
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
@Table(name = "PRODUCTLINES")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productLine")
	private String cat_codigo;
	
	@Column(name = "textDescription")
	private String cat_descripcion;
	
	@Column(name = "htmlDescription")
	private String cat_DescriptionHtml;
	
	@Column(name = "image")
	private byte[] cat_image;
	
	//@OneToMany(mappedBy = "producto")
	//private List<Producto> productos = new ArrayList<Producto>();
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}

	public String getCat_codigo() {
		return cat_codigo;
	}

	public void setCat_codigo(String cat_codigo) {
		this.cat_codigo = cat_codigo;
	}

	public String getCat_descripcion() {
		return cat_descripcion;
	}

	public void setCat_descripcion(String cat_descripcion) {
		this.cat_descripcion = cat_descripcion;
	}

	public String getCat_DescriptionHtml() {
		return cat_DescriptionHtml;
	}

	public void setCat_DescriptionHtml(String cat_DescriptionHtml) {
		this.cat_DescriptionHtml = cat_DescriptionHtml;
	}

	public byte[] getCat_image() {
		return cat_image;
	}

	public void setCat_image(byte[] cat_image) {
		this.cat_image = cat_image;
	}

	@Override
	public String toString() {
		return "Categoria [cat_codigo=" + cat_codigo + ", cat_descripcion=" + cat_descripcion + ", cat_DescriptionHtml="
				+ cat_DescriptionHtml + ", cat_image=" + Arrays.toString(cat_image) + "]";
	}
	
}

