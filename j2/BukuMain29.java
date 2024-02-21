import java.util.Scanner;

public class BukuMain29 {

    public static void main(String[] args) {
       
        Buku29 bk1 = new Buku29();
        bk1.judul = "today Ends Tomorow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilinformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilinformasi();

        Buku29 bk2 = new Buku29("self reward", "maheera ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilinformasi();

        

}
}