public class Mahasiswa{
    String nim, nama, telp;

    Mahasiswa(){

    }
    Mahasiswa(String nim, String nama, String telp){
        this.nim = nim;
        this.nama = nama;
        this.telp = telp;
    }
    @Override
    public String toString(){
        return nim + "\t\t" + nama + "\t\t" + telp;
    }

}