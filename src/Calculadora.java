import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {
    static double num1, num2, resultado;
    static int operacion;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenido a la calculadora");
        System.out.println("ingresa tu primer numero: ");
        num1 = Double.parseDouble(br.readLine());
        System.out.println("ingresa tu segundo numero: ");
        num1 = Double.parseDouble(br.readLine());
        System.out.println("Que operacion quieres realizar: ");
        num1 = Double.parseDouble(br.readLine());
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        operacion = Integer.parseInt(br.readLine());

        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Seleccionaste una opcion incorrecta. Adios");

        }
        System.out.println("Tu resultado es: " + resultado);
    }
}
