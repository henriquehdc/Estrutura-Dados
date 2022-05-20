
package ArvoreBinaria.src;

public class No {
	int dado;
	No esq;
	No dir;
	
	public No(int dado) {
		this.dado = dado;
	}
	
	public void inserirNo(int valor) {
		if(valor > dado){
			if(dir == null){
				dir = new No(valor);
			} else{
				dir.inserirNo(valor);
			}
		} else{
			if(valor < dado){
				if(esq == null){
					esq = new No(valor);
				} else{
					esq.inserirNo(valor);
				}
			}
		}
	}
}
