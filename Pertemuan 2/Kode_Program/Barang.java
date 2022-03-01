
public class Barang{
    String nama;
    int hargaSatuan, jumlah;
    
    void tampil(int n){
        System.out.println("=============================================");
        System.out.println("Nama Barang\t: "+nama);
        System.out.println("Harga satuan\t: "+hargaSatuan);
        System.out.println("Jumlah\t\t: "+ jumlah);
        if (n > 100000){
            System.out.println("Selamat anda mendapatkan Diskon 10%");
        }else if (n >=50000 && n<=100000){
            System.out.println("Selamat anda mendapatkan Diskon 5%");
        }else{
            System.out.println("Anda belum mendapat diskon");
        }
        System.out.println("=============================================");
        
    }
    int hitungHargaTotal(){
        int total = hargaSatuan*jumlah;
    return total;
    }

    int hitungDiskon(int n){
        double diskon;
        if (n > 100000){
            diskon = n * 0.10;
            System.out.println("S");
        }else if (n >=50000 && n<=100000){
            diskon = n *0.05;
        }else{
            diskon = 0;
        }
        return (int)diskon;
    }
    int hitungBayar(int total, int diskon){
        int bayar=0;
        bayar = total-diskon;
        return bayar;
    }

    
}