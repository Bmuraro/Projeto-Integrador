package projetoIntegrador;

import java.util.Date;

public class PagamentoBoleto extends Pagamento {

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
	
	
	
}

