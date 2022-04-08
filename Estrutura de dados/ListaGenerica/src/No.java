package ListaGenerica.src;
public class No<T> {
    T dado; // não aceita tipo de dado primitivo int = integer
    No<T> proximo, anterior;

// metodo construtor nao tem tipo, nem void;
    public No(T dado){
//this faz referencia ao que pretence ao objeto no caso de existir uma variavel no global com o mesmo nome
        this.dado = dado;
    }
    
}
