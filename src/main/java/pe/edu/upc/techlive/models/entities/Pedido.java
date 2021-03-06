package pe.edu.upc.techlive.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	
	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;
	
	@Column(name = "fecha_pedido")
	@Temporal(TemporalType.DATE)
	private Date fechaPedido;
	
	@ManyToOne
	@JoinColumn(name="detalle_pedido_id")
	private DetallePedido detallePedido;
	
	@Transient
	private Integer detallePedidoId;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@Transient
	private Integer clienteId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public DetallePedido getDetallePedido() {
		return detallePedido;
	}

	public void setDetallePedido(DetallePedido detallePedido) {
		this.detallePedido = detallePedido;
	}

	public Integer getDetallePedidoId() {
		return detallePedidoId;
	}

	public void setDetallePedidoId(Integer detallePedidoId) {
		this.detallePedidoId = detallePedidoId;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	
	
	
}
