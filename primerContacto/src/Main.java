//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("¡Concluí la aula 01 y ahora estoy sumergiéndome en Java!");

        int valor = 5;
        System.out.println("Antes de la asignacion: " +valor);
        valor += 10;
        System.out.println("Despues del agregado: "+valor);

        //Las 3 """ es para poder incluir los saltos de linea en el mismo bloque de texto
        String nombre = """ 
                Juan
                Alberto
                Perez Gomez
                """;
        System.out.println(nombre);

        int celcius = 22;
        int far = (int) ((celcius * 1.8) + 32);
        String mensaje = """
                La temperatura en C es: %d y en F es: %d"
                """.formatted(celcius, far);
        System.out.println(mensaje);

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

        }
    }
}
