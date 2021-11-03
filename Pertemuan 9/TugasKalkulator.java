import java.util.Scanner;

public class TugasKalkulator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numbers1, numbers2, choice, result= 0;
        System.out.println("....:Kalkulator Sederhana:....");
        System.out.println("Pilih salah satu menu di bawah ini : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("-----------------------------");
 
        // Pilihan Operasi
        System.out.print("Menu yang di pilih: ");
        choice = input.nextInt();

        // input data
        System.out.print("Masukan Angka Pertama: ");
        numbers1 = input.nextInt();
        System.out.print("Masukan Angka Kedua: ");
        numbers2 = input.nextInt();
 
        switch (choice)
        {
            case 1 : result = numbers1 + numbers2; break;
            case 2 : result = numbers1 - numbers2; break;
            case 3 : result = numbers1 / numbers2; break;
            case 4 : result = numbers1 * numbers2; break;
        }
        System.out.println("Hasil: " + result);
    }
}