package ar.edu.unju.fi.tpfinal.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "ORDERS")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderNumber")
	private Long ped_codigo_pedido;
	
	@Column(name = "orderDate")
	private Date ped_fecha_pedido;
	
	@Column(name = "requiredDate")
	private Date ped_fecha_requerida;
	
	@Column(name = "shippedDate")
	private Date ped_fecha_entrega;
	
	@Column(name = "comments")
	private String ped_comentarios;
	
	@Column(name = "status")
	private String ped_estado;
	
	@OneToMany(mappedBy = "pedido") 
    private List<ProductoPedido> productoPedido = new ArrayList<>();	
	
	@ManyToOne
	@JoinColumn(name="cli_codigo")
	private Cliente cliente;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Long getPed_codigo_pedido() {
		return ped_codigo_pedido;
	}

	public void setPed_codigo_pedido(Long ped_codigo_pedido) {
		this.ped_codigo_pedido = ped_codigo_pedido;
	}

	public Date getPed_fecha_pedido() {
		return ped_fecha_pedido;
	}

	public void setPed_fecha_pedido(Date ped_fecha_pedido) {
		this.ped_fecha_pedido = ped_fecha_pedido;
	}

	public Date getPed_fecha_requerida() {
		return ped_fecha_requerida;
	}

	public void setPed_fecha_requerida(Date ped_fecha_requerida) {
		this.ped_fecha_requerida = ped_fecha_requerida;
	}

	public Date getPed_fecha_entrega() {
		return ped_fecha_entrega;
	}

	public void setPed_fecha_entrega(Date ped_fecha_entrega) {
		this.ped_fecha_entrega = ped_fecha_entrega;
	}

	public String getPed_comentarios() {
		return ped_comentarios;
	}

	public void setPed_comentarios(String ped_comentarios) {
		this.ped_comentarios = ped_comentarios;
	}

	public String getPed_estado() {
		return ped_estado;
	}

	public void setPed_estado(String ped_estado) {
		this.ped_estado = ped_estado;
	}

	public List<ProductoPedido> getProductoPedido() {
		return productoPedido;
	}

	public void setProductoPedido(List<ProductoPedido> productoPedido) {
		this.productoPedido = productoPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}


