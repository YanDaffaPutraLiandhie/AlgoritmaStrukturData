
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
        System.out.printf("%n");
        int harga = bk1.hitungHargaTotal(5);
        int hargabyr = bk1.hitungHargaBayar(5);
        System.out.println("harga yang harus di bayar :" + hargabyr);
         System.out.println("Harga yang terjual "+ harga);
         System.out.println("Diskon "+bk1.hitungDiskon(5));

        Buku29 bk2 = new Buku29("self reward", "maheera ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilinformasi();
        System.out.printf("%n");
        int hargaAkhr = bk2.hitungHargaTotal(11);
        int hargabayr = bk2.hitungHargaBayar(11);
        System.out.println("harga yang harus di bayar :" + hargabayr);
         System.out.println("Harga yang terjual "+ hargaAkhr);
         System.out.println("Diskon "+bk2.hitungDiskon(11));

        Buku29 BukuYan =  new Buku29("algoritma dan struktur data", "nikola tesla", 160, 29, 19000);
        BukuYan.terjual(9);
        BukuYan.tampilinformasi();

        System.out.printf("%n");
        int hargaAkhir = BukuYan.hitungHargaTotal(9);
        int hargabayar = BukuYan.hitungHargaBayar(9);
        System.out.println("harga yang harus di bayar :" + hargabayar);
         System.out.println("Harga yang terjual "+ hargaAkhir);
         System.out.println("Diskon "+BukuYan.hitungDiskon(9));

    }
}