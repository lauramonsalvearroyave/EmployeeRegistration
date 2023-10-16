package com.mycompany.mina;

import java.util.Scanner;


public class TimeOff extends WorkNotice {
    
    @Override
    public void process (int totalHoursTimeOff){
     Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la duración del permiso (en horas): ");
        int duration = scanner.nextInt();
        totalHoursTimeOff+=duration;

        if (totalHoursTimeOff >= 1 && totalHoursTimeOff <= 5) {
            System.out.println("Permiso procesado exitosamente.");
        } else if (totalHoursTimeOff > 5) {
            System.out.println("Permiso denegado. Solicite una licencia de un día.");
        } else {
            System.out.println("Duración de permiso no válida.");
        }

    }

    @Override
    public void process(NoticeTotals totals) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
