import java.io.Serializable;


public class Persona implements Serializable {
	private Integer id;
	private String nome;
	private String datanascita;
	private String datamorte;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDatanascita() {
		return datanascita;
	}
	public void setDatanascita(String datanascita) {
		this.datanascita = datanascita;
	}
	public String getDatamorte() {
		return datamorte;
	}
	public void setDatamorte(String datamorte) {
		this.datamorte = datamorte;
	}
	private static final long serialVersionUID = 1L;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	
	
}