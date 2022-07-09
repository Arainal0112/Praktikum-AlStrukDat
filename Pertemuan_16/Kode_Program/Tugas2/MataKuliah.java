public class MataKuliah{
    String kode, matkul;
    int sks;

    MataKuliah(String kode, String matkul, int sks){
        this.kode=kode;
        this.matkul=matkul;
        this.sks=sks;
    }

    public String toString(){
        return kode + "\t\t" + matkul + "\t\t" + sks;
    }


}