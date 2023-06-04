package sistema.entidades;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import sistema.utilidades.Constantes;
import sistema.utilidades.Constantes.Estatus;
import sistema.utilidades.Constantes.Movimientos;


public class Ventas {

	private int idVenta;
	private String fechaDeVenta;
	private String horaDeVenta;
	private String vendedor;
	private float total;

	int siguienteIdVenta = 1;
	
	public Ventas (int idVenta, LocalDateTime fechaDeVenta, LocalDateTime horaDeVenta, String vendedor, float total, Movimientos movimiento)
	{
		this.idVenta = siguienteIdVenta;
		this.fechaDeVenta = LocalDateTime.now().format(Constantes.formatoFecha);
		this.horaDeVenta= LocalDateTime.now().format(Constantes.formatoHora);
		this.vendedor = vendedor;
		this.total = total;
		
		if(movimiento==Movimientos.INSERCION)
		{
			siguienteIdVenta++;
		}
		
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public String getFechaDeVenta() {
		return fechaDeVenta;
	}

	public void setFechaDeVenta(String fechaDeVenta) {
		this.fechaDeVenta = fechaDeVenta;
	}

	public String getHoraDeVenta() {
		return horaDeVenta;
	}

	public void setHoraDeVenta(String horaDeVenta) {
		this.horaDeVenta = horaDeVenta;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
	
	
	
	
	
	
}
