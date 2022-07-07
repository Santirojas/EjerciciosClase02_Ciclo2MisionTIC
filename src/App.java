import java.net.PasswordAuthentication;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class App {
    public static void main(String[] args) throws Exception {
        ejercicio17();

    }

    private static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        String fecha;
        int numero1;
        int n_suerte = 0;
        System.out.println("Conozca su el número de la suerte....");
        System.out.println("Ingrese su fecha de naciemiento en el formato dd/mm/yyyy: ");
        fecha = sc.nextLine();
        var arrayfecha = fecha.split("/");
        var dia = Integer.parseInt(arrayfecha[0]);
        var mes = Integer.parseInt(arrayfecha[1]);
        var ano = Integer.parseInt(arrayfecha[2]);
        numero1 = dia + mes + ano;
        char[] numeros1 = String.valueOf(numero1).toCharArray();
        for (int i = 0; i < numeros1.length; i++) {
            n_suerte = n_suerte + Character.getNumericValue(numeros1[i]);
        }
        System.err.printf("Su número de la suerte es: %d", n_suerte);
        sc.close();
    }

    private static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        double precio_unidad;
        int iva;
        int unidades;
        System.out.println("Ingrese el precio por unidad del producto sin IVA: ");
        precio_unidad = sc.nextDouble();
        System.out.println("Ingrese el porcentaje de IVA que se debe aplicar por el producto: ");
        iva = sc.nextInt();
        System.out.println("Ingrese la cantidad de productos vendidos: ");
        unidades = sc.nextInt();
        double precio_venta = (precio_unidad + (precio_unidad * iva / 100)) * unidades;
        System.out.printf("El precio de venta por los %d productos es : $%,.2f ", unidades, precio_venta);
        sc.close();
    }

    private static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        int m;
        int N;
        System.out.println("Ingrese un numero N al cual le desea quitar las ultimas m cifras: ");
        N = sc.nextInt();
        System.out.println("Ingrese el número m:");
        m = sc.nextInt();
        String N_string = String.valueOf(N);
        if (m > N_string.length()) {
            System.out.printf(
                    "El valor de m= %d ingresado es mayor que el número de cifras del número N=%d, Vuelva a intentar...\n ",
                    m, N);
            ejercicio3();
        } else if (m == N_string.length()) {
            System.out.printf(
                    "El numero %d tiene las mismas cifras que el valor ingresado de m=%d, por favor intente con otros valores... \n",
                    N, m);
            ejercicio3();
        } else {
            String N_new_str = N_string.substring(0, N_string.length() - m);
            int N_new = Integer.parseInt(N_new_str);
            System.out.printf("El nuevo valor de N es: %d", N_new);
        }
        sc.close();

    }

    private static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        double km_h;
        double m_s;
        System.out.println("Ingrese la velocidad en km/h para pasarla a m/s: ");
        km_h = sc.nextDouble();
        m_s = (km_h / (60 * 60)) * 1000;
        System.out.printf("El equivalente de %.2f km/h es %.3f m/s", km_h, m_s);
        sc.close();
    }

    private static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double h;
        System.out.println("Ingrese los catetos del triangulo para calcular su hipotenusa: ");
        System.out.println("Cateto 1: ");
        a = sc.nextDouble();
        System.out.println("Cateto 2: ");
        b = sc.nextDouble();
        if (a == 0 | b == 0) {
            System.out.println("Los catetos deben tener valores superiores a 0");
            System.out.println("No es posible realizar el calculo con los valores ingresados");
            ejercicio5();

        } else {
            h = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
            System.out.printf("La hipotenusa de los catetos a=%.2f y b=%.2f es h=%.2f", a, b, h);
        }
        sc.close();

    }

    private static void ejercicio6() {
        Scanner sc = new Scanner(System.in);
        Integer numero;

        System.out.println("Ingrse un numero para ver si es multiplo de 10: ");
        numero = sc.nextInt();
        if (numero % 10 == 0) {
            System.out.printf("El numero %d es multiplo de 10", numero);
        } else {
            System.out.printf("El numero %d no es multiplo de 10", numero);

        }
        sc.close();

    }

    private static void ejercicio7() {
        Scanner sc = new Scanner(System.in);
        Character letra;

        System.out.println("Ingrese un carcater para verificar si está en mayuscula:  ");
        letra = sc.next().charAt(0);
        if (Character.isUpperCase(letra)) {
            System.out.printf("El caracter %s fue ingresado en mayuscula", letra);
        } else {
            System.out.printf("El caracter %s no fue ingresado en mayuscula", letra);
        }
        sc.close();

    }

    private static void ejercicio8() {
        Scanner sc = new Scanner(System.in);
        Double num1;
        Double num2;

        System.out.println("Ingrese un número: ");
        num1 = sc.nextDouble();
        System.out.println("Ingrese otro  número para hacer la division diferente de cero: ");
        num2 = sc.nextDouble();

        if (num2 == 0) {
            System.out.println(
                    "El valor ingresado del segundo numero es incorrecto, no se puede hacer una división por 0");
            System.out.println("Vuelva a ingresar los numeros...");
            ejercicio8();
        } else {
            System.out.printf("La división de los numeros ingresados es %.3f:", (num1 / num2));
        }
        sc.close();

    }

    private static void ejercicio9() {
        Scanner sc = new Scanner(System.in);
        Integer num1;
        Integer num2;
        Integer num3;

        System.out.println("Ingrese tres numeros para verificar cual es el mayor: ");
        System.out.printf("Número 1: \n");
        num1 = sc.nextInt();
        System.out.printf("Número 2: \n");
        num2 = sc.nextInt();
        System.out.printf("Número 3: \n");
        num3 = sc.nextInt();

        System.out.println("El numero mayor es el " + Math.max(Math.max(num1, num2), num3));
        sc.close();
    }

    private static void ejercicio10() {
        Scanner sc = new Scanner(System.in);
        Integer H;
        Integer M;
        Integer S;

        System.out.println("Ingrese los valores de una hora para verificar ");
        System.out.printf("Hora: \n");
        H = sc.nextInt();
        System.out.printf("Minutos: \n");
        M = sc.nextInt();
        System.out.printf("Segundos: \n");
        S = sc.nextInt();

        if (H > 24 | H < 0 | M > 60 | M < 0 | S > 60 | S < 0) {
            System.out.println("El formato de hora ingresado no es correcto....Ingrese nuevamente");
            ejercicio10();

        } else {
            System.out.printf("La hora ingresada es: %d:%d:%d", H, M, S);
        }
        sc.close();

    }

    private static void ejercicio11() {
        Scanner sc = new Scanner(System.in);
        Integer mes;
        String plantilla = "%s tiene %d días";
        String nombre_mes = "";
        Integer dias = 0;

        System.out.printf("Ingrese el numero del mes del 1 al 12: ");
        mes = sc.nextInt();
        if (mes > 12 | mes < 1) {
            System.out.printf("El mes ingresado no es valido \n");
            ejercicio11();
        } else {
            if (mes == 1 | mes == 3 | mes == 5 | mes == 7 | mes == 8 | mes == 10 | mes == 12) {
                dias = 31;
                switch (mes) {
                    case 1:
                        nombre_mes = "Enero";
                        break;
                    case 3:
                        nombre_mes = "Marzo";
                        break;
                    case 5:
                        nombre_mes = "Mayo";
                        break;
                    case 7:
                        nombre_mes = "Julio";
                        break;
                    case 8:
                        nombre_mes = "Agosto";
                        break;
                    case 10:
                        nombre_mes = "Octubre";
                        break;
                    case 12:
                        nombre_mes = "Diciembre";
                        break;
                    default:
                        System.out.println("Mes ingresado no valido");
                }
                System.out.printf(plantilla, nombre_mes, dias);
            } else if (mes == 2) {
                dias = 28;
                nombre_mes = "Febrero";
                System.out.printf(plantilla, nombre_mes, dias);

            } else {
                dias = 30;
                switch (mes) {
                    case 4:
                        nombre_mes = "Abril";
                        break;
                    case 6:
                        nombre_mes = "Junio";
                        break;
                    case 9:
                        nombre_mes = "Septiembre";
                        break;
                    case 11:
                        nombre_mes = "Noviembre";
                        break;
                    default:
                        System.out.println("Mes ingresado no valido");
                }
                System.out.printf(plantilla, nombre_mes, dias);
            }
        }
        sc.close();
    }

    private static void ejercicio12() {
        Integer i = 0;
        System.out.println("Con el ciclo while");
        while (i <= 100) {
            if (i % 3 != 0) {
                System.out.print(i + "\t");
            }
            i++;
        }

        System.out.println();
        System.out.println("Con el ciclo do while");
        i = 0;
        do {
            i++;
            if (i % 3 != 0) {
                System.out.print(i + "\t");
            }
        } while (i < 100);

        System.out.println();
        System.out.println("Con el ciclo for");
        for (i = 0; i <= 100; i++) {
            if (i % 3 != 0) {
                System.out.print(i + "\t");
            }
        }
    }

    private static void ejercicio13() {
        Scanner sc = new Scanner(System.in);
        String cambio;
        Double valor;

        System.out.println(
                "Ingrese el tipo de cambio que desea realizar, si es de pesos a dolares digite P, de lo contrario digite D: ");
        cambio = sc.nextLine();

        switch (cambio.toUpperCase()) {
            case "P":
                System.out.println(
                        "Ingrese el valor en pesos que desea cambiar a dolares es: (La tasa de cambio al 6 de julio de 2022 es de $4300 COP");
                valor = sc.nextDouble();
                System.out.printf("El total en dolares de los $%,.2f COP es $%,.2f US", valor, valor / 4300);
                break;
            case "D":
                System.out.println(
                        "Ingrese el valor en dolares que desea cambiar a pesos es: (La tasa de cambio al 6 de julio de 2022 es de $4300 COP");
                valor = sc.nextDouble();
                System.out.printf("El total en dolares de los $%,.2f US es $%,.2f COP", valor, valor * 4300);
                break;
            default:
                System.out.println("El tipo de valor ingresado erroneo, por favor vuelva a intentar...");
                ejercicio13();

        }

        sc.close();
    }

    private static void ejercicio14() {
        Integer f0 = 0;
        Integer f1 = 1;
        Integer fn = f0;
        Integer N = 10;
        System.out.println("La sucesion de Fibonaci para los primeros " + N + " terminos es:  ");
        for (Integer index = 0; index < N; index++) {
            System.out.printf(fn + "\t");
            f0 = f1;
            f1 = fn;
            fn = f1 + f0;
        }
    }

    private static void ejercicio15() {
        Integer N = 5;
        Integer suma1 = 1;
        Integer suma2 = 0;

        System.out.println("La suma de los factoriales del 0 hasta " + N + " es: ");
        for (int j = 0; j <= N; j++) {
            for (int i = 1; i <= j; i++) {
                suma1 = suma1 * i;
            }
            suma2 = suma2 + suma1;
            suma1 = 1;

        }
        System.out.println(suma2);
    }

    private static void ejercicio16() {
        String letras_alfabeto_inverso = "ZYWXVUTSRQPONMLKJIHGFEDCBA";
        Integer longitud_cadena = letras_alfabeto_inverso.length();
        for (int i = 0; i < longitud_cadena; i++) {
            System.out.println(letras_alfabeto_inverso.substring(i, longitud_cadena));
        }
    }

    private static void ejercicio17(){
        for (int i = 5; i >=0; i--) {
            if (i==3) {
                System.out.println("E");
            } else {
                System.out.println(i);
            }
            
        }
        System.out.println("BOOOM!!!");
    }
}
