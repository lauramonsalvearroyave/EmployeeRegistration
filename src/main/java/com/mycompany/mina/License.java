package com.mycompany.mina;

import java.util.Scanner;


public class License extends WorkNotice{
     
    @Override
    public void process (){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de licencia:");
        System.out.println("1. Licencia normal");
        System.out.println("2. Licencia de maternidad");
        System.out.println("3. Licencia de paternidad");

        int licenseType = scanner.nextInt();

        switch (licenseType) {
            case 1:
                System.out.print("Ingrese la duración de la licencia (en días): ");
                int duration = scanner.nextInt();
                if (duration > 4) {
                    System.out.println("No se puede procesar la licencia. Tome vacaciones.");
                } else {
                    System.out.println("Licencia procesada exitosamente.");
                }
                break;
            case 2:
                System.out.println("Licencia de maternidad de máximo 180 días.");
                break;
            case 3:
                System.out.println("Licencia de paternidad de máximo 15 días.");
                break;
            default:
                System.out.println("Opción no válida");
        }
        scanner.close();
     }    
}
