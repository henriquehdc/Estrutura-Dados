package ArvoreBinaria.src;

public class ArvoreBinaria {
	private No raiz;
	
	public void inserir(int valor) {
		if(raiz == null) {
			raiz = new No(valor);
		} else {
			raiz.inserirNo(valor);
		}
	}

	// método para percorrer a árvore em-ordem
	public void emOrdem(){
		emOrdemRecursivo(raiz);
	}

	private void emOrdemRecursivo(No raiz){
		if(raiz == null){
			return;
		}
		
		emOrdemRecursivo(raiz.esq);
		System.out.println(raiz.dado);
		emOrdemRecursivo(raiz.dir);
	}

	// método para percorrer a árvora pré-ordem
	public void preOrdem(){
		preOrdemRecursivo(raiz);
	}

	public void preOrdemRecursivo(No raiz){
		if(raiz == null){
			return;
		}

		System.out.println(raiz.dado);
		preOrdemRecursivo(raiz.esq);
		preOrdemRecursivo(raiz.dir);
	}

	// método para percorrer a árvore pós-ordem
	public void posOrdem(){
		posOrdemRecursivo(raiz);
	}

	public void posOrdemRecursivo(No raiz){
		if(raiz == null){
			return;
		}

		posOrdemRecursivo(raiz.esq);
		posOrdemRecursivo(raiz.dir);
		System.out.println(raiz.dado);
	}
}
