package model;
import java.io.Serializable;


public class Persona implements Serializable {
	private Integer id;
	private String nome;
	private int datanascita;
	private int datamorte;
	private String image;
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDatanascita() {
		return datanascita;
	}
	public void setDatanascita(int datanascita) {
		this.datanascita = datanascita;
	}
	public int getDatamorte() {
		return datamorte;
	}
	public void setDatamorte(int datamorte) {
		this.datamorte = datamorte;
	}
	private static final long serialVersionUID = 1L;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	
	
}