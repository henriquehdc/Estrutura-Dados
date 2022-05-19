public class Arvore {
    
    private No raiz;

    public void inserir(int valor){
        //No aux = new No(valor);

        if (raiz == null){
            raiz = new No(valor);

        }else {
            raiz.inserirNo(valor);
        }


    }
    
}
