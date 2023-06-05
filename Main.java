import java.util.*;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        // Aqui estan registrados los empleados existentes (son tres)
        Empleado[] empleadosRegistrados = new Empleado[3];
        empleadosRegistrados[0] = new Developer("Leonardo", "Díaz Morales", "leoparker@gmail.com", "DIML000310DQ4", "peanut2000");
        empleadosRegistrados[1] = new Developer("Luis", "Martinez Julian", "altersun2077@gmail.com", "MAJL000327M93", "inthevoidinthevoidvoidvoidvoid");
        empleadosRegistrados[2] = new Diseñador("David", "Martínez Hernández", "davidmarhez01@gmail.com", "MAHD010610HV4", "Lanatupatronax100pre");

        // Aqui se imprimen las oraciones para que se ingrese información
        System.out.println("Ingrese su Nombre:");
           String nombre = scanner.nextLine();
        System.out.println("Ingrese su Apellido:");
           String apellido = scanner.nextLine();
        System.out.println("Ingrese su Correo Electrónico:");
           String correoElectronico = scanner.nextLine();
        System.out.println("Ingrese su RFC (Homoclave):");
           String rfc = scanner.nextLine();
        System.out.println("Ingrese su Contraseña:");
           String contraseña = scanner.nextLine();

        // Aqui se crea el nuevo empleado
        Empleado nuevoEmpleado = new Empleado(nombre, apellido, correoElectronico, rfc, contraseña);

        // Aqui se sortea el puesto asignado
        int puestoIndex = (int) (Math.random() * 9);
        String puesto;
        if (puestoIndex < 4) { puesto = "Developer"; } 
        else if (puestoIndex < 7) { puesto = "Diseñador"; } 
        else { puesto = "Gerente"; }

        nuevoEmpleado.asignarPuesto(puesto);

        // Un mensaje de bienvenida
        System.out.println("\n¡ENHORABUENA y Bienvenido, " + nombre + "!\nEs un gusto tenerte de vuelta en Hexagon Development Community");
        nuevoEmpleado.mostrarInformacion();

        // Se imprime la info de los demas empleados
        if (puesto.equals("Gerente")) 
        {
            System.out.println("Información de los demás empleados:");
            for (Empleado empleado : empleadosRegistrados) { empleado.mostrarInformacion(); }
        }

        scanner.close();
}
  
}






