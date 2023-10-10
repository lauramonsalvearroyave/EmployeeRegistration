package com.mycompany.mina;

import java.util.Scanner;

public class SickLeave extends WorkNotice {
    
    @Override
    public void process (){
    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la duración de la incapacidad (en días): ");
        int duration = scanner.nextInt();

        if (duration >= 1 && duration <= 20) {
            System.out.println("Incapacidad procesada exitosamente.");
        } else {
            System.out.println("Duración de incapacidad no válida.");
        }
        scanner.close();
    }
}
