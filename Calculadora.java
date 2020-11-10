import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Calculadora {
    private static int menu;

    public static void main(String[] args) throws NumberFormatException, IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        do {
            System.out.println("");
            System.out.println("***********************************");
            System.out.println("********* Calculadora 10% *********");
            System.out.println("***********************************");
            System.out.println("");
            System.out.println("Seleccione la operacion a realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("4. Multiplicacion");
            System.out.println("3. Division");
            System.out.println("5. Salir");

            try {
                BigDecimal operacion = new BigDecimal(br.readLine());
                BigDecimal num1, num2, result;
                switch (operacion.toString()) {
                    case "1":
                        System.out.println("Ingrese primer número");
                        num1 = new BigDecimal(br.readLine());
                        System.out.println("Ingrese segundo número");
                        num2 = new BigDecimal(br.readLine());

                        result = sumar(num1, num2);
                        System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es:  " + result);
                        menu = 6;
                        break;
                    case "2":
                        System.out.println("Ingrese primer número");
                        num1 = new BigDecimal(br.readLine());
                        System.out.println("Ingrese segundo número");
                        num2 = new BigDecimal(br.readLine());

                        result = restar(num1, num2);
                        System.out.println("El resultado de restar " + num1 + " - " + num2 + " es:  " + result);
                        menu = 6;
                        break;
                    case "4":
                        System.out.println("Ingrese primer número");
                        num1 = new BigDecimal(br.readLine());
                        System.out.println("Ingrese segundo número");
                        num2 = new BigDecimal(br.readLine());

                        result = multiplicar(num1, num2);
                        System.out.println("El resultado de multiplicar " + num1 + " * " + num2 + " es:  " + result);
                        menu = 6;
                    case "3":
                        System.out.println("Ingrese primer número");
                        num1 = new BigDecimal(br.readLine());
                        System.out.println("Ingrese segundo número (distinto de cero)");
                        num2 = new BigDecimal(br.readLine());

                        if (!num2.equals(BigDecimal.ZERO)) {
                            result = dividir(num1, num2);
                            System.out.println("El resultado de dividir " + num1 + " / " + num2 + " es:  " + result);
                            menu = 6;
                        } else {
                            System.out.println("La operación no se puede realizar, el segundo número es cero");
                        }
                        break;
                    case "5":
                        System.out.println("Fin de calculadora.");
                        menu = 6;
                        break;
                    default:
                    System.out.println("Debe ingresar un numero del 1 al 5");
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Debe ingresar un numero del 1 al 5");
            }
        } while (menu <= 5);
    }

    public static BigDecimal sumar(BigDecimal a, BigDecimal b) {
        return (a.add(b));
    }

    public static BigDecimal restar(BigDecimal a, BigDecimal b) {
        return (a.subtract(b));
    }

    public static BigDecimal multiplicar(BigDecimal a, BigDecimal b) {
        return (a.multiply(b));
    }
    
    public static BigDecimal dividir(BigDecimal a, BigDecimal b) {
        return (a.divide(b));
    }

}
