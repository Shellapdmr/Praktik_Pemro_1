import java.util.Scanner;

public class Tugas6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan bilangan deret maksimal yang akan di tampilkan  = ");
        int n = scan.nextInt();
        int i = 0;
        int angka = 0;
        while (i != n) {
            if (i == Math.pow(5, angka)) {
                System.out.println(i);
                angka++;
            }
            i++;
        }
    }
    
}