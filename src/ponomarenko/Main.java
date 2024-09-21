package ponomarenko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScheduleManager scheduleManager = new ScheduleManager();

        while (true) {
            System.out.println("Введите имя пациента (или 'завершить' для выхода):");
            String patientName = scanner.nextLine();
            if (patientName.equalsIgnoreCase("завершить")) break;

            System.out.println("Введите возраст пациента:");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Введите время доставки (например, '2023-10-01 10:00'):");
            String deliveryTime = scanner.nextLine();

            Patient patient = new Patient(patientName, age);
            Schedule schedule = new Schedule(patient, deliveryTime);

            while (true) {
                System.out.println("Введите название лекарства (или 'готово' для завершения):");
                String drugName = scanner.nextLine();
                if (drugName.equalsIgnoreCase("готово")) break;

                System.out.println("Введите дозировку лекарства:");
                String dosage = scanner.nextLine();

                Drug drug = new Drug(drugName, dosage);
                schedule.addDrug(drug);
            }
            scheduleManager.addSchedule(schedule);
        }

        System.out.println("\nВсе расписания:");
        scheduleManager.displaySchedules();

        scanner.close();
    }
}