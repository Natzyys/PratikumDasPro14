import java.util.Scanner;

public class StudiKasus214 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = input.nextLine().trim().toUpperCase();

        String status;

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA") || jenis.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            int peringkat = input.nextInt();

            if (dokumen < 4) {
                status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                        + " dokumen). Dana penghargaan tidak diberikan";
            } else {
                if (peringkat >= 1 && peringkat <= 3) {
                    status = "Dokumen lengkap. Juara " + peringkat
                            + ". Dana penghargaan diberikan";
                } else {
                    status = "Dokumen lengkap, tetapi bukan Juara 1, 2, atau 3"
                            + "Dana penghargaan tidak diberikan";
                }
            }
        } else if (jenis.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = input.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int lolos = input.nextInt();

            if (dokumen < 4) {
                status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                        + " dokumen), Dana penghargaan tidak diberikan";
            } else {
                if (lolos == 1) {
                    status = "Dokumen lengkap. Tim lolos pendanaan. Dana penghargaan diberikan";
                } else {
                    status = "Dokumen lengkap, tetapi tim tidak lolos pendanaan"
                            + "Dana penghargaan tidak diberikan";
                }
            }
        } else if (jenis.equalsIgnoreCase("LAINNYA")) {
            status = "Kegiatan Lainnya tidak memperoleh dana penghargaan";
        } else {
            status = "Jenis kegiatan tidak dikenali";
        }

        System.out.println("Status : " + status);

    }
}