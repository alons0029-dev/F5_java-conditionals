import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una contraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        Scanner userNameInput = new Scanner(System.in);
        Scanner userNameLogInInput = new Scanner(System.in);
        Scanner userPasswordInput = new Scanner(System.in);
        Scanner userPasswordLogInInput = new Scanner(System.in);

        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.
        System.out.print("New user: ");
        String userName = userNameInput.next();
        System.out.print("New password: ");
        String userPassword = userPasswordInput.next();

        System.out.println("LOG IN");
        System.out.print("User: ");
        String userNameLogIn = userNameLogInInput.next();
        System.out.print("Password: ");
        String userPasswordLogIn = userPasswordLogInInput.next();

        if (userNameLogIn.equals(userName) && userPasswordLogIn.equals(userPassword)) {
            System.out.println("Logged in successfully!");
        } else {
            System.out.println("User auth failed. Check your inputs and try again.");
        }


        userNameInput.close();
        userNameLogInInput.close();
        userPasswordInput.close();
        userPasswordLogInInput.close();
    }
}
