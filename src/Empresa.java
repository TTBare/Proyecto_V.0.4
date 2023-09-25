
import java.util.Scanner;

public class Empresa {
    private Evento evento;
    private Scanner scanner;
    private String opcionMenuEmpresa;

    public Empresa(Evento evento) {
        this.evento = evento;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenuEmpresa() {   
        do {scanner.nextLine();
            ConsoleUtils.clearConsole();
            System.out.println("=== Menú Empresa ===");
            System.out.println("1. Ver entradas ocupadas");
            System.out.println("2. Agregar entradas");
            System.out.println("0. Volver");
            System.out.print("Ingrese una opción: ");
            opcionMenuEmpresa = scanner.nextLine();
            
    switch (opcionMenuEmpresa) {
        case "1":
        evento.mostrarOcuapadas();
           break;
       case "2":  
        evento.setDatosEntradas();
  
     break;
    case "0":
           ConsoleUtils.clearConsole();
           System.out.print("Volviendo");
           opcionMenuEmpresa="0";
           break;
        //    scanner.nextLine(); 
    default:
            ConsoleUtils.clearConsole();
            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            scanner.nextLine();
            break;
        }
    } while (!opcionMenuEmpresa.equals("0"));
}}