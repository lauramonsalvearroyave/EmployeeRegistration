package com.mycompany.mina;

import java.util.Scanner;


public class TimeOff extends WorkNotice {
    
    @Override
    public void process (){
     Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la duración del permiso (en horas): ");
        int duration = scanner.nextInt();

        if (duration >= 1 && duration <= 5) {
            System.out.println("Permiso procesado exitosamente.");
        } else if (duration > 5) {
            System.out.println("Permiso denegado. Solicite una licencia de un día.");
        } else {
            System.out.println("Duración de permiso no válida.");
        }

        scanner.close();
    }
}
