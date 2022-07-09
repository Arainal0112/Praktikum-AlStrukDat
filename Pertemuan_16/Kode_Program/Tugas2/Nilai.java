import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Nilai{
    String kdNilai;
    double nilai;
    Mahasiswa m;
    MataKuliah mk;

    public Nilai(String kdNilai, double nilai, Mahasiswa m, MataKuliah mk){
        this.kdNilai=kdNilai;
        this.nilai=nilai;
        this.m=m;
        this.mk=mk;
    }
    List<Mahasiswa> mahasiswas = new ArrayList<>();
    List<MataKuliah> matkul = new ArrayList<>();

    public void tambahmhs(Mahasiswa... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void tambahmk(MataKuliah... matakulaih){
        matkul.addAll(Arrays.asList(matakulaih));
    }
    public void tampilmhs(){
        mahasiswas.stream().forEach(mhs ->{
            System.out.println(" "+ mhs.toString());
        });
    }
    public void tampilmk(){
        matkul.stream().forEach(mk ->{
            System.out.println(" "+ mk.toString());
        });
    }
    int linearSearchMhs(String nim){
        for(int i=0; i<mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
    int linearSearchMk(String matkuls){
        for(int i=0; i<matkul.size(); i++){
            if(matkuls.equals(matkul.get(i).kode)){
                return i;
            }
        }
        return -1;
    }

    Mahasiswa carimhs(String nim){
        for(int i=0; i< mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return mahasiswas.get(i);
            }
        }
        return null;
    }
    MataKuliah carimk(String matkuls){
        for(int i=0; i< matkul.size(); i++){
            if(matkuls.equals(matkul.get(i).kode)){
                return matkul.get(i);
            }
        }
        return null;
    }
    public String toString(int idx1, int idx2){
        return mahasiswas.get(idx1).nim +"\t\t"+mahasiswas.get(idx1).nama+"\t\t"+matkul.get(idx2).matkul+"\t"+matkul.get(idx2).sks+ "\t";
    }
}