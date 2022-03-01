import java.util.Scanner;
public class BarangMain{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        Barang b1 = new Barang();
        
        System.out.print("Masukan nama barang\t: ");
        b1.nama = sc.nextLine();

        System.out.print("Harga Satuan Barang\t: ");
        b1.hargaSatuan = sc.nextInt();
        
        System.out.print("Jumlah Beli barang \t: ");
        b1.jumlah=sc.nextInt();

        int hargaTotal = b1.hitungHargaTotal();
        int diskon = b1.hitungDiskon(hargaTotal);
        int bayar = b1.hitungBayar(hargaTotal, diskon);
        b1.tampil(hargaTotal);
        System.out.println("Harga total dari 2 buah " +b1.nama+" adalah "+bayar);
        System.out.println("=============================================");
    }
    
}