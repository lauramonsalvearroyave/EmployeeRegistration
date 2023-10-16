package com.mycompany.mina;

import java.util.Scanner;


public class Vacation extends WorkNotice {
    
    @Override
    public void process (int totalVacationDays){
    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la duración de las vacaciones (en días): ");
        int duration = scanner.nextInt();
        totalVacationDays+=duration;
        if (totalVacationDays >= 1 && totalVacationDays <= 15) {
            System.out.println("Vacaciones procesadas exitosamente.");
        } else {
            System.out.println("Duración de vacaciones no válida.");
        }

    }

    @Override
    public void process(NoticeTotals totals) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
