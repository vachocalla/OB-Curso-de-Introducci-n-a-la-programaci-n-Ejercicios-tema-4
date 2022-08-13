public class App {
    public static void main( String args[] ){
        int numeroIf;
        numeroIf = 25;
         if( numeroIf > 0 ){
            System.out.println("numeroIf es Positivo");
         } else if( numeroIf < 0 ){
             System.out.println("numeroIf es Negativo");
         } else{
             System.out.println("numeroIf es 0");
         }

         int numeroWhile;
         numeroWhile = 0;
         while( numeroWhile <3 ){
             System.out.println("numeroWhile = " + numeroWhile );
             numeroWhile++;
         }

        int numeroDoWhile;
        numeroDoWhile = 0;
        do{
            System.out.println("numeroDoWhile = " + numeroDoWhile );
            numeroDoWhile++;
        }while( numeroDoWhile <1 );

        int numeroFor;
        for( numeroFor = 0; numeroFor <= 3; numeroFor++ ){
            System.out.println("numeroFor = " + numeroFor );
        }

        String estacion = "Primavera";
        switch ( estacion ){
            case "Primavera":
                System.out.println("La estación del año es: " + estacion );
                break;
            case "Verano":
                System.out.println("La estación del año es: " + estacion );
                break;
            case "Otoño":
                System.out.println("La estación del año es: " + estacion );
                break;
            case "Invierno":
                System.out.println("La estación del año es: " + estacion );
                break;
            default:
                System.out.println( estacion + " no es una estación" );
                break;
        }
    }

}