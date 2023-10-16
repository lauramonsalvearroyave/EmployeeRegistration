package com.mycompany.mina;

import java.util.Scanner;

public class SickLeave extends WorkNotice {
    
    @Override
    public void process (int totalSickLeave){
    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la duración de la incapacidad (en días): ");
        int duration = scanner.nextInt();
        totalSickLeave+=duration;
        if (totalSickLeave <= 20) {
            System.out.println("Incapacidad procesada exitosamente.");
        } else {
            System.out.println("Duración de incapacidad no válida.");
        }
    }

    @Override
    public void process(NoticeTotals totals) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
