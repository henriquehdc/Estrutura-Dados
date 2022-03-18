package ListaGenerica.src;
public class Teste {
    public static void main(String[] args) {
        
        Lista<String> lista = new Lista<String>();
        lista.Inserir("Henrique");
        lista.Inserir("Humberto");
        lista.Inserir("Selmini");

        System.out.println(lista.Pesquisar("Humberto"));
        lista.Deletar("Humberto");
        System.out.println(lista.Pesquisar("Humberto"));
    }
}
