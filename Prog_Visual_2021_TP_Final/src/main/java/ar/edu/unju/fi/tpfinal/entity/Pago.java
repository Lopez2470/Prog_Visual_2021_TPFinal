package ar.edu.unju.fi.tpfinal.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "PAYMENT")
public class Pago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="checkNumber")
	private String pag_nro_comprobante;
	
	@Column(name = "amount")
	private double pag_monto;

	@Column(name = "paymentDate")	
	private Date pag_fecha_pag;
	
	
	//@OneToOne(mappedBy = "payment",fetch = FetchType.LAZY)
	//@Column(name="customerNumbe")
	//private Cliente cliente;
	
	@ManyToOne
	private Cliente cliente;
	
	public Pago() {
		// TODO Auto-generated constructor stub
	}

	public String getPag_nro_comprobante() {
		return pag_nro_comprobante;
	}

	public void setPag_nro_comprobante(String pag_nro_comprobante) {
		this.pag_nro_comprobante = pag_nro_comprobante;
	}

	public double getPag_monto() {
		return pag_monto;
	}

	public void setPag_monto(double pag_monto) {
		this.pag_monto = pag_monto;
	}

	public Date getPag_fecha_pag() {
		return pag_fecha_pag;
	}

	public void setPag_fecha_pag(Date pag_fecha_pag) {
		this.pag_fecha_pag = pag_fecha_pag;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pago [pag_nro_comprobante=" + pag_nro_comprobante + ", pag_monto=" + pag_monto + ", pag_fecha_pag="
				+ pag_fecha_pag + ", cliente=" + cliente + "]";
	}
}

