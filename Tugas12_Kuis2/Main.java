package Tugas12_Kuis2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList standings = new DoubleLinkedList();

        // Menambahkan tim ke dalam klasemen
        standings.addTeam(new Team("Jakarta STIN BIN"));
        standings.addTeam(new Team("Jakarta Bhayangkara Presisi"));
        standings.addTeam(new Team("Jakarta Pertamina Pertamax"));
        standings.addTeam(new Team("Jakarta Garuda Jaya"));
        standings.addTeam(new Team("Kudus Sukun Badak"));
        standings.addTeam(new Team("Jakarta LavAni Allo Bank Electric"));
        standings.addTeam(new Team("Palembang Bank Sumsel Babel"));

        Scanner scanner = new Scanner(System.in);
        String teamName, result;
        int choice;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambahkan hasil pertandingan");
            System.out.println("2. Tampilkan klasemen");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama tim: ");
                    teamName = scanner.nextLine();
                    System.out.print("Masukkan hasil (win/draw/loss): ");
                    result = scanner.nextLine();
                    standings.updateTeamPoints(teamName, result);
                    break;
                case 2:
                    standings.printStandings();
                    break;
                case 3:
                    System.out.println("Program dihentikan.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
