
public class Lista {
	Caixa primeira;
	int qtdElemento = 0;
	
	public void adicionarEmPrimeiro(Pessoa p){
		Caixa nova = new Caixa(p);
		nova.setProximo(primeira); 
		primeira = nova;
		qtdElemento++;
	}
	public void adicionarEmUltimo() {
		
	}
	public void adicionarEmPos() {
		
	}
}
