package ar.edu.unju.fi.tpfinal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "ORDERSDETAILS")
public class ProductoPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="orderNumber")
	private int codigo_pedido;
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productCode")
	private String codigo_producto;

	@Column(name = "quantityOrdered")
	private int cantidad;
	
	@Column(name = "priceEach")
	private double precio_realh;
	
	@Column(name = "orderLineNumber")
	private short num_linea_pedido;
	
	
	@ManyToOne
	@JoinColumn(name="codigo_pedido")
		private Pedido pedido;

	@ManyToOne
	@JoinColumn(name="codigo_producto")
	private Producto producto;
	
	public ProductoPedido() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo_pedido() {
		return codigo_pedido;
	}

	public void setCodigo_pedido(int codigo_pedido) {
		this.codigo_pedido = codigo_pedido;
	}

	public String getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(String codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio_realh() {
		return precio_realh;
	}

	public void setPrecio_realh(double precio_realh) {
		this.precio_realh = precio_realh;
	}

	public short getNum_linea_pedido() {
		return num_linea_pedido;
	}

	public void setNum_linea_pedido(short num_linea_pedido) {
		this.num_linea_pedido = num_linea_pedido;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
