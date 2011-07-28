package ar.com.thinksoft.ac.webac.reclamo;

import java.util.*;

import com.db4o.ObjectSet;

import ar.com.thinksoft.ac.intac.IReclamo;
import ar.com.thinksoft.ac.webac.repository.Repository;

/**
 * Administrador de reclamos
 * @author Matias
 *
 */
public class ReclamoManager {
	
	private static ReclamoManager instance;
	
	public ReclamoManager(){
	}
	
	public static ReclamoManager getInstance(){
		if(instance == null){
			instance = new ReclamoManager();
		}
		return instance;
	}
	
	public void guardarReclamo(IReclamo reclamo){
		Repository.getInstance().store(reclamo);
	}
	
	/**
	 * M�todo para guardar una colecci�n de Reclamos.
	 * Justificaci�n de este m�todo: si quiero guardar una colecci�n de Reclamos la guarda como tal,
	 * por eso me interesa guardar cada uno de los reclamos que conforma la colecci�n.
	 * @param listaReclamos
	 */
	public void guardarColeccionReclamos(List<IReclamo> listaReclamos){
		for(IReclamo reclamo : listaReclamos){
			guardarReclamo(reclamo);
		}
	}
	
	public List<Reclamo> obtenerTodosReclamos(){
		List<Reclamo> listaReclamos = new ArrayList<Reclamo>();
		ObjectSet<Reclamo> setReclamos = Repository.getInstance().query(Reclamo.class);
		
		for(Reclamo reclamo:setReclamos){
			listaReclamos.add(reclamo);
		}
		
		return listaReclamos;
	}
	
	public void eliminarTodosReclamos(){
		ObjectSet<Reclamo> objs = Repository.getInstance().queryByExample(Reclamo.class);
		for(Reclamo reclamo : objs){
			Repository.getInstance().delete(reclamo);
		}
	}
	

}
