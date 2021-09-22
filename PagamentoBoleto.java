package projetoIntegrador;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class PagamentoBoleto extends Pagamento implements Serializable {
	    private  static final long serialVersionUID = 1L;

	Date dataPagamento;
	Date dataVencimento;
	
	
	public PagamentoBoleto(int id, Estado statusPagamento,Date dataPagamento, Date dataVencimento)
	{
		super(id,statusPagamento);
		this.dataPagamento=dataPagamento;
		this.dataVencimento=dataVencimento;
	}


	public Date getDataPagamento() {
		return dataPagamento;
	}


	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}


	public Date getDataVencimento() {
		return dataVencimento;
	}


	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dataPagamento, dataVencimento);
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
		PagamentoBoleto other = (PagamentoBoleto) obj;
		return Objects.equals(dataPagamento, other.dataPagamento)
				&& Objects.equals(dataVencimento, other.dataVencimento);
	}
	
	
	
}
