/*
 * Autor: Sandro Colli
 * Data.: 19/11/2016
 */

package exameDAO;

import java.util.Calendar;
import java.util.List;

public class Consulta {
	
	private Long id;
	private Calendar dataConsulta;
	private String queiaPrincipal;
	private String historia;
	private Cliente cliente;
	private List<Tag> tags;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Calendar getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Calendar dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getQueiaPrincipal() {
		return queiaPrincipal;
	}
	public void setQueiaPrincipal(String queiaPrincipal) {
		this.queiaPrincipal = queiaPrincipal;
	}
	public String getHistoria() {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
