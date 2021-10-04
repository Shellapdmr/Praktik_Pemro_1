import java.util.Scanner;

public class TugasLima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama Anda : ");
        String nama = scanner.nextLine();
        System.out.print("Masukan IPK Anda : ");
        double ipk = scanner.nextDouble();
        System.out.print("Masukan berapa lama masa study anda : ");
        int tahun = scanner.nextInt();
         
        if (ipk >= 3.51 && ipk <= 4.00 && tahun <= 4) {
          System.out.println("Predikat Anda adalah dengan pujian tertinggi atau Summa Cumlaude ");
        } else if (ipk >= 3.51 && ipk <= 4.00 && tahun > 4) {
          System.out.println("Predikat Anda adalah dengan pujian atau Camlaude ");
        } else if (ipk >= 3.01 && ipk < 3.51) {
          System.out.println("Predikat Anda sangat Memuaskan");
        } else if (ipk >= 2.76 && ipk < 3.01) {
          System.out.println("Predikat Anda Memuaskan");
        } else if (ipk >= 2.00 && ipk < 2.76) {
          System.out.println("Predikat Anda Cukup");
        } else if (ipk < 2.00) {
          System.out.println("Anda Tidak lulus");
        } else if (ipk > 4.00 || ipk < 0) {
          System.out.println("Tidak Valid");
        }
      }
    }