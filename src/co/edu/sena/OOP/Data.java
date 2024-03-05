package co.edu.sena.OOP;


public class Data {
    // Metodos generales //
    //Metodo para calcular el area de un triangulo//
    public double areaTriangulo(double numero1, double numero2) {
        return numero1 * numero2 / 2;
    }

    //Metodo para sumar dos numeros//
    public double sumarDosNumeros(double numero1, double numero2) {
        return numero1 + numero2;
    }

    //Metodo para elevar al cuadrado//
    public double elevadoCuadrado(double numero1) {
        return Math.pow(numero1, 2);
    }

    //Metodo para convertir de euros a dólares//
    public double convertirEurosADolares(double numero1) {
        return numero1 * 1.15;
    }

    //Metodo para hallar valor del área y del perímetro de un cuadrado//

    public double areaCuadrado(double numero1) {
        return Math.pow(numero1, 2);
    }

    public double perimetroCuadrado(double numero1) {
        return numero1 * 4;
    }

    //Metodo para área y volumen de un cilindro//

    public double areaCilindro(double numero1, double numero2) {
        return ((2 * 3.1415) * numero1) * (numero1 + numero2);
    }

    public double volumenCilindro(double numero1, double numero2) {
        return 3.1415 * Math.pow(numero1, 2) * numero2;
    }

    //Metodo para hallar el radio de una circunferencia, longitud y área del círculo//

    public double areaCirculo(double numero1) {
        return 3.1415*(Math.pow((numero1/2),2));
    }
    public double radioCirculo(double numero) {
        return numero;
    }

    //Metodo para calcular el promedio de tres numeros//

    public double promedioTresNumeros(double numero1, double numero2, double numero3) {
        return (numero1 + numero2 + numero3) / 3;
    }

    //Metodos Condicionales//

    //Metodo para saber número positivo o negativo//

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
   //Metodo para saber cual es mayor y cual es menor//

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

    //Metodo para saber de 3 enteros cual es mayor//

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

}

