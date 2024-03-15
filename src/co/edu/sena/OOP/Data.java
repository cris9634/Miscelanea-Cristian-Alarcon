package co.edu.sena.OOP;


import java.util.Scanner;

public class Data {
    // Metodos generales
    //Metodo para calcular el area de un triangulo
    public double areaTriangulo(double numero1, double numero2) {
        return numero1 * numero2 / 2;
    }

    //Metodo para sumar dos números
    public double sumarDosNumeros(double numero1, double numero2) {
        return numero1 + numero2;
    }

    //Metodo para elevar al cuadrado
    public double elevadoCuadrado(double numero1) {
        return Math.pow(numero1, 2);
    }

    //Metodo para convertir de euros a dólares
    public double convertirEurosADolares(double numero1) {
        return numero1 * 1.15;
    }

    //Metodo para hallar valor del área y del perímetro de un cuadrado

    public double areaCuadrado(double numero1) {
        return Math.pow(numero1, 2);
    }

    public double perimetroCuadrado(double numero1) { return numero1 * 4;}

    //Metodo para área y volumen de un cilindro

    public double areaCilindro(double numero1, double numero2) {
        return ((2 * 3.1415) * numero1) * (numero1 + numero2);
    }

    public double volumenCilindro(double numero1, double numero2) {
        return 3.1415 * Math.pow(numero1, 2) * numero2;
    }

    //Metodo para hallar el radio de una circunferencia, longitud y área del círculo

    public double areaCirculo(double numero1) {
        return 3.1415*(Math.pow((numero1/2),2));
    }
    public double radioCirculo(double numero1) {
        return numero1;
    }

    //Metodo para calcular el promedio de tres numeros

    public double promedioTresNumeros(double numero1, double numero2, double numero3) {
        return (numero1 + numero2 + numero3) / 3;
    }

    //Metodos Condicionales

    //Metodo para saber número positivo o negativo
    public String positivoNegativo(double numero1) {
    String mensaje;
        if (numero1 > 0) {
            mensaje = "El número es positivo";
        }
        else {
            mensaje = "El número es negativo";
        };
        return mensaje;
    }
   //Metodo para saber cual es mayor y cual es menor
    public String mayorMenor(double numero1, double numero2) {
        String mensaje;
        if (numero1 > numero2) {
            mensaje = "El número menor es: "+numero2+" y el mayor es "+numero1;
        }
        else {
            mensaje = "El número menor es: "+numero1+" y el mayor es "+numero2;
        };
        return mensaje;
    }

    //Metodo para saber de 3 enteros cual es mayor

    public String mayorOMenor (double numero1, double numero2, double numero3) {
        String mensaje;
        if(numero1 > numero2){
            if(numero1 > numero3){
                mensaje = "Mayor es "+numero3;
            }
            else{
                mensaje = "Menor es "+numero1;
            };
        }
        else{
            if(numero2 > numero3){
                mensaje = "Mayor es "+numero2;
            }
            else{
                mensaje = "Menor es "+numero3;
            };
        };
        return mensaje;
    }

    //Metodo para sumar si A es menor que B, de lo contrario restar

    public double sumarRestar(double numero1, double numero2) {
        if (numero1<numero2){
                return numero1+numero2;
        }
        else {
            return numero1-numero2;
        }
    }

    //Metodo para determinar Cociente entre A y B

    public double cociente(double numero1, double numero2) {
        if (numero2<1){
            System.out.println("División por cero no definida");
        };
        return numero1/numero2;
    }

    //Metodo para sumar si entre A y B  hay número negativo, de lo contrario multiplicar

    public double sumarSi(double numero1, double numero2) {
        if (numero1<0 || numero2<0){
            return numero1+numero2;
        }
        else {
            return numero1*numero2;
        }
    }

    //Metodo para determinar año bisiesto
    public String bisiestoSi(double numero1) {
        String mensaje;
        if ((numero1 % 4 == 0) && (numero1 %100 !=0 || numero1 % 400 == 0)) {
            return mensaje = "es bisiesto";
        }
        else {
            return mensaje = "no es bisiesto";
        }
    }

    //Metodos Ciclos

    //Metodo para Multiplos de 3 de 1 a 100

    public double multiplos3(double numero1) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            };
        };
        return numero1;
    }

    //Metodo para impares de 0 a 100
    public double impares(double numero) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2!= 0) {
                System.out.println(i);
            };
        };
        return numero;
    }

    //Metodo para números pares entre el 1 y el 100

    public double numerospares(double numero) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            };
        }
        return numero;
    }

    //Metodo para cuadrados de los números del 1 al 30

    public double cuadradosDel(double numero1) {
        for (int i = 1; i <= 30; i++) {
            System.out.println(Math.pow(i, 2));
        };
        return numero1;
    }
    //Metodo para suma cuadrados 100 primeros números naturales

    public double sumaCuadrado(double numero1) {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i * i;
        }
        return suma;
    }

    //Metodo para dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los números comprendidos entre ellos en secuencia ascendente.

    public double secuenciaAscendente(double numero1, double numero2) {
        if(numero1<numero2){
            for (double i = numero1; i <= numero2; i++) {
                System.out.println(i);
            }
        return numero1;
        }else{
            for (double i = numero2; i <= numero1; i++) {
                System.out.println(i);
            }
        return numero2;
        }
    }

    //Metodo para sumar todos los números que se digitan por teclado mientras no sea cero.

    public double sumaNocero(double num1) {
        Scanner scr = new Scanner(System.in);
        double suma = 0;
        do{
            System.out.print("Ingrese un número: ");
            num1 = scr.nextDouble();
            suma = suma + num1;
        }while (num1 != 0);

        return suma;
    }
}


