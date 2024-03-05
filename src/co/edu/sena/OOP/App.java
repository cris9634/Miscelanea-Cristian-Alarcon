package co.edu.sena.OOP;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;
        int opcion;

        Data data = new Data();

        System.out.println("Ejercicio Miscelanea OOP Java");
        System.out.println("-----------------------------");
        System.out.println("Menu Principal");
        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("3. Ciclos");
        System.out.println("99. Salir");
        System.out.println("Ingrese una opción: ");

        opcion = scr.nextInt();
        switch (opcion) {
            case 1: {
                // submenu operadores //
                System.out.println("Categoria Operadores");
                System.out.println("1 Calcular área triángulo");
                System.out.println("2 Sumar dos números");
                System.out.println("3 Ingresar un número y visualizar el número elevado al cuadrado");
                System.out.println("4 Convierta de euros a dólares");
                System.out.println("5 Valor del área y del perímetro de un cuadrado");
                System.out.println("6 Determine el área y el volúmen de un cilindro");
                System.out.println("7 Radio de una circunferencia, longitud y área del círculo");
                System.out.println("8 Calcular el promedio de tres (3) números");
                System.out.println("digite  la opcion: ");
                opcion = scr.nextInt();
                switch (opcion) {
                    case 1: {
                        System.out.println("----------");
                        System.out.println("Calcular el área del triángulo");
                        System.out.println("Ingrese la base: ");
                        numero1 = scr.nextDouble();
                        System.out.println("Ingrese la altura: ");
                        numero2 = scr.nextDouble();
                        System.out.println("El área del triángulo es: " + data.areaTriangulo(numero1, numero2));
                        break;
                    }
                    case 2: {
                        System.out.println("----------");
                        System.out.println("Sumar dos números");
                        System.out.println("Ingrese el primer número: ");
                        numero1 = scr.nextDouble();
                        System.out.println("Ingrese el segundo número: ");
                        numero2 = scr.nextDouble();
                        System.out.println("El resultado es: " + data.sumarDosNumeros (numero1,numero2));
                        break;
                    }
                    case 3: {
                        System.out.println("----------");
                        System.out.println("Ingresar un número y visualizar el número elevado al cuadrado");
                        System.out.println("Ingrese el número: ");
                        numero1 = scr.nextDouble();
                        System.out.println("El número elevado al cuadrado es: " + data.elevadoCuadrado(numero1));
                        break;
                    }
                    case 4: {
                        System.out.println("---------");
                        System.out.println("Convertir euros a dolares");
                        System.out.println("Ingrese los euros: ");
                        numero1 = scr.nextDouble();
                        System.out.println("La conversión de euros a dolares es: " + data.convertirEurosADolares(numero1));
                        break;
                    }
                    case 5: {
                        System.out.println("---------");
                        System.out.println("Valor del área y del perímetro de un cuadrado");
                        System.out.println("Ingrese la base: ");
                        numero1 = scr.nextDouble();
                        System.out.println("Ingrese la altura: ");
                        numero2 = scr.nextDouble();
                        System.out.println("El área del cuadrado es: " + data.areaCuadrado(numero1));
                        System.out.println("El perímetro del cuadrado es: " + data.perimetroCuadrado(numero1));
                        break;
                    }
                    case 6: {
                        System.out.println("---------");
                        System.out.println("Determine el área y el volúmen de un cilindro");
                        System.out.println("Ingrese la base: ");
                        numero1 = scr.nextDouble();
                        System.out.println("Ingrese la altura: ");
                        numero2 = scr.nextDouble();
                        System.out.println("El área del cilindro es: " + data.areaCilindro(numero1, numero2));
                        System.out.println("El volumen del cilindro es: " + data.volumenCilindro(numero1, numero2));
                        break;
                    }
                    case 7: {
                        System.out.println("---------");
                        System.out.println("Radio de una circunferencia, longitud y área del círculo");
                        System.out.println(" Digite el lado en cm: ");
                        numero1 = scr.nextDouble();
                        System.out.println("La longitud de la circunferencia es: " + data.areaCirculo(numero1) + " cm2 ");
                        System.out.println("El área del círculo es: " + data.radioCirculo(numero1) + " cm2 ");
                        break;
                    }
                    case 8: {
                        System.out.println("---------");
                        System.out.println("Calcular el promedio de tres (3) números");
                        System.out.println("Ingrese el primer número: ");
                        numero1 = scr.nextDouble();
                        System.out.println("Ingrese el segundo número: ");
                        numero2 = scr.nextDouble();
                        System.out.println("Ingrese el tercer número: ");
                        numero3 = scr.nextDouble();
                        System.out.println("El promedio de los tres números es: " + data.promedioTresNumeros(numero1, numero2, numero3));
                        break;
                    }
                    default: System.out.println("Opción no valida");
                        break;
                };
                break;
            }
            case 2: {
                // submenu condicionales //
                System.out.println("Categoria Condicionales");
                System.out.println("1 Número positivo o negativo");
                System.out.println("2 Cual es mayor y cual es menor");
                System.out.println("3 De tres enteros cual es el mayor y cual el menor");
                System.out.println("4 Sumar si A es menor que B, de lo contrario restar");
                System.out.println("5 Cociente entre A y B");
                System.out.println("6 Sumar si entre A y B  hay número negativo, de lo contrario multiplicar");
                System.out.println("7 Determinar año bisiesto");
                System.out.println("digite  la opcion: ");
                opcion = scr.nextInt();
                switch (opcion) {
                    case 1: {
                        System.out.println("-------");
                        System.out.println("Número positivo o negativo");
                        System.out.println("Ingrese un número: ");
                        numero1 = scr.nextDouble();
                        if (numero1 > 0) {
                            System.out.println("El número es positivo");
                        }
                        else {
                            System.out.println("El número es negativo");
                        };
                        break;
                    }
                    case 2: {
                        System.out.println("-------");
                        System.out.println("Cual es mayor y cual es menor");
                        System.out.println("Ingrese un número: ");
                        numero1 = scr.nextDouble();
                        System.out.println("Ingrese otro número: ");
                        numero2 = scr.nextDouble();
                        if (numero1 > numero2) {
                            System.out.println(numero1 + " es mayor que " + numero2);
                        }
                        else {
                            System.out.println(numero2 + " es mayor que " + numero1);
                        };
                        break;
                    }
                    case 3: {

                    }



                }


            }; break;
            case 3: {}; break;
            case 99: {
                System.out.println("SALIR DEL  PROGRAMA");
            }; break;
            default: System.out.println("Opción no valida");
                break;
        };


    };



};
