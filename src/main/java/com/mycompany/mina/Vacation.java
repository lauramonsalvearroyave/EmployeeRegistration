package com.mycompany.mina;

import java.util.Scanner;


public class Vacation extends WorkNotice {
    
    @Override
    public void process (){
    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la duración de las vacaciones (en días): ");
        int duration = scanner.nextInt();

        if (duration >= 1 && duration <= 15) {
            System.out.println("Vacaciones procesadas exitosamente.");
        } else {
            System.out.println("Duración de vacaciones no válida.");
        }

        scanner.close();
    }
}
