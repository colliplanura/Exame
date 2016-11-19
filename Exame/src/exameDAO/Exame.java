/*
 * Autor: Sandro Colli
 * Data.: 19/11/2016
 */

package exameDAO;

import java.util.Calendar;
import java.util.List;

public class Exame {

	private Long id;
	private String titulo;
	private String descricao;
	private Calendar dataRealizacao;
	private Cliente cliente;
	private List<Imagem> imagens;
	private List<Tag> tags;
	
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Calendar getDataRealizacao() {
		return dataRealizacao;
	}
	public void setDataRealizacao(Calendar dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}
	public List<Imagem> getImagens() {
		return imagens;
	}
	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
