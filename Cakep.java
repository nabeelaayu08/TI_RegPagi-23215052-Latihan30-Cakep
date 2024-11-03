package Cakep;

/**
 *NAMA : NABE'ELA AYU NING TYAS ZAHRA
 * PRODI : TEKNIK INFORMATIKA
 * NIM       : 23215052
 * Deskripsi Program : Program ini menampilkan sebuah pertanyaan yang harus dijawab.
 */
import java.util.Scanner;

public class Cakep {
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[31m";
    public static final String GREEN = "\033[32m";
    public static final String YELLOW = "\033[33m";
    public static final String BLUE = "\033[34m";
    public static final String CYAN = "\033[36m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan pertanyaan
        System.out.print(RED + "Kamu " + GREEN + "ngerjain sendiri " + YELLOW + "latihan 17 " + BLUE + "sampe " + CYAN + "latihan 30 ini? \n" + RESET);
        System.out.print("Jawab " + CYAN + "(Yoi/Enggak) : " + RESET);
        String jawaban = input.nextLine().toLowerCase();

        // Memeriksa jawaban dan menampilkan respon
        if (jawaban.equals("yoi")) {
            System.out.println(BLUE + "Cakep Bener." + RESET);
            System.out.println(GREEN + "Good Job" + RESET);
        } else if (jawaban.equals("enggak")) {
            System.out.println(RED + "Tetep cakep sih." + RESET);
            System.out.println(CYAN + "Sing penting paham konsep nya yee." + RESET);
            System.out.println("Keep the code works dude");
        } else {
            System.out.println(RED + "Jawaban tidak valid." + RESET);
        }

        input.close();
    }
}

