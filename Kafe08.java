import java.util.Scanner;

public class Kafe08 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in); 
        //Deklarasi
        boolean keanggotaan;
        int jmlhKopi, jmlhTeh, jmlhRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, nominalBayar, totalHarga;
        float diskon = 10 / 100f;
        
        System.out.print("Masukkan Keanggotaan (true/false) : ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan Jumlah Pembelian Kopi : ");
        jmlhKopi = input.nextInt();
        System.out.print("Masukkan Jumlah Pembelian Teh : ");
        jmlhTeh= input.nextInt();
        System.out.print("Masukkan Jumlah Pembelian Roti : ");
        jmlhRoti = input.nextInt();

        totalHarga = (jmlhKopi * hargaKopi) + (jmlhTeh * hargaTeh) + (jmlhRoti * hargaRoti);

        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotaan Pelanggan " + keanggotaan);
        System.out.println("Item Pembelian "+ jmlhKopi + " Kopi, " + jmlhTeh + " Teh, " + jmlhRoti + " Roti. ");
        System.out.println("Nominal Bayar Rp " + nominalBayar);

        input.close();
        }    
}
