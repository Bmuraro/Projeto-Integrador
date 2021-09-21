package projetoIntegrador;

public class Pagamento {

	int id;
	Estado statusPagamento;

	public Pagamento(int id, Estado statusPagamento)
	{
		super();
		this.id=id;
		this.statusPagamento=statusPagamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Estado getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(Estado statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	
	
}
