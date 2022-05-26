public class Main {
// resolucion ejercicio sesion 4
    public static void main(String[] args) {
        numIf();
        numWhile();
        numDoWhile();
        numFor();
        numSwitch();
        
    public static void numIf (){
        int numeroIf = -5;
        if (numeroIf < 0){
            System.out.println("es un numero negativo");
        } else if (numeroIf > 0){
            System.out.println("es un numero positivo");
        } else {
            System.out.println("el numero es 0");
        }
    }
    public static void numWhile(){
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }
    public static void numDoWhile(){
        int numeroDoWhile = 2;
        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }while(numeroDoWhile < 3);
    }
    public static void numFor(){
        for (int numeroFor= 1; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
    }
    public static void numSwitch(){
        var estacion = "INVIERNO";
        switch(estacion){
            case "VERANO": System.out.println("es verano"); break;
            case "OTOÑO": System.out.println("es otoño"); break;
            case "INVIERNO": System.out.println("es invierno"); break;
            case "PRIMAVERA": System.out.println("es primavera"); break;
            default: System.out.println("no es una estacion...");
        }
    }
}
