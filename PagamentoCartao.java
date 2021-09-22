package projetoIntegrador;

import java.io.Serializable;
import java.util.Objects;

public class PagamentoCartao extends Pagamento implements Serializable {
    private  static final long serialVersionUID = 1L;

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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numParcelas);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PagamentoCartao other = (PagamentoCartao) obj;
		return numParcelas == other.numParcelas;
	}
	
	
}
