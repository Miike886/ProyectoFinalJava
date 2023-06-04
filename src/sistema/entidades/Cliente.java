package sistema.entidades;
import java.time.LocalDateTime;

import sistema.utilidades.Constantes;
import sistema.utilidades.Constantes.*;

public class Cliente {

	private int idCliente;
	private tipoPersona tipoPersona;
	private String rfc, nombre, direccionFiscal, codigoPostal, correo, numeroTel;
	private Estatus estatusCliente;
	private String fechaDeAlta;
	
	private PersonaFisica regimenFiscalPF;
	private PersonaMoral regimenFiscalPM;
	
	private static int siguienteIdCliente=1;
	
	public Cliente (String nombre, String rfc, PersonaFisica regimenFiscal, String direccionFiscal, String codigoPostal, String correo, String numeroTel, Movimientos movimiento)
	{
		this.idCliente = siguienteIdCliente;
		this.tipoPersona = tipoPersona.FISICA;
		this.rfc = rfc;
		this.nombre = nombre;
		this.regimenFiscalPF = regimenFiscal;
		this.direccionFiscal = direccionFiscal;
		this.codigoPostal = codigoPostal;
		this.correo = correo;
		this.numeroTel = numeroTel;
		this.estatusCliente = Estatus.ACTIVO;
		this.fechaDeAlta=LocalDateTime.now().format(Constantes.formatoFecha);
		if(movimiento==Movimientos.INSERCION)
		{
			siguienteIdCliente++;
		}
	}
	
	
	public Cliente (String nombre, String rfc, PersonaMoral regimenFiscal, String direccionFiscal, String codigoPostal, String numeroTel, Movimientos movimiento)
	{
		this.idCliente = siguienteIdCliente;
		this.tipoPersona = tipoPersona.MORAL;
		this.rfc = rfc;
		this.nombre = nombre;
		this.regimenFiscalPM = regimenFiscal;
		this.direccionFiscal = direccionFiscal;
		this.codigoPostal = codigoPostal;
		this.numeroTel = numeroTel;
		this.estatusCliente = Estatus.ACTIVO;
		this.fechaDeAlta=LocalDateTime.now().format(Constantes.formatoFecha);
		if(movimiento==Movimientos.INSERCION)
		{
			siguienteIdCliente++;
		}
	}

	public PersonaFisica getRegimenFiscalPF() {
		return regimenFiscalPF;
	}

	public void setRegimenFiscalPF(PersonaFisica regimenFiscalPF) {
		this.regimenFiscalPF = regimenFiscalPF;
	}

	public PersonaMoral getRegimenFiscalPM() {
		return regimenFiscalPM;
	}

	public void setRegimenFiscalPM(PersonaMoral regimenFiscalPM) {
		this.regimenFiscalPM = regimenFiscalPM;
	}

	public tipoPersona getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(tipoPersona tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccionFiscal() {
		return direccionFiscal;
	}

	public void setDireccionFiscal(String direccionFiscal) {
		this.direccionFiscal = direccionFiscal;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public Estatus getEstatusCliente() {
		return estatusCliente;
	}

	public void setEstatusCliente(Estatus estatusCliente) {
		this.estatusCliente = estatusCliente;
	}

	public String getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(String fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}

}
