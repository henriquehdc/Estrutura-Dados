package Aula2;

public class Lista {
    
   No inicio , fim;

    public void inserirFinal(int valor){
        No novo = new No(); //novo aqui serve para mostrar o lugar que o objeto está
        novo.dado = valor;       
           if(inicio == null){ //teste para a primeira posição da lista 
              inicio = novo;      
            }else{
                fim.prox = novo;
            }
        fim = novo;    
    } 

    public void imprimmir1(){
        No aux = inicio;

        while (aux != null){
            System.out.println(aux.dado);
            aux = aux.prox;
        }   
    }
}
