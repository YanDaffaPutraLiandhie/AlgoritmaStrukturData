import java.util.Scanner;

public class NilaiAkhirMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("SISTEM MENGHITUNG NILAI AKHIR\n");
        System.out.println("===============================");

        System.out.println("Masukkan nilai tugas (0-100): ");
        int nilaiTugas = scanner.nextInt();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.println("Masukkan nilai kuis (0-100): ");
        int nilaiKuis = scanner.nextInt();
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.println("Masukkan nilai UTS (0-100): ");
        int nilaiUTS = scanner.nextInt();
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.println("Masukkan nilai UAS (0-100): ");
        int nilaiUAS = scanner.nextInt();
        if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }
        System.out.println("===============================");
        System.out.println("===============================");

        double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.4 * nilaiUAS;

        System.out.println("Nilai akhir mahasiswa: " + nilaiAkhir);

        if (nilaiAkhir > 80 || nilaiAkhir <= 100) {
            System.out.println("nilai huruf : A");
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 73 || nilaiAkhir <= 80) {
            System.out.println("nilai huruf : B+");
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 65 || nilaiAkhir <= 73) {
            System.out.println("nilai huruf : B");
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("SELAMAT ANDA LULUS");
        }else if(nilaiAkhir>60 || nilaiAkhir<=65){
            System.out.println("nilai huruf : C+");
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("SELAMAT ANDA LULUS");
        }else if(nilaiAkhir>50 || nilaiAkhir<=60){
            System.out.println("nilai huruf : C");
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("SELAMAT ANDA LULUS");
        }else if(nilaiAkhir>39 || nilaiAkhir<=50){
            System.out.println("nilai huruf : D");
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("MOHON MAAF ANDA TIDAK LULUS");
        }else if( nilaiAkhir<=39){
            System.out.println("nilai huruf : E");
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("MOHON MAAF ANDA TIDAK LULUS");
        }
       
        
        }
        
            
        
    }
