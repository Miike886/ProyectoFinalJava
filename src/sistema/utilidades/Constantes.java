package sistema.utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Constantes {

	public  static DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

	
	
	public enum Estatus{
		ACTIVO(0), INACTIVO(1);
		private int estatusNumerico;
		
		private Estatus(int estatusNumerico) {
			this.estatusNumerico=estatusNumerico;
			
		}


		public int getEstatusNumerico() {
			return estatusNumerico;
		}
	
	}
	
	public enum Movimientos{EDICION, INSERCION};
	
	public enum tipoPersona{
		MORAL, FISICA;
		
		private String tipoPersona;
	
		public String getTipoPersona() 
		{
			return tipoPersona;
		}
	}
	
	public enum PersonaFisica{
		RSC(1, "Régimen Simplificado de Confianza"), SSIAS(2,"Sueldos y salarios e ingresos asimilados a salarios"), RAEP(3, "Régimen de Actividades Empresariales y Profesionales"), RIF(4, "Régimen de Incorporación Fisca"),
		EB (5, "Enajenación de bienes"), RAEIATPT (6, "Régimen de Actividades Empresariales con ingresos a través de Plataformas Tecnológicas"), RDA(7, "Régimen de arrendamiento"), I (8, "Intereses"),
		ODP (9, "Obtención de premios"), D(10, "Dividendos"), DI(11, "Demás ingresos");
	
		private int idPersonaFisica;
		private String nombrePersonaFisica;
		
		
		private PersonaFisica(int idPersonaFisica, String nombrePersonaFisica) {
			this.idPersonaFisica=idPersonaFisica;
			this.nombrePersonaFisica=nombrePersonaFisica;
		}


		public int getIdPersonaFisica() {
			return idPersonaFisica;
		}


		public String getNombrePersonaFisica() 
		{
			return nombrePersonaFisica;
		}
		
	
	}
	
	public enum PersonaMoral{
		RG(1, "Régimen General"), RFNL(2,"Regimen con fines no lucrativos");
	
		private int idPersonaMoral;
		private String nombrePersonaMoral;
		
		
		private PersonaMoral(int idPersonaMoral, String nombrePersonaMoral) {
			this.idPersonaMoral=idPersonaMoral;
			this.nombrePersonaMoral=nombrePersonaMoral;
		}


		public int getIdPersonaFisica() {
			return idPersonaMoral;
		}


		public String getNombrePersonaFisica() 
		{
			return nombrePersonaMoral;
		}
		
	
	}
}
