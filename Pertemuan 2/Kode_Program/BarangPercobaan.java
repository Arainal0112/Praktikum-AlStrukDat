public class BarangPercobaan{
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;
    
    BarangPercobaan(){
    }

    BarangPercobaan(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }

    void tampilBarang(){
        System.out.println("Nama\t\t= "+namaBarang);
        System.out.println("Jenis\t\t= "+jenisBarang);
        System.out.println("Stock\t\t= "+stok);
        System.out.println("Harga Satuan\t= "+hargaSatuan);
    }
    void tambahStok(int n){
        stok=stok+n;
    }
    void kurangiStok(int n){
        if(n>0){
            stok=stok-n;
        }
    }
    int hitungHargaTotal(int jumlah){
        return jumlah*hargaSatuan;
    }
    
    
    
}