//package ListaGenerica.src;
public class Teste {
    public static void main(String[] args) {
        
        Lista<Aluno> lista = new Lista<Aluno>();
        lista.Inserir(new Aluno("Pedro", 123));
        lista.Inserir(new Aluno("Matheus", 456));
        lista.Inserir(new Aluno("Henrique", 789));
       
    }
}