public class TrafficLights {
    public static void main(String[] args) {

        //Escribe un programa que basado en el color del semáforo verde, amarillo o rojo determine las acciones de un conductor 
        String trafficLight = "Green";

        //Si es verde imprime en la terminal: Puedes seguir
        //Si es amarillo imprime en la terminal: Ten cuidado
        //Si es rojo imprime en la terminal: ¡¡¡Para!!!
        //Si es otro color imprime en la terminal: El semáforo está dañado

        if (trafficLight.equals("Green")) {
            System.out.println("Puede seguir.");
        } else if (trafficLight.equals("Yellow")) {
            System.out.println("Tenga cuidado.");
        } else if (trafficLight.equals("Red")) {
            System.out.println("¡Pare!");
        } else {
            System.out.println("Semáforo dañado");
        }

        //Cambia el valor de la variable, corre el programa y mira el resultado
    }
}
