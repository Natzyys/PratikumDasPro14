import java.util.Scanner;

public class StudiKasus114 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, hargaPerCup = 18000;

        System.out.print("masukkan jumlah cup : ");
        jumlahCup = input.nextInt();

        System.out.print("masukkan uang bayar :");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = totalHarga - diskon;
        System.out.println("total harga :" + totalHarga);
        System.out.println("diskon : " + diskon);
        System.out.println("total bayar : " + totalBayar);
    
        if (uangBayar < totalBayar) {
            System.out.println("uang bayar kurang : " + (totalBayar - uangBayar));
        } else {
            int kembalian = uangBayar - totalBayar;
            System.out.println("kembalian : " + kembalian);
        }
    }
}