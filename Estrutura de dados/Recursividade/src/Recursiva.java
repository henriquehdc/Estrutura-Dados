public class Recursiva {
    public static void main(String[] args) throws Exception {
        
        //Potenciação
        //System.out.println(calcular(2,10));

        //Fibonacci
        //System.out.println(Fibonacci(7));

        //Quantos digitos tem no numero
        //System.out.println(achadigito(13131211 , 1));

        //conversão de binário 
        System.out.println(trocabinario(27));

    }

    private static String trocabinario(int num) {
        if(num == 0){ return "";}
            if ( num % 2 == 0){
                return trocabinario(num / 2 ) + "0"  ;
            }else{
                return  trocabinario(num / 2) + "1";
            } 
        
    }

   /* private static int achadigito(int num, int acha) {
        if(num == 0){ return 0;}
            if ( num % 10 == acha){
                return 1 + achadigito(num / 10 , acha);
            }else{
                return  achadigito(num / 10 , acha);
            }          
    }

    private static int Fibonacci(int posi) {
        if(posi < 3) return 1;
            else{
                return  Fibonacci( posi - 1 ) + Fibonacci( posi - 2 );
            }
    }

    //versão recursiva
    private static int calcular(int base, int expoente) {
        if(expoente == 0){
            return 1;
        }else{
            return  base * calcular(base, expoente - 1);
        }
    }*/


}
