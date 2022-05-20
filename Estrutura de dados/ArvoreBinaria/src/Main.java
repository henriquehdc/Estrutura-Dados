package ArvoreBinaria.src;

public class Main {
	public static void main(String[] args) {
		
		ArvoreBinaria ab = new ArvoreBinaria();
		ab.inserir(50);
		ab.inserir(70);
		ab.inserir(39);
		ab.inserir(42);
		ab.inserir(23);
		ab.inserir(63);
		ab.inserir(42);

		ab.emOrdem();
		//ab.preOrdem();
		//ab.posOrdem();
		
	}
}

