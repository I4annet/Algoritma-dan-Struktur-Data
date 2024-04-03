import java.util.Scanner;

public class PostfixMain16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p, Q;

        System.out.print("Masukkan ekspresi matematika (infix): ");
        Q = scanner.nextLine();
        Q = Q.trim();
        Q = Q + ")"; // Menambahkan ')' sebagai penanda akhir ekspresi

        Postfix16 post = new Postfix16(Q.length()); // Menginisialisasi objek Postfix16 dengan panjang ekspresi infix
        p = post.konversi(Q);
        System.out.println("Postfix: " + p);
    }
}
