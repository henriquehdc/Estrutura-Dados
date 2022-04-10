package Pilha.src;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    //LIFO - Last In First Out, mesma coisa que pilha
    // POP -> Remover e PUSH -> Inserir
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        Stack <Integer> pilha = new Stack<Integer>();

        System.out.print("Insira um numero para trasnformar ele em binário:");
        int valor = ler.nextInt();
    
        while ( valor >=1 ){
            pilha.push(valor % 2);
            valor = valor/2;        
        }

        //!pilha.isEmpty() funciona tambem para ver se está vazio
        // pilha.peek() -> exibe o elemento do top da pilha
        while (pilha.empty() == false){            
            System.out.print(pilha.pop()+ " ");
        }      
        
        

        //notação polonesa reversa  ou notação Pós-fixa  (AB+) 
    }
}
