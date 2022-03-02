import java.util.Scanner;

class Truk {
    static double muatan;
    static double muatanMaks;

    public Truk(double beratMaks){
        this.muatanMaks = beratMaks;
    }
    public static double getMuatan() {
        if(muatan >= 1000) {
            muatan = muatanMaks - 50;
        }
        return muatan;
    }

    public static void tambahMuatan(double berat){
        muatan+=berat;
    }
    public double getMuatanMaks() {
        return muatanMaks;
    }
}

public class MobilTruk {
    public static void main(String[] args){
        Truk truck = new Truk(1000);
        System.out.println("Muatan Maksimal = " + truck.getMuatanMaks());

        truk.tambahMuatan (500.0);
        System.out.println("Tambah Muatan : 500");
        truk.tambahMuatan (350.0);
        System.out.println("Tambah Muatan : 350");
        truk.tambahMuatan (100.0);
        System.out.println("Tambah Muatan : 100");
        truk.tambahMuatan (150.0);
        System.out.println("Tambah Muatan : 150");

        System.out.println("Muatan sekarang : " + truck.getMuatan());
    }
}