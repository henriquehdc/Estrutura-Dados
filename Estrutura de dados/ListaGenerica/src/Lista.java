//package ListaGenerica.src;
public class Lista<T> {
  
    No<T> inicio, fim;
    int total;
  
    public void Inserir( T dado){
        No<T> aux = new No<T>(dado);

        if (total == 0){
            inicio = aux; 
        }else{
            aux.anterior = fim;
            fim.proximo = aux;
        }
        total ++;
        fim = aux;
    }

    public No<T> Pesquisar(T dado){       
        No<T> pesq = inicio;
        boolean achou = false;

        while (pesq != null && achou == false){
            if(pesq.dado.equals(dado)){
                achou = true;
                break;
            }
            pesq = pesq.proximo;    
        }
    return pesq;    
    }

    public void Deletar (T dado){
        No<T> aux = Pesquisar(dado); 

        if(aux != null){
            if(total == 1){
                inicio=null;
                fim = null;
            }else if( aux == inicio){
                aux.proximo.anterior = null;
                inicio = aux.proximo;
                aux.proximo = null; 
            }else if (aux == fim){
                aux.anterior.proximo = null;
                fim = aux.anterior;
                aux.anterior = null;
            }else {
                aux.anterior.proximo = aux.proximo;
                aux.proximo.anterior = aux.anterior;
                aux.anterior = null;
                aux.proximo = null;
            }
        total --;    
        }
    }
}