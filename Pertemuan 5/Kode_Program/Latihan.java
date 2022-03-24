public class Latihan{
    public int jumlah;
    public String[] kandidat;

    Latihan(int jmlh) {
        this.jumlah = jmlh;
        this.kandidat = new String[jmlh];
    }

    public int Mayoritas(String[] nama, int awal, int batas, int hasil) {
        int middle = batas / 2;
        int kiri = middle - 1;
        int kanan = batas - 1;
        return hitungDC(nama, awal, hasil, kanan, kiri, middle);
    }

    public int hitungDC(String[] nama, int awal, int hasil, int kanan, int kiri, int middle) {
        if(kanan == (kiri + 1) && kiri == (awal + 1)){
            return hasil;
        }else{
            if(awal != kiri){
                if(nama[awal].equalsIgnoreCase(nama[kiri])){
                    return hasil = awal;
                }else{
                    return hitungDC(nama, awal, hasil, kanan, (kiri - 1), middle);
                }
            }else{
                if(nama[middle].equalsIgnoreCase(nama[kanan])){
                    return hasil = middle;
                }else{
                   return hitungDC(nama, middle, hasil, (kanan - 1), kiri, middle);
                }
            }
        }

    }
}