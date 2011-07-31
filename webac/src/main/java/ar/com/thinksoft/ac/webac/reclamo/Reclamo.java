package ar.com.thinksoft.ac.webac.reclamo;

import java.awt.Image;
import java.util.Date;

import ar.com.thinksoft.ac.intac.IEstadoReclamo;
import ar.com.thinksoft.ac.intac.IReclamo;

/**
 * Implementacion de IReclamo en intac
 * @author Matias
 *
 */
public class Reclamo implements IReclamo{
	
	private String id;
	private String calleReclamo;
	private int alturaReclamo;
	private int latitudReclamo;
	private int longitudReclamo;
	private Date fechaYHoraReclamo;
	private String tipoReclamo;
	private String ciudadanoReclamo;
	private String observaciones;
	private Image imagen;
	private IEstadoReclamo estado;
	private String prioridad;
	
	
	public Reclamo(){
		
	}
	
	public Reclamo (String calle,int altura,int latitud,int longitud,Date fechaYHora, String tipo, String ciudadano,
					String observaciones, Image imagen, IEstadoReclamo estado, String prioridad){
		
		
		
		this.setId("");
		this.setCalleIncidente(calle);
		this.setAlturaIncidente(altura);
		this.setLatitudIncidente(latitud);
		this.setLongitudIncidente(longitud);
		this.setFechaYHoraReclamo(fechaYHora);
		this.setTipoIncidente(tipo);
		this.setCiudadanoGeneradorReclamo(ciudadano);
		this.setObservaciones(observaciones);
		this.setImagen(imagen);
		this.setEstado(estado);
		this.setPrioridad(prioridad);
		
	}

	// get ATRIBUTOS
	
	public String getId(){
		return this.id;
	}
	
	public String getCalleIncidente() {
		return this.calleReclamo;
	}

	public int getAlturaIncidente() {
		return this.alturaReclamo;
	}

	public int getLatitudIncidente() {
		return this.latitudReclamo;
	}

	public int getLongitudIncidente() {
		return this.longitudReclamo;
	}

	public String getTipoIncidente() {
		return this.tipoReclamo;
	}

	public Date getFechaYHoraReclamo() {
		return this.fechaYHoraReclamo;
	}

	public String getCiudadanoGeneradorReclamo() {
		return this.ciudadanoReclamo;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public Image getImagen() {
		return this.imagen;
	}

	public IEstadoReclamo getEstado() {
		return this.estado;
	}	
	
	public String getPrioridad(){
		return this.prioridad;
	}
	
		
	//SET ATRIBUTOS
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setCalleIncidente(String calle) {
		this.calleReclamo = calle;
		
	}

	public void setAlturaIncidente(int altura) {
		this.alturaReclamo = altura;
		
	}

	public void setLatitudIncidente(int latitud) {
		this.latitudReclamo = latitud;
		
	}

	public void setLongitudIncidente(int longitud) {
		this.longitudReclamo = longitud;
		
	}

	public void setTipoIncidente(String tipo) {
		this.tipoReclamo = tipo;
		
	}

	public void setFechaYHoraReclamo(Date fechaYHora) {
		this.fechaYHoraReclamo = fechaYHora;
		
	}

	public void setCiudadanoGeneradorReclamo(String ciudadano) {
		this.ciudadanoReclamo = ciudadano;
		
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
		
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
		
	}

	public void setEstado(IEstadoReclamo estado) {
		this.estado = estado;
		
	}
	
	public void setPrioridad(String prioridad){
		this.prioridad = prioridad;
	}


}
