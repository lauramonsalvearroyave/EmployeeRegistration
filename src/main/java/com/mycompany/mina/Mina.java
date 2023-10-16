package com.mycompany.mina;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Mina {

    private static int totalHoursEmployee = 0;
    private static int totalSickLeave = 0;
    private static int totalVacationDays = 0;
    private static int totalHoursTimeOff = 0;
    private static NoticeTotals totals;

    public static void main(String[] args) {
        totals = new NoticeTotals();        
        menu();
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una opción del menú");
        System.out.println("1. Ingreso de jornada");
        System.out.println("2. Ingreso de novedad");
        System.out.println("3. Salir del programa");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                calculateHours();
                break;

            case 2:
                processWorkNotice();
                break;

            case 3:
                System.out.println("Saliendo del programa");
                break;

            default:
                System.out.println("La opción ingresada es incorrecta.");

        }
    }

    private static void calculateHours() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar su nombre: ");
        String name = scanner.nextLine();

        System.out.println("Ingresar su número de cédula: ");
        String id = scanner.nextLine();
        try {
            System.out.print("Ingrese la fecha y hora de entrada en el siguiente formato: dd/MM/yyyy hh:mm ");
            Date startTime = new SimpleDateFormat("dd/MM/yyyy hh:mm").parse(scanner.nextLine());

            System.out.print("Ingrese la fecha y hora de salida en el siguiente formato: dd/MM/yyyy hh:mm ");
            Date endTime = new SimpleDateFormat("dd/MM/yyyy hh:mm").parse(scanner.nextLine());

            Employee employee = new Employee(startTime, endTime, name, id);
            long hours = employee.calculatedHoursWorked();
            totalHoursEmployee += hours;
            System.out.println("La cantidad de horas registradas es de: " + hours + " horas. Ahora tiene " + totalHoursEmployee + " horas de trabajo acumuladas");

            if (totalHoursEmployee < 8) {
                long missingHours = 8 - totalHoursEmployee;
                System.out.println("La cantidad de horas registradas es inferior a 8 horas de trabajo. Le hacen falta: " + missingHours);
            }
        } catch (ParseException ex) {
            System.out.print("Ha ingresado un fecha en un formato no soportado: ");
        }
        menu();
    }

    private static void processWorkNotice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de novedad:");
        System.out.println("1. Licencia");
        System.out.println("2. Incapacidad");
        System.out.println("3. Vacaciones");
        System.out.println("4. Permisos");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                WorkNotice license = new License();
                license.process(totals);
                break;
            case 2:
                WorkNotice sickLeave = new SickLeave();
                sickLeave.process(totalSickLeave);
                break;
            case 3:
                WorkNotice vacation = new Vacation();
                vacation.process(totalVacationDays);
                break;
            case 4:
                WorkNotice timeOff = new TimeOff();
                timeOff.process(totalHoursTimeOff);
                break;
            default:
                System.out.println("Opción no válida");
        }
        menu();
    }
}
