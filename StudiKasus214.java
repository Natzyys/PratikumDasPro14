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

        if (jumlahDokumen >= 4 && peringkatJuara == 1) {
            status = "Lolos, dana penghargaan diberikan";
        } else if (jumlahDokumen >= 4 && peringkatJuara == 2) {
            status = "Lolos, dana penghargaan diberikan";
        } else if (jumlahDokumen >= 4 && peringkatJuara == 3) {
            status = "Lolos, dana penghargaan diberikan";
        } else {
            status = "Dokumen tidak lengkap atau bukan juara, dana penghargaan tidak diberikan";
        }
        System.out.println("Status: " + status);
    }
}
