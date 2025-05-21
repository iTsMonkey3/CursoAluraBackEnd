import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Saber si un numero es par
        /*
        System.out.println("Ingresa un numero: ");
        int numero = teclado.nextInt();

        if ((numero%2) == 0){
            System.out.println("El numero: " + numero + " es par");
        } else {
            System.out.println("El numero: " + numero + " es impar");
        }

         */

        //Resultado segun el promedio
        /*
        System.out.println("Ingresa tu promedio: ");
        double promedio = teclado.nextDouble();

        if (promedio >= 7){
            System.out.println("Con un " + promedio + " pasa el semestre");
        } else if (promedio >= 5) {
            System.out.println("Con un " + promedio + " está en recuperación");
        } else {
            System.out.println("Con un " + promedio + " está reprobado");
        }

         */

        //Comparar contraseña
        /*
        String contra = "12345";
        System.out.println("Introduce la contraseña: ");
        String contrasena = teclado.nextLine();

        if (contrasena.equals(contra)){
            System.out.println("Hola de nuevo, crack");
        } else {
            System.out.println("Alto ahí, pedazo de rata");
        }

         */

        //Numero mayor o igual
        /*
        System.out.println("Ingresa el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = teclado.nextInt();

        if (num1 == num2){
            System.out.println("Son el mismo numero");
        } else if (num1 > num2){
            System.out.println("El mayor es: " + num1);
        } else {
            System.out.println("El mayor es: " + num2);
        }

         */

        //Descuento o no
        /*
        System.out.println("Ingrese el total de su compra: ");
        double total = teclado.nextDouble();

        if (total >= 100){
            System.out.println("Su descuento de 10% se ha aplicado");
            System.out.println("Precio total: " + (total * .90));
        } else {
            System.out.println("Descuento no aplicado");
            System.out.println("Precio total: " + total);
        }

         */

        //Día hábil
        /*
        System.out.println("Ingresa un día de la semana en minúsculas: ");
        String dia = teclado.nextLine();

        if (dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("jueves") || dia.equals("viernes")){
            System.out.println(dia + " es día hábil");
        } else {
            System.out.println(dia + " no es un día hábil");
        }

         */

        //Prestamo en rango
        /*
        System.out.println("Ingrese la cantidad del prestamo: ");
        double prestamo = teclado.nextDouble();

        if (prestamo >= 1000 && prestamo <= 5000){
            System.out.println(String.format("Su prestamo por %.2f ha sido aceptado",prestamo));
        } else {
            System.out.println(String.format("Su prestamo por %.2f ha sido denegado",prestamo));
        }

         */

        //Verificar triangulo
        /*
        System.out.print("Ingrese el primer lado: ");
        int lado1 = teclado.nextInt();

        System.out.print("Ingrese el segundo lado: ");
        int lado2 = teclado.nextInt();

        System.out.print("Ingrese el tercer lado: ");
        int lado3 = teclado.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Los lados pueden formar un triángulo.");
        } else {
            System.out.println("Los lados no pueden formar un triángulo.");
        }

         */

        //Requisitos para donar sangre
        /*
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();

        System.out.println("Ingrese su peso redondeado: ");
        int peso = teclado.nextInt();

        if (edad > 17 && edad < 66 && peso > 50){
            System.out.println("Usted es apto para donar");
        } else if (edad < 18 || edad > 65){
            System.out.println("Lo sentimos, su edad está fuera del rango de 18-65");
        } else {
            System.out.println("Su peso está por debajo de los 50");
        }

        boolean edadValida = edad >= 18 && edad <= 65;
        boolean pesoValido = peso > 50;

        if (edadValida && pesoValido) {
            System.out.println("El donante es compatible para donar sangre.");
        } else {
            System.out.println("El donante no es compatible. Motivo:");
            if (!edadValida) {
                System.out.println("- Debe tener entre 18 y 65 años.");
            }
            if (!pesoValido) {
                System.out.println("- Debe pesar más de 50 kg.");
            }
        }
         */

        //Verificar acceso
        System.out.println("Ingrese su codigo de acceso: ");
        int codigo = teclado.nextInt();

        System.out.println("Ingrese el nivel de acceso: ");
        int nivel = teclado.nextInt();

        boolean codigoValido = (codigo == 2030);
        boolean nivelValido = (nivel >= 1 && nivel <=3);

        if (codigoValido && nivelValido){
            System.out.println("Acceso permitido");
        } else if (!codigoValido) {
            System.out.println("El codigo es incorrecto");
        } else {
            System.out.println("El nivel es incorrecto");
        }


        teclado.close();
    }
}