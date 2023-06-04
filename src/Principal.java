
import sistema.entidades.Cliente;
import sistema.entidades.Factura;
import sistema.entidades.Cliente.*;
import sistema.utilidades.Constantes;
import sistema.utilidades.Constantes.*;
public class Principal {

	public static void main(String[] args) {
		 
		Cliente cliente1 = new Cliente ("nombre", "rfc", PersonaFisica.D, "direccion", "codigoPostal", "hola@gmail.com", "numeroTeL", Movimientos.INSERCION);
	/*	
	 
	 	Pruebas clase cliente
	 
		System.out.println(cliente1.getIdCliente());
		System.out.println(cliente1.getTipoPersona());
		System.out.println(cliente1.getRfc());
		System.out.println(cliente1.getNombre());
		System.out.println(cliente1.getRegimenFiscalPF().getNombrePersonaFisica());
		System.out.println(cliente1.getDireccionFiscal());
		System.out.println(cliente1.getCodigoPostal());
		System.out.println(cliente1.getCorreo());
		System.out.println(cliente1.getNumeroTel());
		System.out.println(cliente1.getEstatusCliente());
		System.out.println(cliente1.getFechaDeAlta());
		
		
	*/
		
		Factura factura1 = new Factura (1, 1, 60, "123094jfw", Movimientos.INSERCION);
	
	/*
	
		Pruebas clase factura
	
		System.out.println(factura1.getIdCliente());
		System.out.println(factura1.getIdVenta());
		System.out.println(factura1.getCostoSinIVA());
		System.out.println(factura1.getCostoConIVA());
		System.out.println(factura1.getCfdi());
		System.out.println(factura1.getEstatusFactura());
		System.out.println(factura1.getFechaDeAlta());
		
	*/
		
	}
	
	

}
