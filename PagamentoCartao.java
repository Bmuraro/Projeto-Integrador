package projetoIntegrador;

public class PagamentoCartao extends Pagamento {

	int numParcelas;
	
	
	public PagamentoCartao(int id, Estado statusPagamento, int numParcelas)
	{
		super(id, statusPagamento);
		this.numParcelas=numParcelas;
	}


	public int getNumParcelas() {
		return numParcelas;
	}


	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}
	
	
}
