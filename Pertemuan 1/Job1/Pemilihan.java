import java.util.Scanner;
public class Pemilihan{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int tugas, uts, uas;
        double nAkhir;
        String nHuruf="";
        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==============================");
        System.out.print("Masukan Nilai Tugas\t: ");
        tugas=sc.nextInt();
        System.out.print("Masukan Nilai UTS\t: ");
        uts=sc.nextInt();
        System.out.print("Masukan Nilai UAS\t: ");
        uas=sc.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");
        
        nAkhir = (tugas*0.20)+(uts*0.35)+(uas*0.45);
        if(nAkhir>80&& nAkhir<=100){
            nHuruf="A";
        }else if (nAkhir>73 && nAkhir<=80){
            nHuruf="B+";
        }else if(nAkhir>65 && nAkhir<=73){
            nHuruf="B";
        }else if(nAkhir>60 && nAkhir<=65){
            nHuruf="C+";
        }else if(nAkhir>50 && nAkhir<=60){
            nHuruf="C";
        }else if(nAkhir>39 && nAkhir<=50){
            nHuruf="D";
        }else if(nAkhir<39){
            nHuruf="E";
        }
        System.out.println("Nilai akhir\t= "+(int)nAkhir);
        System.out.println("Nilai Huruf\t= "+ nHuruf);
        System.out.println("==============================");
        
        if(nAkhir>50){
            System.out.println("SELAMAT ANDA LULUS");
        }else{
            System.out.println("ANDA TIDAK LULUS");
        }
    }
}