public class Mahasiswa extends Manusia {
    private String nim;
    private String nama;
    private double ipk;
    private String alamat;
    private String semester;

    public Mahasiswa(String nim, String nama, double ipk, String alamat, String semester) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.alamat = alamat;
        this.semester = semester;

    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return this.nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public double getIPK() {
        return this.ipk;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setSemester(String semester) {
        this.nim = semester;
    }

    public String getSemester() {
        return this.semester;
    }



    public void getDetail() {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%10s %10s %5s %10s %10s %20s %5s", "NIM", "NAMA", "IPK", "BERAT BADAN", "TINGGI BADAN", "ALAMAT", "SEMESTER");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%10s %10s %5s %10s %10s %20s %5s", this.nim, this.nama.toUpperCase(), this.ipk, String.valueOf(this.beratBadan), String.valueOf(this.tinggiBadan), String.valueOf(this.alamat), String.valueOf(this.semester));
        System.out.println();
    }
}