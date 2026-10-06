import java.util.Scanner;

public class StudiKasus214 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan, status;
        int jumlahDokumen, peringkatJuara;

        System.out.print("masukkan nama mahasiswa : ");
        namaMahasiswa = input.nextLine();

        System.out.print("masukkan jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/lainnya) : ");
        jenisKegiatan = input.nextLine();

        System.out.print("masukkan jumlah dokumen : ");
        jumlahDokumen = input.nextInt();

        System.out.print("masukkan peringkat juara (1/2/3) isi 0 jika bukan juara: ");
        peringkatJuara = input.nextInt();

        
    }
}
