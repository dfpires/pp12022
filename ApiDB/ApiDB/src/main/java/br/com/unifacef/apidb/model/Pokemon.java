package br.com.unifacef.apidb.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// definindo a classe como uma entidade do BD
@Entity
@Table(name="pokemon")
public class Pokemon {
	
	// criar uma variável que representa a chave primária
	// auto-incremento
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome")
	private String nome;
	@Column(name="tipo")
	private String tipo;
	@Column(name="poder")
	private String poder;
	@Column(name="nota")
	private float nota;
	public Pokemon() {
		
	}
	public Pokemon(String nome, String tipo, String poder, float nota) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.poder = poder;
		this.nota = nota;
	}
	public Pokemon(Long id, String nome, String tipo, String poder, float nota) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.poder = poder;
		this.nota = nota;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPoder() {
		return poder;
	}
	public void setPoder(String poder) {
		this.poder = poder;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nome=" + nome + 
				", tipo=" + tipo + ", poder=" + poder + 
				", nota=" + nota + "]";
	}
	
	
}
