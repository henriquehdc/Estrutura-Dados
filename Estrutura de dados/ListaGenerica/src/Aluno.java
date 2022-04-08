package ListaGenerica.src;

public class Aluno { 
    String nome;
    int ra;

    //utiliza o metodo construtor para não criar o objeto iniciado com null
    public Aluno(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
    }   

    // println(this) --> retorna o end de memoria do objeto que ele está
    //crt espaço --> equals ai ele já cria tudo só o filé
    @Override
    public boolean equals(Object obj) { //nunca mudar essa linha 
        Aluno aux = (Aluno) obj; // Aqui eu defino o tipo do objeto, no caso classe Aluno
        if (aux.ra == ra && aux.nome.equals(nome)){
            return true;
        }else {
            return false;
        }
        
    }

    @Override
    public String toString() {
        
        return "Nome: " +nome + ", ra: " + ra ;
    }

}
