import java.util.Scanner;

class truk {
   
    static double muatan;
    static double muatanMaks;

    public truk(double beratMaks) {
        this.muatanMaks = beratMaks;
    }

    public static double getMuatan() {
        if(muatan >= 1000) {
            muatan = muatanMaks - 50;
        }
        return muatan;
    }

    public static void tambahMuatan (double berat) {
        muatan += berat;
    }

    public double getMuatanMaks() {
        return muatanMaks;
    }
}

class TruckSoal {
    public static void main(String[] args) {
        truk truck = new truk(1000);
        System.out.println("Muatan Maximal = " + truck.getMuatanMaks());

        truk.tambahMuatan (500.00);
        System.out.println("Tambah Muatan: 500");

        truk.tambahMuatan (350.00);
        System.out.println("Tambah Muatan: 350");

        truk.tambahMuatan (100.00);
        System.out.println("Tambah Muatan: 100");

        truk.tambahMuatan (150.00);
        System.out.println("Tambah Muatan: 150");

        System.out.println("Muatan sekarang : " + truck.getMuatan());
    }
}