package ListaDupla.src;

public class Lista {

    No fim , inicio;
    int total; 

   public void Inserir( String nome , int ra ){
    
        No aux = new No();

        aux.nome = nome;
        aux.ra = ra;

        if (total == 0){
           inicio = aux;
        }else{
            fim.prox = aux;
            aux.ant = fim;
        }

        fim = aux;
        total ++;
    }

    public void Imprimir (){
        No aux = inicio;

        while (aux != null){
            System.out.println( aux.nome +"  " +aux.ra);
            aux = aux.prox;
        }   
    }

}
