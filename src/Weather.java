import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario que ingrese la temperatura en celsius de su ciudad (La pregunta y la respuesta deberá estar en una sola línea) y según ello devuelva lo siguiente:

        Scanner userWeatherInput = new Scanner(System.in);

        System.out.println("Escriba la temperatura (ºC) de su ciudad:");
        System.out.println("(Escriba únicamente el número)");
        int userWeather = userWeatherInput.nextInt();

        //Imprime el resultado
        if (userWeather < 0) {
            //Si es bajo 0: Te estás congelando
            System.out.println("Te congelas.");
        } else if (userWeather >= 0 && userWeather <= 10) {
            //Si es entre 0 y 10: Hace mucho frío
            System.out.println("Hace mucho frío");
        } else if (userWeather >= 11 && userWeather <= 17) {
            //Si es entre 11 y 17: Con un abrigo estás bien
            System.out.println("Con un abrigo estarás bien.");
        } else if (userWeather >= 18 && userWeather <= 25) {
            //Si es entre 18 y 25: Parece que ha llegado el verano
            System.out.println("Llegó el verano.");
        } else if (userWeather >= 26 && userWeather <= 35) {
            //Si es entre 26 y 35: Que calooorrrrr
            System.out.println("Mucho calor.");
        } else if (userWeather >= 36 && userWeather < 50) {
            //Si es mayor a 36: Ahí no hay quien viva
            System.out.println("Ahí no hay quien viva.");
        } else {
            System.out.println("¿Cómo estás con vida?");
        }

        userWeatherInput.close();
    }
}