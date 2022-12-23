package listaEncadeada;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private int tamanho;
	
	public ListaEncadeada() {
		this.tamanho = 0; 
	}
	
	public Celula getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Celula primeiro) {
		this.primeiro = primeiro;
	}
	public Celula getUltimo() {
		return ultimo;
	}
	public void setUltimo(Celula ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void adicionar(String valor) {
		Celula celula = new Celula(valor);
		if (primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			this.ultimo.setProximo(celula);
			this.ultimo = celula;
		}
		
		tamanho++;
	}
	
	public void remover(String valorProcurado) {
		Celula anterior = null;
		Celula atual = this.primeiro;
		for (int i = 0; i< this.getTamanho(); i++) {
			if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
				if (atual == primeiro && atual== ultimo) {	
					this.primeiro=null;
					this.ultimo=null;
				} else if (atual == primeiro) {
					primeiro = atual.getProximo();
					atual.setProximo(null);
				} else if (atual == ultimo) {
					this.ultimo = anterior;
					anterior.setProximo(null);
				} else {
					anterior.setProximo(atual.getProximo());
					atual = null;
				}
				this.tamanho--;
				break;
			}
			anterior = atual;
			atual = atual.getProximo();
		}
	}
	
	public Celula get(int posicao) {
		Celula atual = this.primeiro;
		for (int i = 0; i<posicao; i++) {
			if (atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		
		return atual;
	}
	
}