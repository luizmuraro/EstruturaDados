
public class Caixa {
	Caixa proximo;
	Pessoa pessoa;
	
	public Caixa(Caixa proximo, Pessoa pessoa){
		this.pessoa = pessoa;
		this.proximo = proximo;
	}
	public Caixa(Pessoa pessoa) {
		this.pessoa = pessoa;
		this.proximo = null;
	}
	

	public Caixa getProximo() {
		return proximo;
	}

	public void setProximo(Caixa proximo) {
		this.proximo = proximo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
