package com.mycompany.mina;

import java.util.Scanner;

public class License extends WorkNotice {

    @Override
    public void process(NoticeTotals totals) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de licencia:");
        System.out.println("1. Licencia temportal");
        System.out.println("2. Licencia de maternidad");
        System.out.println("3. Licencia de paternidad");

        int licenseType = scanner.nextInt();
        int duration = 0;
        switch (licenseType) {
            case 1:
                System.out.print("Ingrese la duración de la licencia (en días): ");
                duration = scanner.nextInt();
                totals.setTotalTemporalDays(totals.getTotalTemporalDays() + duration);
                if (totals.getTotalTemporalDays() > 4) {
                    System.out.println("No se puede procesar la licencia. Tome vacaciones.");
                } else {
                    System.out.println("Licencia procesada exitosamente.");
                }
                break;
            case 2:
                System.out.println("Ingrese la duración de su licencia de maternidad (en días).");
                duration = scanner.nextInt();
                totals.setTotalMotherhoodDays(totals.getTotalMotherhoodDays()+ duration);
                if (totals.getTotalMotherhoodDays() > 180) {
                    System.out.println("Solo puede tomar un máximo de 180 días");
                } else {
                    System.out.println("Licencia procesada exitosamente.");
                }
                break;
            case 3:
                System.out.println("Ingrese la duración de su licencia de paternidad (en días).");
                duration = scanner.nextInt();
                totals.setTotalFatherhoodDays(totals.getTotalFatherhoodDays() + duration);
                if (totals.getTotalFatherhoodDays() > 15) {
                    System.out.println("Solo puede tomar un máximo de 15 días");
                } else {
                    System.out.println("Licencia procesada exitosamente.");
                }
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    @Override
    public void process(int totalDays) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
