package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      
        Departamento departamento = null;
        Proyecto proyecto = null;
        int opcion = 0;
        while (opcion <= 7) {
            System.out.println(" Menú Principal");
            System.out.println(" 1. Crear un Departamento");
            System.out.println(" 2. Añadir un Empleado a un Departamento");
            System.out.println(" 3. Crear un Proyecto Gerencial");
            System.out.println(" 4. Asignar empleados a un Proyecto");
            System.out.println(" 5. Consultar Lista de Empleados del Proyecto ");
            System.out.println(" 6. Salir ");
            System.out.println(" Ingrese la opción que desea realizar:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    departamento = crearDepartamento(scanner);
                    break;

                case 2:
                    anadirEmpleadoDepartamento(scanner, departamento);
                    break;

                case 3:
                    proyecto = crearProyecto(scanner, new Proyecto());
                    break;

                case 4:
                    asignarEmpleadoProyecto(scanner, departamento, proyecto);
                    break;

                case 5:
                    consultarEmpleadosProyecto(scanner, proyecto);
                    break;

                case 6:
                    System.out.println(" Hasta Pronto");
                    break;

                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }
        }
      
    }

    private static void consultarEmpleadosProyecto(Scanner scanner, Proyecto proyecto) {
        if (proyecto == null) {
            System.out.println(" La lista de empleados está vacía. No tiene un proyecto existente.");
            return;
        }
        System.out.println(" A continuación, ingrese el ID del empleado sin puntos ni comas:");
        scanner.nextLine();
        String idEmpleadoConsultado = scanner.nextLine();

        for (Empleado empleado : proyecto.getEmpleadosAsignados()) {
            if (empleado.getIdEmpleado().equals(idEmpleadoConsultado)) {
                System.out.println(" El empleado consultado es: " + empleado.getNombre());
                return;
            }
        }
        System.out.println(" No se encontró un empleado con el ID proporcionado.");
    }

    private static Departamento crearDepartamento(Scanner scanner) {
        System.out.println(" Ingrese el nombre del Departamento: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.println(" Ingrese el código del Departamento: ");
        String codigo = scanner.nextLine();
        Departamento departamento = new Departamento();
        System.out.println(" El Departamento: " + nombre + " con código: " + codigo + " fue creado exitosamente. Puede empezar a añadir los empleados.");
        return departamento;
     
    }

    private static void asignarEmpleadoProyecto(Scanner scanner, Departamento departamento, Proyecto proyecto) {
        if (proyecto == null) {
            System.out.println(" Lo sentimos, no puede asignar un empleado a un proyecto no existente. Debe crear un proyecto primero.");
            return;
        }
        System.out.println(" Ingrese el nombre del empleado a asignar:");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.println(" Ingrese el ID del empleado para continuar:");
        String idEmpleado = scanner.nextLine();
        System.out.println(" Indique el tipo de empleado: ");
        System.out.println(" 1. Gerente");
        System.out.println(" 2. Técnico");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        Empleado empleado;
        if (tipo == 1) {
            empleado = new Gerente(nombre, idEmpleado, departamento);
        } else if (tipo == 2) {
            empleado = new Tecnico(nombre, idEmpleado, departamento);
        } else {
            System.out.println(" La opción es incorrecta. Volviendo al menú principal.");
            return;
        }
        proyecto.getEmpleadosAsignados().add(empleado);
        System.out.println(" El empleado fue asignado al proyecto.");
    }

    private static void anadirEmpleadoDepartamento(Scanner scanner, Departamento departamento) {
        if (departamento == null) {
            System.out.println(" Para agregar el empleado, debe crear un departamento primero.");
            return;
        }
        System.out.println(" \n Ingrese el nombre del empleado: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.println(" \n Ingrese el ID del empleado: ");
        String idEmpleado = scanner.nextLine();
        Empleado empleado = new Empleado(nombre, idEmpleado, departamento);
        departamento.getListaEmpleados().add(empleado);
        System.out.println(" El empleado: " + nombre + " identificado con el ID: " + idEmpleado + " fue creado y añadido a la lista de empleados del departamento.");
    }

    private static Proyecto crearProyecto(Scanner scanner, Proyecto proyecto) {
        System.out.println(" Indique el nombre del proyecto a realizar: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.println(" Ingrese el código del proyecto sin puntos ni comas: ");
        String codigo = scanner.nextLine();
        System.out.println(" Información suministrada del Proyecto: " + nombre + " con código: " + codigo);
        return proyecto;
    }

}