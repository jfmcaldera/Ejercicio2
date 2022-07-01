public class Main {
    public static void main(String[] args) {
        //comparar(0);

        /*int numeroWhile=1;

        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile +1;*/

         int numeroDoWhile=3;

         do{
             System.out.println(numeroDoWhile);
             numeroDoWhile = numeroDoWhile +1;
         } while (numeroDoWhile<3);
        }

        for (int numeroFor =0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
            numeroFor = numeroFor + 1;

        }

    }

    public static void comparar(float numeroif) {
        if(numeroif==0){
            System.out.println("numeroif es igual a 0");
        }else if (numeroif<0){
            System.out.println("numeroif es un número negativo" + numeroif);
        }else {
            System.out.println("Es un número positivo"+numeroif);
        }

    }

}
