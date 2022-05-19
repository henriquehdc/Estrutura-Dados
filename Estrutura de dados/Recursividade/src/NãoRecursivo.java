public class NãoRecursivo {
    public static void main(String[] args) throws Exception {
        
        System.out.println(calcular(2,10));
        
    }

    //versão iterativa 
    private static int calcular(int base, int expoente) {
        int valor = 1;
        for (int i=0; i<expoente;i++){
            valor = valor * base;
        }
        return valor;
    }
}
