package com.mycompany.mina;

import java.util.Scanner;

public class Mina {

    public static void main(String[] args) {
        calculateHours();
        processWorkNotice();
            

    }
    
    private static void calculateHours(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar su nombre: ");
        String name = scanner.nextLine();

        System.out.print("Ingrese la hora de entrada: ");
        int startTime = scanner.nextInt();

        System.out.print("Ingrese la hora de salida: ");
        int endTime = scanner.nextInt();
        
       Employee employee = new Employee (startTime, endTime, name);
       int result = employee.calculatedHoursWorked();
       System.out.println("La cantidad de horas trabajadas es: " + result);
    }
    
    private static void processWorkNotice (){
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
                license.process();
                break;
            case 2:
                WorkNotice sickLeave = new SickLeave ();
                sickLeave.process();
                break;
            case 3:
                WorkNotice vacation = new Vacation();
                vacation.process();
                break;
            case 4:
                WorkNotice timeOff = new TimeOff ();
                timeOff.process();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
