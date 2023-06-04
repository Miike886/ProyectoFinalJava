package sistema.entidades;
import java.time.LocalDateTime;

import sistema.utilidades.Constantes;

public class Producto {

	private int idProducto;
	private String nombreProducto;
	private float precioCompra;
	private float precioVenta;
	private String proveedor;
	private int unidadesDisponibles;
	private String fechaRegistroProductos = LocalDateTime.now().format(Constantes.formatoFecha);
	
	public int getIdProducto() {
		return idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public float getPrecioCompra() {
		return precioCompra;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public String getProveedor() {
		return proveedor;
	}
	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}
	public String getFechaRegistroProductos() {
		return fechaRegistroProductos;
	}


	
}
