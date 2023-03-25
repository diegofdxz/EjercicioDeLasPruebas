/*
Una clase ClaseCadena que contenga un método DevuelveIniciales que permita devolver las iniciales de los nombres y apellidos que se pasan como argumento en forma de cadena, como se indica a continuación:

String iniciales = ClaseCadena.DevuelveIniciales("Andreas Dulac");
// iniciales debe contener "A.D."
 */
import java.util.Scanner;

public class ClaseCadena {
    public static String DevuelveIniciales(String cadena) {
        //Si el método recibe un argumento incorrecto, debe devolver una cadena vacía.
        try {
            if (cadena.charAt(0) == ' '|| cadena.charAt(cadena.length() - 1) == ' '|| cadena.charAt(cadena.length() - 1) == '.') {
                return "";
            }
        } catch (Exception e) {
            return "";
        }
        String iniciales = "";
        String[] palabras = cadena.split(" ");
        for (String palabra : palabras) {
            iniciales += palabra.charAt(0) + ".";
        }
        return iniciales;
    }
    public static void Interfaz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String cadena = sc.nextLine();
        System.out.println("Las iniciales de la cadena son: " + DevuelveIniciales(cadena));
    }
    public static void main(String[] args) {
        Interfaz();
    }
}
