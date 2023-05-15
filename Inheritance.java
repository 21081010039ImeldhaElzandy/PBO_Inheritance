package inheritance;

public class Inheritance {
    
    // KOLEKSI
    public static class Koleksi {
        String judul;
        String penerbit;
        int tahun;
        
    public Koleksi(String judul, String penerbit, int tahun) {
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    
    public String toString() {
        return "Judul = " + judul + "\n" + 
                "Penerbit = " + this.penerbit + "\n" + 
                "Tahun = " + this.tahun;
    }
}
    
    // BUKU
    public static class Buku extends Koleksi {
        String penulis;
        
    public Buku(String judul, String penulis, String penerbit, int tahun){
        super(judul, penerbit, tahun);
        this.penulis = penulis;
    }
        
    public String toString() {
        return "Judul Buku = " + this.judul + "\n" +
                "Penulis = " + this.penulis + "\n" +
                "Penerbit = " + this.penerbit + "\n" + 
                "Tahun = " + this.tahun + "\n";
    }
}
    
    // MAJALAH
    public static class Majalah extends Koleksi {
        String edisi;
        
    public Majalah(String judul, String edisi, String penerbit, int tahun) {
        super(judul, penerbit, tahun);
        this.edisi = edisi;
    }
    
    public String toString() {
        return "Judul Majalah = " + this.judul + "\n" +
                "Edisi = " + this.edisi + "\n" +
                "Penerbit = " + this.penerbit + "\n" + 
                "Tahun = " + this.tahun + "\n";
    }
}
    
    // SKRIPSI
    public static class Skripsi extends Buku {
        String npm;
        
    public Skripsi(String npm, String penulis, String judul, String penerbit, int tahun) {
        super(judul, penulis, penerbit, tahun);
        this.npm = npm;
    }
        
    public String toString() {
        return "NPM = " + this.npm + "\n" +
                "Penulis = " + this.penulis + "\n" + 
                "Judul = " + this.judul + "\n" +
                "Penerbit = " + this.penerbit + "\n" +
                "Tahun = " + this.tahun + "\n";
    }
}
    
    // MAIN
    public static void main(String[] args) {
        Buku buku = new Buku("Hujan", 
                "Tere Liye", 
                "Gramedia Pustaka Umum", 
                2014);
        System.out.println(buku.toString());
        
        Majalah majalah = new Majalah("Bobo", 
                "1/2022", 
                "PT Gramedia Majalah", 
                2022);
        System.out.println(majalah.toString());
        
        Skripsi skripsi = new Skripsi("21081010039", 
                "Imeldha Elzandy", 
                "Analisis dan Implementasi Metode Sentimen Analisis pada Data Twitter menggunakan Bahasa Indonesia.", 
                "UPN", 
                2024);
        System.out.println(skripsi.toString());
    }
}
