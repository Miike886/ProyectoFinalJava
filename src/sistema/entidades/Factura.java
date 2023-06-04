package sistema.entidades;

import java.time.LocalDateTime;

import sistema.utilidades.Constantes;
import sistema.utilidades.Constantes.*;

public class Factura {
	private int idFactura, idCliente, idVenta;
	private float costoSinIVA, costoConIVA;
	private String cfdi;
	private Estatus estatusFactura;
	private String fechaDeAlta;
	
	private static int siguienteIdFactura=1;
	
	public Factura (int idCliente, int idVenta, float costoSinIVA, String cfdi, Movimientos movimiento)
	{
		this.idFactura = siguienteIdFactura;
		this.idCliente = idCliente;
		this.idVenta = idVenta;
		this.costoSinIVA = costoSinIVA;
		this.costoConIVA = costoSinIVA * 1.16f;
		this.cfdi = cfdi;
		this.estatusFactura = Estatus.ACTIVO;
		this.fechaDeAlta=LocalDateTime.now().format(Constantes.formatoFecha);
		if(movimiento==Movimientos.INSERCION)
		{
			siguienteIdFactura++;
		}
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public float getCostoSinIVA() {
		return costoSinIVA;
	}

	public void setCostoSinIVA(float costoSinIVA) {
		this.costoSinIVA = costoSinIVA;
	}

	public float getCostoConIVA() {
		return costoConIVA;
	}

	public void setCostoConIVA(float costoConIVA) {
		this.costoConIVA = costoConIVA;
	}

	public String getCfdi() {
		return cfdi;
	}

	public void setCfdi(String cfdi) {
		this.cfdi = cfdi;
	}

	public Estatus getEstatusFactura() {
		return estatusFactura;
	}

	public void setEstatusFactura(Estatus estatusFactura) {
		this.estatusFactura = estatusFactura;
	}

	public String getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(String fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}
}
