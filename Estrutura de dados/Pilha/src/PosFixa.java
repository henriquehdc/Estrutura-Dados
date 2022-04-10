package Pilha.src;
import java.util.Scanner;
import java.util.Stack;

public class PosFixa {
    public static void main(String[] args) {    

        Scanner ler = new Scanner(System.in);
        String infixa, posfixa;     

        System.out.println("Infixa -->");
        infixa = ler.nextLine();

        posfixa = converter (infixa);

        System.out.println(posfixa);

    }

    private static String converter(String infixa) {
        Stack <Character> pilha = new Stack<Character>();
        String posfixa = "";
        char ch;
            for(int i = 0; i<infixa.length();i++){
                ch = infixa.charAt(i);
                switch (ch){
                    case '+':
                    case '-':
                    case '*':
                    case '^':
                    case '/':
                    case '%':                      
                        while (!pilha.isEmpty() && (Prioridade(ch) <= Prioridade(pilha.peek()))){
                            posfixa += pilha.pop();
                        }
                        pilha.push(ch);
                        break;
                    case '(':
                        pilha.push(ch);
                        break;
                    case ')':
                        while (pilha.peek() != '('){
                            posfixa += pilha.pop();
                        } 
                        pilha.pop();// serve para descartar o ( que entraria na string sem precisar
                        break;   
                    default:
                        posfixa += ch;                   
                }
            }
        
        while (!pilha.isEmpty()){
            posfixa += pilha.pop();
        }

    return posfixa;
    }

    private static int Prioridade( char ch){
        int prioridade = 0;

            switch (ch){
                case  '(' :
                    prioridade = 1;
                    break; 
                case '+':
                case '-':
                    prioridade = 2;
                    break;
                case '/':
                case '%':
                case '*':
                    prioridade = 3;
                    break;
                
                default : prioridade = 4;                               
            }

    return prioridade;
    }

    

}