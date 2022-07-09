import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class Main{
    public static Comparator<Nilai> CompNilai = (n1, n2) ->{
        if (n1.nilai < n2.nilai){
            return -1;
        }else if(n1.nilai > (n2).nilai){
            return 1;
        }else {
            return 0;
        }
    };
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);

        List<Nilai> nil = new ArrayList<>();
        Nilai n = new Nilai("", 0, null, null);
        Mahasiswa m = new Mahasiswa("20001", "Thalah", "021xxx");
        Mahasiswa m1 = new Mahasiswa("20002", "Zubair", "021xxx");
        Mahasiswa m2 = new Mahasiswa("20003", "Abdur", "021xxx");
        Mahasiswa m3 = new Mahasiswa("20004", "Sa'ad", "021xxx");
        Mahasiswa m4 = new Mahasiswa("20005", "Sa'id", "021xxx");
        Mahasiswa m5 = new Mahasiswa("20006", "Ubaidah", "021xxx");
        n.tambahmhs(m, m1, m2, m3, m4, m5);

        MataKuliah mk = new MataKuliah("00001", "Internet of things", 3);
        MataKuliah mk1 = new MataKuliah("00002", "Algoritma dan Struktur data", 2);
        MataKuliah mk2 = new MataKuliah("00003", "Algoritma dan Pemrograman", 2);
        MataKuliah mk3 = new MataKuliah("00004", "Praktikum Algoritma dan Struktu data", 3);
        MataKuliah mk4 = new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3);
        n.tambahmk(mk, mk1, mk2, mk3, mk4);

        Nilai n1 = null;
        String nimMhs, mkMhs;
        int pil =0;
        do{
            System.out.println("************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("************************************************");
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Input Nilai\n2. Tampil Nilai\n3. Mencari Nilai Mahasiswa\n4. Urut Data Nilai\n5. Keluar");
            System.out.println("************************************************");
            System.out.print("Pilih : ");
            pil = sc.nextInt();
            switch(pil){
                case 1 :
                    System.out.println("Masukan Data : ");
                    System.out.print("Kode\t: ");
                    String kd = ss.next();
                    System.out.print("Nilai\t: ");
                    double nilmhs = ss.nextDouble();

                    System.out.println("");
                    System.out.println("DAFTAR MAHASISWA");
                    System.out.println("************************************************");
                    System.out.println("NIM\t\tNama\t\tTelf\t\t");
                    n.tampilmhs();
                    System.out.print("Pilih Mahasiswa by NIM : ");
                    nimMhs = sc.next();
                    Mahasiswa mhss;
                    mhss = n.carimhs(nimMhs);

                    System.out.println("");
                    System.out.println("DAFTAR MATA KULIAH");
                    System.out.println("************************************************");
                    System.out.println("Kode\t\tMata Kuliah\t\t\t\tSKS\t\t");
                    n.tampilmk();
                    System.out.print("Pilih MK by Kode : ");
                    mkMhs = ss.next();
                    MataKuliah mkl;
                    mkl = n.carimk(mkMhs);
                    
                    n1 = new Nilai(kd, nilmhs, mhss, mkl);
                    nil.add(n1);
                    break;
                case 2:
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("************************************************");
                    System.out.println("NIM\t\tNama\tMata Kuliah\t\t\tSKS\tNilai");
                    for(int i=0; i<nil.size();i++){
                        n.linearSearchMhs(nil.get(i).m.nim);
                        n.linearSearchMk(nil.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nil.get(i).m.nim),n.linearSearchMk(nil.get(i).mk.kode))+nil.get(i).nilai);
                    }                    
                    break;
                case 3:
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("************************************************");
                    System.out.println("NIM\t\tNama\tMata Kuliah\t\t\tSKS\tNilai");
                    int sks =0;
                    for(int i=0; i<nil.size();i++){
                        n.linearSearchMhs(nil.get(i).m.nim);
                        n.linearSearchMk(nil.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nil.get(i).m.nim),n.linearSearchMk(nil.get(i).mk.kode))+nil.get(i).nilai);
                    }
                    System.out.print("Masukan NIM mahasiswa : ");
                    String input = sc.next();
                    for(int i=0; i< nil.size(); i++){
                        if(input.equalsIgnoreCase(nil.get(i).m.nim)){
                            sks += n.matkul.get(i).sks;
                            n.linearSearchMhs(nil.get(i).m.nim);
                            n.linearSearchMk(nil.get(i).mk.kode);
                            System.out.println(n.toString(n.linearSearchMhs(nil.get(i).m.nim),n.linearSearchMk(nil.get(i).mk.kode))+nil.get(i).nilai);
                        }
                    }
                    System.out.println("Total SKS "+sks+" telah diambil");
                    break;
                case 4 :
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("************************************************");
                    System.out.println("NIM\t\tNama\tMata Kuliah\t\t\tSKS\tNilai");
                    nil.sort(CompNilai);

                    for(int i=0; i<nil.size(); i++){
                        n.linearSearchMhs(nil.get(i).m.nim);
                        n.linearSearchMk(nil.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nil.get(i).m.nim),n.linearSearchMk(nil.get(i).mk.kode))+nil.get(i).nilai);
                    }
                    break;
            }
        }while(pil <5);
        
        
    }
}