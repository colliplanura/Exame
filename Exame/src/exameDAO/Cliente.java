/*
 * Autor: Sandro Colli
 * Data.: 19/11/2016
 */

package exameDAO;

import java.util.List;

public class Cliente {
	
	private Long id;
	private Long cpf;
	private String nome;	
	private Imagem foto;
	private List<Consulta> consultas;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Consulta> getConsultas() {
		return consultas;
	}
	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}
	public Imagem getFoto() {
		return foto;
	}
	public void setFoto(Imagem foto) {
		this.foto = foto;
	}

}
