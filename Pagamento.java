package projetoIntegrador;

import java.io.Serializable;
import java.util.Objects;

public class Pagamento implements Serializable {
	    private  static final long serialVersionUID = 1L;

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

	@Override
	public int hashCode() {
		return Objects.hash(id, statusPagamento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		return id == other.id && statusPagamento == other.statusPagamento;
	}
	
	
	
	
}
