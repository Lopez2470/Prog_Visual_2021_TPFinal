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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "PRODUCTS")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productCode")
	private String pro_codigo;
	
	@Column(name = "productName")
	private String pro_nombre;
	
	@Column(name = "productLine")
	private String pro_categoria_producto;
	
	@Column(name = "productScale")
	private String pro_escala;
	
	@Column(name = "productVendor")
	private String pro_proveedor;
	
	@Column(name = "productDescription")
	private String pro_descripcion;
	
	@Column(name = "quantityInStock")
	private short stock;
	
	@Column(name = "buyPrice")
	private double pro_precio;
	
	@Column(name = "MSRP")
	private double pro_precio_sugerido;
	
	
	@ManyToOne
	@JoinColumn(name="pro_categoria_producto")
	private Categoria categoria;
	
	@OneToMany(mappedBy="codigo_producto", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private List<ProductoPedido> productoPedidos;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public String getPro_codigo() {
		return pro_codigo;
	}

	public void setPro_codigo(String pro_codigo) {
		this.pro_codigo = pro_codigo;
	}

	public String getPro_nombre() {
		return pro_nombre;
	}

	public void setPro_nombre(String pro_nombre) {
		this.pro_nombre = pro_nombre;
	}

	public String getPro_categoria_producto() {
		return pro_categoria_producto;
	}

	public void setPro_categoria_producto(String pro_categoria_producto) {
		this.pro_categoria_producto = pro_categoria_producto;
	}

	

	public String getPro_escala() {
		return pro_escala;
	}

	public void setPro_escala(String pro_escala) {
		this.pro_escala = pro_escala;
	}

	public String getPro_proveedor() {
		return pro_proveedor;
	}

	public void setPro_proveedor(String pro_proveedor) {
		this.pro_proveedor = pro_proveedor;
	}

	public String getPro_descripcion() {
		return pro_descripcion;
	}

	public void setPro_descripcion(String pro_descripcion) {
		this.pro_descripcion = pro_descripcion;
	}

	public short getStock() {
		return stock;
	}

	public void setStock(short stock) {
		this.stock = stock;
	}

	public double getPro_precio() {
		return pro_precio;
	}

	public void setPro_precio(double pro_precio) {
		this.pro_precio = pro_precio;
	}

	public double getPro_precio_sugerido() {
		return pro_precio_sugerido;
	}

	public void setPro_precio_sugerido(double pro_precio_sugerido) {
		this.pro_precio_sugerido = pro_precio_sugerido;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<ProductoPedido> getProductoPedidos() {
		return productoPedidos;
	}

	public void setProductoPedidos(List<ProductoPedido> productoPedidos) {
		this.productoPedidos = productoPedidos;
	}
}
