package ProjetoIntegrador;

public class Cidade extends Endereco{
	
	Integer id;
	private String nome;
	
	public Cidade(String nome,String logradouro,String numero,String complemneto, String bairro,String cep,Integer id) {
		
		super(logradouro,numero,complemneto,bairro,cep,id);
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
