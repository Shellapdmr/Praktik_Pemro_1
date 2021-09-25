import java.util.Scanner;

public class Tampilanhasil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai a = 10 ");
        double a = scanner.nextDouble();
        System.out.print("Masukan nilai b = 5 ");
        double b = scanner.nextDouble();

        double hasil = a + b;
        System.out.println("Hasil a + b = " + (int) hasil);
        hasil = a - b;
        System.out.println("Hasil a + b = " + (int) hasil);
        hasil = a * b;
        System.out.println("Hasil a + b = " + (int) hasil);
        hasil = a / b;
        System.out.println("Hasil a + b = " + (int) hasil);
        hasil = a % b;
    }
}